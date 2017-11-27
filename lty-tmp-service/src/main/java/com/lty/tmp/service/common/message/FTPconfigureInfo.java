package com.lty.tmp.service.common.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lty.tmp.service.bean.entity.FtpInfo;
import com.lty.tmp.service.cache.TmpCache;

/**
 * 
 * @描述: 获取ftp信息
 * @作者: jianjun.liu
 * @创建时间: 2017年10月24日
 * @版本: 1.0
 */
@Component
public class FTPconfigureInfo {

	@Autowired
	private TmpCache tmpCache;

	public FtpInfo getFTPconfigureInfo() {
		FtpInfo FtpInfo = tmpCache.get_ftp_configure_info();
		return FtpInfo;
	}
}
