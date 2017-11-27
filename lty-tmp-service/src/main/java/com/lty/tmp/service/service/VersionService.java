package com.lty.tmp.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lty.tmp.service.bean.entity.AdVersion;
import com.lty.tmp.service.bean.entity.AppUpgradeVersion;
import com.lty.tmp.service.bean.entity.autocreate.BlackListVersion;
import com.lty.tmp.service.bean.entity.autocreate.LineVersion;
import com.lty.tmp.service.cache.KeyGenerator;
import com.lty.tmp.service.cache.RedisUtils;
import com.lty.tmp.service.common.constant.LineConfigTypeEnum;
import com.lty.tmp.service.mapper.VersionMapper;

@Service
public class VersionService {
	@Autowired
	private VersionMapper versionMapper;
	@Autowired
	private RedisUtils redis;

	public List<AdVersion> getAdVersion() {
		return versionMapper.getAdVersion();
	}

	public List<AppUpgradeVersion> getAppUpgradeVersion() {
		return versionMapper.getAppUpgradeVersion();
	}

	public AppUpgradeVersion getAppUpgradeVersion(String companyCode,
			String deviceType) {
		return redis.getObject(
				KeyGenerator.app_upgrade_key(companyCode, deviceType),
				AppUpgradeVersion.class);
	}

	public AdVersion getAdVersion(String companyCode, int lineCode) {
		AdVersion ad = redis.getObject(
				KeyGenerator.ad_version_key(companyCode, lineCode),
				AdVersion.class);
		return ad;
	}

	public List<LineVersion> getLineVersion(String xmlType) {
		return versionMapper.getLineVersion(xmlType);
	}

	public List<LineVersion> getLineBaseConfigVersion() {
		return versionMapper.getLineVersion(LineConfigTypeEnum.LINE_BASE_CONFIG
				.getCode());
	}

	public List<LineVersion> getLineCommonConfigVersion() {
		return versionMapper
				.getLineVersion(LineConfigTypeEnum.LINE_COMMON_CONFIG.getCode());
	}

	public List<LineVersion> getLinePriceConfigVersion() {
		return versionMapper
				.getLineVersion(LineConfigTypeEnum.LINE_PRICE_CONFIG.getCode());
	}

	public List<LineVersion> getLineCardTypeVersion() {
		return versionMapper.getLineVersion(LineConfigTypeEnum.LINE_CARD_CONFIG
				.getCode());
	}

	public List<BlackListVersion> getBalckListVersion() {
		return versionMapper.getBlackListVersion();
	}

	public BlackListVersion getBalckListVersion(String companyCode) {
		return redis.getObject(KeyGenerator.blacklist_version_key(companyCode),
				BlackListVersion.class);
	}

	public LineVersion getLineBaseConfigVersion(String companyCode, int lineCode) {
		return redis.getObject(
				KeyGenerator.line_base_config_key(companyCode, lineCode),
				LineVersion.class);
	}

	public LineVersion getLineCommonConfigVersion(String companyCode,
			int lineCode) {
		return redis.getObject(
				KeyGenerator.line_common_config_key(companyCode, lineCode),
				LineVersion.class);
	}

	public LineVersion getLinePriceConfigVersion(String companyCode,
			int lineCode) {
		return redis.getObject(
				KeyGenerator.line_pirce_config_key(companyCode, lineCode),
				LineVersion.class);
	}

	public LineVersion getLineCardTypeVersion(String companyCode, int lineCode) {
		return redis.getObject(
				KeyGenerator.line_card_type_key(companyCode, lineCode),
				LineVersion.class);
	}

}
