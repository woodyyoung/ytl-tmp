package com.lty.tmp.service.kafak.handler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.lty.tmp.service.bean.entity.AdVersion;
import com.lty.tmp.service.bean.entity.AppUpgradeVersion;
import com.lty.tmp.service.bean.entity.FtpInfo;
import com.lty.tmp.service.bean.entity.autocreate.BlackListVersion;
import com.lty.tmp.service.bean.entity.autocreate.Device;
import com.lty.tmp.service.bean.entity.autocreate.LineVersion;
import com.lty.tmp.service.bean.entity.autocreate.UpgradeDetail;
import com.lty.tmp.service.bean.entity.autocreate.UpgradeLog;
import com.lty.tmp.service.cache.TmpCache;
import com.lty.tmp.service.common.constant.MsgType;
import com.lty.tmp.service.common.constant.UpgradeTypeEnum;
import com.lty.tmp.service.common.message.SequenceGenerator;
import com.lty.tmp.service.kafak.ReceiveHandler;
import com.lty.tmp.service.kafak.Sender;
import com.lty.tmp.service.kafak.modle.DeviceSoftwareResponse;
import com.lty.tmp.service.kafak.modle.DeviceUpgradeNotice;
import com.lty.tmp.service.kafak.modle.DeviceUpgradeNotice.UpgradeContent;
import com.lty.tmp.service.kafak.modle.Message;
import com.lty.tmp.service.kafak.modle.MessageHeader;
import com.lty.tmp.service.mapper.UpgradeDetailMapper;
import com.lty.tmp.service.mapper.UpgradeLogMapper;
import com.lty.tmp.service.service.DeviceService;
import com.lty.tmp.service.service.DeviceSoftwareService;
import com.lty.tmp.service.service.UpgradeLogService;
import com.lty.tmp.service.service.VersionService;
import com.lty.tmp.service.socket.WsPush;

@Component
public class DeviceSoftwareInfoHandler implements ReceiveHandler<DeviceSoftwareResponse> {

	private static final Logger log = LoggerFactory.getLogger(DeviceSoftwareInfoHandler.class);

	@Autowired
	private VersionService versionService;

	@Autowired
	private DeviceService deviceService;

	@Autowired
	private UpgradeLogService upgradeLogService;

	@Autowired
	private TmpCache cache;

	@Autowired
	private Sender sender;

	@Autowired
	private WsPush wsPush;

	@Autowired
	private UpgradeLogMapper upgradeLogMapper;

	@Autowired
	private UpgradeDetailMapper upgradeDetailMapper;

	@Autowired
	private DeviceSoftwareService deviceSoftwareService;

	@Autowired
	private SequenceGenerator sequenceGenerator;

	@Override
	public void handMsg(Message msg, DeviceSoftwareResponse t) {
		upgradeFlow(msg, t);
		deviceSoftwareInfo(msg, t);
	}

	private void deviceSoftwareInfo(Message msg, DeviceSoftwareResponse t) {

		log.info("TMP 接收到设备软件状态消息：" + JSON.toJSONString(msg));

		if (msg != null) {
			deviceSoftwareService.deviceSoftwareStatusService(msg, t);
		}
	}

	/**
	 * 
	 * @功能：处理升级流程
	 * 
	 *
	 * @返回：void
	 */
	public void upgradeFlow(Message msg, DeviceSoftwareResponse t) {
		log.info("hand upgrade flow begin! devsn:------" + t.getDev_sn());
		String companyCode = t.getCompany_code();
		int lineCode = t.getLine_id();
		log.info("dev sn:---" + t.getDev_sn());
		log.info("dev companyCode:---" + companyCode);
		log.info("dev lineCode:---" + t.getLine_id());

		DeviceUpgradeNotice upgradeNotice = new DeviceUpgradeNotice();
		upgradeNotice.setDev_sn(t.getDev_sn());
		List<DeviceUpgradeNotice.UpgradeContent> upgrade_list = new ArrayList<DeviceUpgradeNotice.UpgradeContent>();
		upgradeNotice.setUpgrade_list(upgrade_list);
		// 处理应用程序版本
		String appversion = t.getApp_version();
		log.info("dev appversion:---" + appversion);
		String deviceTypeCode = deviceService.getDeviceTypeByDevicSn(t.getDev_sn());
		AppUpgradeVersion sysLastAppversion = versionService.getAppUpgradeVersion(companyCode, deviceTypeCode);
		if (sysLastAppversion != null) {
			log.info("sys last appversion:---" + sysLastAppversion.getVersion());

			// 如果设备应用程序版本跟 系统最新的应该版本小 则更新
			Device device = deviceService.getDeviceBydeviceNo(t.getDev_sn());
			String id = device.getId().toString();

			if (getVersionsize(appversion, sysLastAppversion.getVersion())) {
				if (sysLastAppversion.getDeviceList().contains(id)) {
					UpgradeContent upgradeContent = new UpgradeContent();
					upgradeContent.setUpgrade_type(UpgradeTypeEnum.app.getType());
					upgradeContent.setFtp_path(sysLastAppversion.getFilePath());
					upgrade_list.add(upgradeContent);
					log.info("appversion need upgrade!");
				}
			}
		}

		// 处理广告版本
		String devAdversion = t.getMedia_version();
		AdVersion sysLastAdVersion = versionService.getAdVersion(companyCode, lineCode);

		log.info("dev adversion:---" + devAdversion);
		if (sysLastAdVersion != null) {
			log.info("sys last adversion:---" + sysLastAdVersion.getAdVersion());

			// 如果系统最新的广告版本比设备大，就通知设备更新
			if (getVersionsize(devAdversion, sysLastAdVersion.getAdVersion())) {
				UpgradeContent upgradeContent = new UpgradeContent();
				upgradeContent.setUpgrade_type(UpgradeTypeEnum.ad.getType());
				upgradeContent.setFtp_path(sysLastAdVersion.getFilePath());
				upgrade_list.add(upgradeContent);
				log.info("adversion need upgrade!");
			}
		}

		// 处理线路基本配置版本
		String lineBaseConfigVersion = t.getLine_attributes();

		LineVersion lastLineBaseConfigVersion = versionService.getLineBaseConfigVersion(companyCode, lineCode);

		log.info("dev lineBaseConfigVersion:---" + lineBaseConfigVersion);

		if (lastLineBaseConfigVersion != null) {
			log.info("sys lineBaseConfigVersion:---" + lastLineBaseConfigVersion.getVersion());
			if (getVersionsize(lineBaseConfigVersion, lastLineBaseConfigVersion.getVersion())) {
				UpgradeContent upgradeContent = new UpgradeContent();
				upgradeContent.setUpgrade_type(UpgradeTypeEnum.line_base_config.getType());
				upgradeContent.setFtp_path(lastLineBaseConfigVersion.getFilePath());
				upgrade_list.add(upgradeContent);
				log.info("lineBaseConfigVersion need upgrade!");
			}
		}

		// 处理线路通用配置版本
		String commonConfigVersion = t.getCommon_config();
		LineVersion lastLineCommonConfigVersion = versionService.getLineCommonConfigVersion(companyCode, lineCode);
		log.info("dev commonConfigVersion:---" + lineBaseConfigVersion);
		if (lastLineCommonConfigVersion != null) {
			log.info("sys commonConfigVersion:---" + lastLineCommonConfigVersion.getVersion());
			if (getVersionsize(commonConfigVersion, lastLineCommonConfigVersion.getVersion())) {
				UpgradeContent upgradeContent = new UpgradeContent();
				upgradeContent.setUpgrade_type(UpgradeTypeEnum.line_common_config.getType());
				upgradeContent.setFtp_path(lastLineCommonConfigVersion.getFilePath());
				upgrade_list.add(upgradeContent);
				log.info("commonConfigVersion need upgrade!");
			}
		}

		// 处理线路卡类配置版本
		String carTypeConfigVersion = t.getCardtype_config();
		LineVersion lastLineCardTypeVersion = versionService.getLineCardTypeVersion(companyCode, lineCode);
		log.info("dev carTypeConfigVersion:---" + carTypeConfigVersion);
		if (lastLineCardTypeVersion != null) {
			log.info("sys carTypeConfigVersion:---" + lastLineCardTypeVersion.getVersion());
			if (getVersionsize(carTypeConfigVersion, lastLineCardTypeVersion.getVersion())) {
				UpgradeContent upgradeContent = new UpgradeContent();
				upgradeContent.setUpgrade_type(UpgradeTypeEnum.line_cardtype_config.getType());
				upgradeContent.setFtp_path(lastLineCardTypeVersion.getFilePath());
				upgrade_list.add(upgradeContent);
				log.info("carTypeConfigVersion need upgrade!");

			}
		}

		// 处理票价版本
		String fareConfigVersion = t.getFare_config();
		LineVersion lastLinePriceConfigVersion = versionService.getLinePriceConfigVersion(companyCode, lineCode);
		log.info("dev fareConfigVersion:---" + fareConfigVersion);
		if (lastLinePriceConfigVersion != null) {
			log.info("sys fareConfigVersion:---" + lastLinePriceConfigVersion.getVersion());
			if (getVersionsize(fareConfigVersion, lastLinePriceConfigVersion.getVersion())) {
				UpgradeContent upgradeContent = new UpgradeContent();
				upgradeContent.setUpgrade_type(UpgradeTypeEnum.price.getType());
				upgradeContent.setFtp_path(lastLinePriceConfigVersion.getFilePath());
				upgrade_list.add(upgradeContent);
				log.info("fareConfigVersion need upgrade!");
			}
		}

		// 处理黑名单版本
		String blacklistVersion = t.getBlack_list();
		BlackListVersion lastBlacklistVersion = versionService.getBalckListVersion(companyCode);
		log.info("dev blacklistVersion:---" + blacklistVersion);
		if (lastBlacklistVersion != null) {
			log.info("sys blacklistVersion:---" + lastBlacklistVersion.getName());
			String blackVersion = StringUtils.substringBeforeLast(lastBlacklistVersion.getName(), ".");
			if (getVersionsize(blacklistVersion, blackVersion)) {
				UpgradeContent upgradeContent = new UpgradeContent();
				upgradeContent.setUpgrade_type(UpgradeTypeEnum.balck_list.getType());
				upgradeContent.setFtp_path(lastBlacklistVersion.getFileUri());
				upgrade_list.add(upgradeContent);
				log.info("blacklistVersion need upgrade!");
			}
		}

		// 如果都没有最新的版本可更新，不操作
		if (upgradeNotice.getUpgrade_list() == null || upgradeNotice.getUpgrade_list().isEmpty()) {

			log.info("no version need upgrade!");
			return;
		}

		// 生成kafak消息体
		int msg_sn = sequenceGenerator.getMsgId();
		Message sendMsg = new Message<DeviceUpgradeNotice>();
		MessageHeader header = new MessageHeader();
		header.setMsg_id(MsgType.device_upgrade_notice.getType());
		header.setMsg_sn(msg_sn);
		sendMsg.setHeader(header);

		FtpInfo ftpInfo = cache.get_ftp_configure_info();
		ftpInfo.setFtp_path(null);
		upgradeNotice.setFtpInfo(ftpInfo);
		upgradeNotice.setUpgrade_counts(upgradeNotice.getUpgrade_list().size());
		sendMsg.setBody(upgradeNotice);
		String upgradeNoticeMsg = JSON.toJSONString(sendMsg);
		log.info("upgrade notice kafka msg:---" + upgradeNoticeMsg);
		// 发送升级消息到kafka
		sender.senderMessage(upgradeNoticeMsg);

		// 保存一条升级记录
		UpgradeLog log = new UpgradeLog();
		log.setCreateDate(new Date());
		log.setUpgradeStatus(-1);
		log.setUpgradeSn(msg_sn + "");
		log.setCityCode(t.getCity_code());
		log.setCompanyCode(t.getCompany_code());
		log.setDevId(t.getDev_id() + "");
		log.setDevSn(t.getDev_sn());
		log.setLineCode(t.getLine_id());
		upgradeLogMapper.insertSelective(log);

		for (UpgradeContent content : upgradeNotice.getUpgrade_list()) {
			UpgradeDetail detail = new UpgradeDetail();
			detail.setUpgradeType(content.getUpgrade_type());
			detail.setUpgradeSn(msg_sn + "");
			detail.setDevSn(t.getDev_sn());
			detail.setFtpPath(content.getFtp_path());
			upgradeDetailMapper.insertSelective(detail);
		}

	}

	/**
	 * 
	 * @功能：判断版本是否可以升级
	 * 
	 * @param stra:终端上传的版本号
	 *            strb:tmp平台现有版本号
	 *
	 * @返回：true 可以升级,false 不可以升级
	 */
	private boolean getVersionsize(String stra, String strb) {
		String[] devVersion = stra.split("\\.");
		String[] sysVersion = strb.split("\\.");
		if (devVersion.length != 4) {
			log.error("终端的上传的版本不符合要求：" + stra);
			return false;
		}
		if (sysVersion.length != 4) {
			log.error("系统的上传的版本不符合要求：" + strb);
			return false;
		}

		for (int i = 1; i < devVersion.length; i++) {
			if (Integer.parseInt(devVersion[i]) < Integer.parseInt(sysVersion[i])) {
				return true;
			} else if (Integer.parseInt(devVersion[i]) == Integer.parseInt(sysVersion[i])) {
				continue;
			} else {
				return false;
			}
		}
		return false;
	}

}
