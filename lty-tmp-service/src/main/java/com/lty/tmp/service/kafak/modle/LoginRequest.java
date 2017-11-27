package com.lty.tmp.service.kafak.modle;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lty.tmp.service.bean.entity.autocreate.Device;
import com.lty.tmp.service.bean.entity.autocreate.LoginRecord;
import com.lty.tmp.service.bean.entity.autocreate.LoginnoexistRecord;

/**
 * kafka登录请求消费消息体
 * 
 * @描述:
 * @作者: liujianjun
 * @创建时间: 2017年10月16日
 * @版本: 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginRequest extends DeviceToTmpBaseModle {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	private Date time;// 上线时间

	private Integer disc_reason;

	private String dev_model;

	// sim卡序列号
	private String sim_sn;

	// 当天电源重启次数
	private Integer reset_counts;

	// 本次电源开启后网络连接次数，电源重启后清 0
	private Integer conn_counts;

	// TBP连接状态，0:表示设备已停用状态；1:表示设备已启用状态
	private Integer enable_tbp;

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getDisc_reason() {
		return disc_reason;
	}

	public void setDisc_reason(Integer disc_reason) {
		this.disc_reason = disc_reason;
	}

	public String getDev_model() {
		return dev_model;
	}

	public void setDev_model(String dev_model) {
		this.dev_model = dev_model;
	}

	public String getSim_sn() {
		return sim_sn;
	}

	public void setSim_sn(String sim_sn) {
		this.sim_sn = sim_sn;
	}

	public Integer getReset_counts() {
		return reset_counts;
	}

	public void setReset_counts(Integer reset_counts) {
		this.reset_counts = reset_counts;
	}

	public Integer getConn_counts() {
		return conn_counts;
	}

	public void setConn_counts(Integer conn_counts) {
		this.conn_counts = conn_counts;
	}

	public Integer getEnable_tbp() {
		return enable_tbp;
	}

	public void setEnable_tbp(Integer enable_tbp) {
		this.enable_tbp = enable_tbp;
	}

	public LoginRecord buildLoginRecord() {
		LoginRecord record = new LoginRecord();
		record.setCityCode(this.getCity_code());
		record.setCompanyCode(this.getCompany_code());
		record.setConnCounts(conn_counts);
		record.setDevId(this.getDev_id());
		record.setDevSn(this.getDev_sn());
		record.setDiscReason(disc_reason);
		record.setLineId(this.getLine_id());
		record.setResetCounts(reset_counts);
		record.setSimSn(sim_sn);
		record.setTime(time);
		record.setDevModel(dev_model);
		record.setEnableTbp(enable_tbp);
		record.setCreateDate(new Date());
		return record;
	}

	public LoginnoexistRecord bulidLoingNoRecord() {
		LoginnoexistRecord record = new LoginnoexistRecord();
		record.setCityCode(this.getCity_code());
		record.setDevSn(this.getDev_sn());
		record.setLineId(this.getLine_id());
		record.setDevId(this.getDev_id());
		record.setCreateDate(new Date());

		return record;
	}

	public Device bulidDevice() {
		Device device = new Device();
		device.setLastLoginTime(time);
		device.setTbpStatus(enable_tbp);

		return device;
	}

}
