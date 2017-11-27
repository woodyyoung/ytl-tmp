package com.lty.tmp.service.socket;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;

import com.alibaba.fastjson.JSON;
import com.lty.tmp.service.cache.KeyGenerator;
import com.lty.tmp.service.cache.RedisUtils;
import com.lty.tmp.service.kafak.modle.DeviceFactoryOutResponse;
import com.lty.tmp.service.kafak.modle.DeviceHardwareResponse;
import com.lty.tmp.service.kafak.modle.DeviceSoftwareResponse;
import com.lty.tmp.service.socket.util.EnumMsgType;
import com.lty.tmp.service.socket.util.WsResponse;
import com.lty.tmp.service.socket.util.WsResponse.DeviceOnlineStatus;

@Component
public class WsPush {
	@Autowired
	private RedisUtils redis;

	/**
	 * 
	 * @功能：设备上线
	 * 
	 * @返回：void
	 */
	public void deviceOnline(String companyCode, int lineCode, String devSn) {
		pushDeviceStatus(companyCode, lineCode, devSn, 1);
	}

	/**
	 * 
	 * @功能：设备离线
	 * 
	 * @返回：void
	 */
	public void deviceOffline(String companyCode, int lineCode, String devSn) {
		pushDeviceStatus(companyCode, lineCode, devSn, 0);
	}

	private void pushDeviceStatus(String companyCode, int lineCode, String devSn, int status) {
		WsResponse response = new WsResponse();
		response.setMsg_type(EnumMsgType.TYPE_101.getCode());
		response.setCompanyCode(companyCode);
		response.setlineCode(lineCode);
		// 设置公司在线设备数量
		long company_online_num = 0;
		Set<String> keys = redis.getKeys("online_device_list:" + companyCode + "*");
		for (String key : keys) {
			Set<String> setMembers = redis.setMembers(key);
			if (setMembers == null || setMembers.isEmpty()) {
				continue;
			}
			company_online_num = company_online_num + setMembers.size();
		}
		response.setCompnay_online_num(company_online_num);

		// 设置线路在线设备数量
		Set<String> lineMembers = redis.setMembers(KeyGenerator.online_device_list_key(companyCode, lineCode));
		if (lineMembers == null || lineMembers.isEmpty()) {
			response.setLine_online_num(0);
		} else {
			response.setLine_online_num(lineMembers.size());
		}

		DeviceOnlineStatus devStatus = new DeviceOnlineStatus();
		devStatus.setDevice_sn(devSn);
		devStatus.setStatus(status);
		List<DeviceOnlineStatus> list = new ArrayList<WsResponse.DeviceOnlineStatus>();
		list.add(devStatus);
		response.setData(list);
		String msg = JSON.toJSONString(response);
		TextMessage txt = new TextMessage(msg);
		BasicWsHandler.pushMsgToAllUser(companyCode, lineCode, txt);
	}

	/**
	 * 
	 * @功能：推送设备软件状态信息
	 *
	 * @返回：void
	 */
	public void pushDeviceSoftwareInfo(String companyCode, int lineCode, String devSn,
			DeviceSoftwareResponse deviceSoftwareResponse) {
		WsResponse response = new WsResponse();
		response.setMsg_type(EnumMsgType.TYPE_106.getCode());
		response.setDeviceSn(devSn);
		response.setData(deviceSoftwareResponse);
		String msg = JSON.toJSONString(response);
		TextMessage txt = new TextMessage(msg);
		BasicWsHandler.pushMsgToAllUser(companyCode, lineCode, txt);
	}

	/**
	 * 
	 * @功能：推送设备硬件状态信息
	 *
	 * @返回：void
	 */
	public void pushDeviceHardwareInfo(String companyCode, int lineCode, String devSn,
			DeviceHardwareResponse deviceHardwareResponse) {
		WsResponse response = new WsResponse();
		response.setMsg_type(EnumMsgType.TYPE_107.getCode());
		response.setDeviceSn(devSn);
		response.setData(deviceHardwareResponse);
		String msg = JSON.toJSONString(response);
		TextMessage txt = new TextMessage(msg);
		BasicWsHandler.pushMsgToAllUser(companyCode, lineCode, txt);
	}

	/**
	 * 
	 * @功能：推送设备出厂状态信息
	 *
	 * @返回：void
	 */
	public void pushDeviceFactoryOutInfo(String companyCode, int lineCode, String devSn,
			DeviceFactoryOutResponse deviceFactoryOutResponse) {
		WsResponse response = new WsResponse();
		response.setMsg_type(EnumMsgType.TYPE_108.getCode());
		response.setDeviceSn(devSn);
		response.setData(deviceFactoryOutResponse);
		String msg = JSON.toJSONString(response);
		TextMessage txt = new TextMessage(msg);
		BasicWsHandler.pushMsgToAllUser(companyCode, lineCode, txt);
	}

	/**
	 * 
	 * @功能：推送启用、停用设备结果
	 *
	 * @返回：void
	 */
	public void pushOpenCloseDeviceResult(String companyCode, int lineCode, String devSn, int result) {
		WsResponse response = new WsResponse();
		response.setMsg_type(EnumMsgType.TYPE_110.getCode());
		response.setDeviceSn(devSn);
		response.setDeviceResult(result);
		String msg = JSON.toJSONString(response);
		TextMessage txt = new TextMessage(msg);
		BasicWsHandler.pushMsgToAllUser(companyCode, lineCode, txt);
	}

	/**
	 * 
	 * @功能：推送设备上传日志结果
	 *
	 * @返回：void
	 */
	public void pushLogUploadResult(String companyCode, int lineCode, String devSn, int result) {
		WsResponse response = new WsResponse();
		response.setMsg_type(EnumMsgType.TYPE_112.getCode());
		response.setDeviceSn(devSn);
		response.setDeviceResult(result);
		String msg = JSON.toJSONString(response);
		TextMessage txt = new TextMessage(msg);
		BasicWsHandler.pushMsgToAllUser(companyCode, lineCode, txt);
	}

}
