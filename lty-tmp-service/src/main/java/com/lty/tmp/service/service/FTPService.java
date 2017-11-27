package com.lty.tmp.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lty.tmp.service.bean.entity.FtpInfo;
import com.lty.tmp.service.bean.entity.autocreate.ParamConfig;
import com.lty.tmp.service.bean.entity.autocreate.ParamConfigExample;
import com.lty.tmp.service.mapper.ParamConfigMapper;

@Service
public class FTPService {
	@Autowired
	private ParamConfigMapper paramConfigMapper;

	public FtpInfo getFtpInfo() {
		FtpInfo ftpInfo = new FtpInfo();

		ParamConfigExample example = new ParamConfigExample();
		example.createCriteria().andKeyLike("tmp_ftp_%");
		List<ParamConfig> list = paramConfigMapper.selectByExample(example);
		for (ParamConfig config : list) {
			if (config.getKey().equals("tmp_ftp_ip")) {
				ftpInfo.setFtp_ip(config.getValue());
			}
			if (config.getKey().equals("tmp_ftp_port")) {
				ftpInfo.setFtp_port(Integer.parseInt(config.getValue()));
			}
			if (config.getKey().equals("tmp_ftp_user")) {
				ftpInfo.setFtp_user(config.getValue());
			}
			if (config.getKey().equals("tmp_ftp_password")) {
				ftpInfo.setFtp_password(config.getValue());
			}
			if (config.getKey().equals("tmp_ftp_path")) {
				ftpInfo.setFtp_path(config.getValue());
			}

		}

		return ftpInfo;
	}

}
