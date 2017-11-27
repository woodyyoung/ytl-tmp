package com.lty.tmp.service.kafak.handler;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.lty.tmp.service.bean.entity.autocreate.Company;
import com.lty.tmp.service.bean.entity.autocreate.Device;
import com.lty.tmp.service.bean.entity.autocreate.LoginRecord;
import com.lty.tmp.service.bean.entity.autocreate.LoginnoexistRecord;
import com.lty.tmp.service.cache.TmpCache;
import com.lty.tmp.service.common.constant.MsgType;
import com.lty.tmp.service.kafak.ReceiveHandler;
import com.lty.tmp.service.kafak.Sender;
import com.lty.tmp.service.kafak.modle.LoginRequest;
import com.lty.tmp.service.kafak.modle.LoginResponse;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.kafak.modle.MessageHeader;
import com.lty.tmp.service.mapper.CompanyMapper;
import com.lty.tmp.service.mapper.DeviceMapper;
import com.lty.tmp.service.mapper.LoginRecordMapper;
import com.lty.tmp.service.mapper.LoginnoexistRecordMapper;
import com.lty.tmp.service.service.CityService;
import com.lty.tmp.service.service.CompanyService;
import com.lty.tmp.service.service.DeviceService;
import com.lty.tmp.service.service.DeviceTypeService;
import com.lty.tmp.service.service.LineService;
import com.lty.tmp.service.socket.WsPush;

@Component
public class DeviceLoginHandler implements ReceiveHandler<LoginRequest> {
	private static final Logger LOG = LoggerFactory
			.getLogger(DeviceLoginHandler.class);

	private final int LOGIN_TRUE = 0;
	private final int LOGIN_FALSE = 1;
	@Autowired
	private Sender sender;
	@Autowired
	LoginRecordMapper loginRecordMapper;
	@Autowired
	LoginnoexistRecordMapper loginnoexistRecordMapper;
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private DeviceMapper deviceMapper;
	@Autowired
	private WsPush wsPush;
	@Autowired
	private TmpCache tmpCache;
	@Autowired
	private CompanyMapper companyMapper;
	@Autowired
	private CompanyService companyService;
	@Autowired
	private LineService lineService;
	@Autowired
	private CityService cityService;
	@Autowired
	private DeviceTypeService deviceTypeService;

	@Override
	@SuppressWarnings("unchecked")
	public void handMsg(Message msg, LoginRequest t) {

		LOG.info("Start processing login business......");

		MessageHeader messageHeader = msg.getHeader();
		LoginRecord loginRecord = t.buildLoginRecord();
		Message responseMsg = new Message();
		MessageHeader header = new MessageHeader();
		header.setMsg_sn(messageHeader.getMsg_sn());// 报文序列号
		LoginResponse responsebody = new LoginResponse();
		String cityCode = t.getCity_code();
		String companyCode = t.getCompany_code();
		Integer lineID = t.getLine_id();
		String devSn = t.getDev_sn();
		// 设置参数值
		LOG.info("设备上传的登录请求信息:---" + JSON.toJSONString(loginRecord));
		// 1>将登录请求信息存入登录记录表中
		loginRecordMapper.insertSelective(loginRecord);
		// 2>验证是否存在此序列号
		String deviceSn = t.getDev_sn();
		// 如果设备 序列号不存在
		if (!deviceService.exist(deviceSn)) {
			LOG.info("此设备不存在于TMP平台,不可以登录:---");
			// 不可以登录
			LoginnoexistRecord record = t.bulidLoingNoRecord();
			loginnoexistRecordMapper.insertSelective(record);
			// 设置返回参数
			header.setMsg_id(MsgType.login_response.getType());
			responsebody.setErr_code(LOGIN_FALSE);
			responsebody.setDev_sn(deviceSn);
			responseMsg.setHeader(header);
			responseMsg.setBody(responsebody);
			sender.senderMessage(JSON.toJSONString(responseMsg));
			return;
		}

		LOG.info("设备已存在于缓存中,可以登录---");
		Device device = deviceService.getDeviceBydeviceNo(deviceSn);
		if (device.getCompanyId() == null) {
			LOG.info("设备第一次登录更新城市、公司、线路等字段---");
			device.setCityId(cityService.getCity(cityCode).getId());
			device.setCompanyId(companyService.getCompany(companyCode).getId());
			device.setLineId(lineService.getLine(companyCode, lineID).getId());
			device.setDeviceTypeId(deviceTypeService.getDeviceType(
					t.getDev_model()).getId());
			device.setTbpStatus(t.getEnable_tbp());
			device.setDeviceNo(t.getDev_sn());
			device.setDeviceId(Integer.toString(t.getDev_id()));
			LOG.info("设备是第一次登录,修改设备基础信息为:---" + JSON.toJSONString(device));
		}
		device.setLastLoginTime(new Date());
		deviceService.updateDevice(device);

		// 更新在线缓存信息
		if (!tmpCache.isOnline(companyCode, lineID, devSn)) {
			tmpCache.deviceOnline(companyCode, lineID, devSn);
			// 设备上线
			wsPush.deviceOnline(companyCode, lineID, devSn);
		}

		header.setMsg_id(MsgType.login_response.getType());
		Company company = companyService.getCompany(companyCode);
		responsebody.setDispatch_ip(company.getDispatchIpAddress());
		responsebody.setDispatch_port(company.getDispatchPort());
		responsebody.setMedia_ip(company.getVideoIpAddress());
		responsebody.setMedia_port(company.getVideoPort());
		responsebody.setTbp_ip(company.getTbpIpAddress());
		responsebody.setTbp_port(company.getTbpPort());
		responsebody.setDev_sn(deviceSn);
		responsebody.setErr_code(LOGIN_TRUE);
		header.setMsg_id(MsgType.login_response.getType());
		header.setMsg_sn(messageHeader.getMsg_sn());
		responseMsg.setHeader(header);
		responseMsg.setBody(responsebody);

		LOG.info("登录成功发送至kafka的消息:---" + JSON.toJSONString(responseMsg));

		sender.senderMessage(JSON.toJSONString(responseMsg));

	}

}
