package com.lty.tmp.service.cache;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lty.tmp.service.bean.entity.AdVersion;
import com.lty.tmp.service.bean.entity.AppUpgradeVersion;
import com.lty.tmp.service.bean.entity.FtpInfo;
import com.lty.tmp.service.bean.entity.autocreate.BlackListVersion;
import com.lty.tmp.service.bean.entity.autocreate.City;
import com.lty.tmp.service.bean.entity.autocreate.Company;
import com.lty.tmp.service.bean.entity.autocreate.Device;
import com.lty.tmp.service.bean.entity.autocreate.DeviceType;
import com.lty.tmp.service.bean.entity.autocreate.Line;
import com.lty.tmp.service.bean.entity.autocreate.LineVersion;
import com.lty.tmp.service.service.CityService;
import com.lty.tmp.service.service.CompanyService;
import com.lty.tmp.service.service.DeviceService;
import com.lty.tmp.service.service.DeviceTypeService;
import com.lty.tmp.service.service.FTPService;
import com.lty.tmp.service.service.LineService;
import com.lty.tmp.service.service.VersionService;

@Component
public class TmpCache {
	@Autowired
	private RedisUtils redis;

	@Autowired
	private CityService cityService;

	@Autowired
	private CompanyService companyService;

	@Autowired
	private LineService lineService;

	@Autowired
	private DeviceService deviceService;

	@Autowired
	private VersionService versionService;
	@Autowired
	private FTPService fTPService;
	@Autowired
	private DeviceTypeService deviceTypeService;

	protected static final Logger logger = LoggerFactory.getLogger(TmpCache.class);

	/**
	 * 
	 * @功能：设置报文缓存数量
	 * 
	 * @返回：void
	 */
	public long increment_message_sequence_num(String message_sequence, int num) {
		return redis.increment(KeyGenerator.message_sequence_key(message_sequence), num);
	}

	/**
	 * 
	 * @功能：删除报文缓存数量
	 * 
	 * @返回：void
	 */
	public void remove_message_sequence_num(String message_sequence) {
		redis.remove(KeyGenerator.message_sequence_key(message_sequence));
	}

	/**
	 * 
	 * @功能：获取FTP参数配置
	 *
	 * @返回：FtpInfo
	 */
	public FtpInfo get_ftp_configure_info() {
		return redis.getObject(KeyGenerator.KEY_FTP_INFO, FtpInfo.class);

	}

	/**
	 * 
	 * @功能：以下四个方法为TMP开启关闭设备时的状态记录
	 * 
	 * @param context
	 *
	 * @返回：void
	 */
	public void increment_tmp_open_device(int msgSn) {
		redis.increment(KeyGenerator.tmp_open_device(msgSn), 1);
	}

	public void increment_tmp_close_device(int msgSn) {
		redis.increment(KeyGenerator.tmp_close_device(msgSn), 1);
	}

	public void remove_tmp_open_device(int msgSn) {
		redis.remove(KeyGenerator.tmp_open_device(msgSn));
	}

	public void remove_tmp_close_device(int msgSn) {
		redis.remove(KeyGenerator.tmp_close_device(msgSn));
	}

	/**
	 * 
	 * @功能： 获取公司在线设备数量
	 * 
	 *
	 * @返回：Set<String>
	 */
	public long get_company_online_num(String companyCode) {
		long company_online_num = 0;
		Set<String> keys = redis.getKeys("online_device_list:" + companyCode + "*");
		for (String key : keys) {
			Set<String> setMembers = redis.setMembers(key);
			if (setMembers == null || setMembers.isEmpty()) {
				continue;
			}
			company_online_num = company_online_num + setMembers.size();
		}
		return company_online_num;
	}

	/**
	 * 
	 * @功能： 获取在线设备列表
	 * 
	 *
	 * @返回：Set<String>
	 */
	public Set<String> get_online_device_list(String companyID, int lineID) {
		Set<String> list = redis.setMembers(KeyGenerator.online_device_list_key(companyID, lineID));
		return list;
	}

	/**
	 * 
	 * @功能：判断是否已在线
	 * 
	 * @返回：boolean true在线 false 离线
	 */
	public boolean isOnline(String companyID, int lineID, String devSn) {
		Set<String> list = redis.setMembers(KeyGenerator.online_device_list_key(companyID, lineID));
		if (list == null || list.isEmpty()) {
			return false;
		}
		return list.contains(devSn);
	}

	/**
	 * 
	 * @功能：设备上线，更新在线设备列表缓存
	 * 
	 *
	 * @返回：void
	 */
	public void deviceOnline(String companyCode, int lineID, String... deviceNo) {
		redis.setAdd(KeyGenerator.online_device_list_key(companyCode, lineID), deviceNo);
	}

	/**
	 * 
	 * @功能：设备离线更新设备缓存列表
	 * 
	 * @param context
	 *
	 * @返回：void
	 */
	public void deviceOffline(String companyID, int lineID, String... deviceNo) {
		redis.setRemove(KeyGenerator.online_device_list_key(companyID, lineID), deviceNo);
	}

	/**
	 * 
	 * @功能：重置在线数数据
	 *
	 * @返回：void
	 */
	public void resetOnlineCache() {
		redis.removePattern("company_online_device_num:*");
		redis.removePattern("line_online_device_num:*");
		redis.removePattern("online_device_list:*");
	}

	/**
	 * 
	 * @功能：更新所有缓存
	 * 
	 *
	 * @返回：void
	 */
	public void reloadCache() {
		logger.info("reload city cache begin!---");
		reloadCityCache();
		logger.info("reload company cache begin!---");
		reloadCompnayCache();
		logger.info("reload line cache begin!---");
		reloadLineCache();
		logger.info("reload device cache begin!---");
		reloadDeviceCache();
		logger.info("reload line base config cache begin!---");
		reloadLineBaseConfigVersionCache();
		logger.info("reload line common config cache begin!---");
		reloadLineCommonConfigVersionCache();
		logger.info("reload line price config cache begin!---");
		reloadLinePriceConfigVersionCache();
		logger.info("reload line cardtype config cache begin!---");
		reloadLineCardTypeConfigVersionCache();
		logger.info("reload line balcklist  cache begin!---");
		reloadBalckListVersionCache();
		logger.info("reload ftp  cache begin!---");
		reloadFTPCache();
		logger.info("reload deviceTyppe  cache begin!---");
		reloadDeviceType();
		logger.info("reload AppUpgradeVersion cache begin!---");
		reloadAppUpgradeVersionCache();
		logger.info("reload AdVersionVersion cache begin!---");
		reloadAdVersionVersionCache();
	}

	public void reloadDeviceType() {
		List<DeviceType> list = deviceTypeService.listAll();
		redis.removePattern("device_type:*");
		redis.removePattern("device_type_code:*");
		for (DeviceType deviceType : list) {
			redis.setObject(KeyGenerator.device_type_key(deviceType.getDeviceCode()), deviceType);
			redis.setString(KeyGenerator.device_type_code(deviceType.getId()), deviceType.getDeviceCode());
		}
	}

	public void reloadFTPCache() {
		FtpInfo ftpInfo = fTPService.getFtpInfo();
		redis.removePattern("FTP_KEY");
		redis.setObject(KeyGenerator.KEY_FTP_INFO, ftpInfo);
	}

	public void reloadCityCache() {
		List<City> list = cityService.listAll();
		redis.removePattern("city:*");
		redis.removePattern("city_code:*");
		for (City city : list) {
			redis.setObject(KeyGenerator.city_key(city.getCityCode()), city);
			redis.setString(KeyGenerator.city_code_key(city.getId()), city.getCityCode());
		}
	}

	public void reloadCompnayCache() {
		List<Company> list = companyService.listAll();
		redis.removePattern("company:*");
		redis.removePattern("company_code:*");
		for (Company company : list) {
			if (company.getCompanyCode() == null) {
				continue;
			}
			redis.setObject(KeyGenerator.company_key(company.getCompanyCode()), company);
			redis.setString(KeyGenerator.company_code_key(company.getId()), company.getCompanyCode());
		}
	}

	public void reloadLineCache() {
		List<Line> list = lineService.listAll();
		redis.removePattern("line:*");
		redis.removePattern("line_code:*");
		for (Line line : list) {
			String companyID = redis.getString(KeyGenerator.company_code_key(line.getCompanyId()));
			redis.setObject(KeyGenerator.line_key(companyID, line.getLineCode()), line);

			redis.setString(KeyGenerator.line_code_key(line.getId()), line.getLineCode() + "");
		}
	}

	public void reloadDeviceCache() {
		List<Device> list = deviceService.listAll();
		redis.removePattern("device:*");
		redis.removePattern("device_sn:*");
		for (Device device : list) {
			redis.setObject(KeyGenerator.device_key(device.getDeviceNo()), device);
			redis.setString(KeyGenerator.device_sn_key(device.getId()), device.getDeviceNo());
		}
	}

	public void reloadLineBaseConfigVersionCache() {
		List<LineVersion> lineBaseConfigVersion = versionService.getLineBaseConfigVersion();
		redis.removePattern("line_base_config:*");
		for (LineVersion version : lineBaseConfigVersion) {

			String companyCode = redis.getString(KeyGenerator.company_code_key(version.getCompanyId()));
			Integer lineCode = redis.getInt(KeyGenerator.line_code_key(version.getLineId()));

			redis.setObject(KeyGenerator.line_base_config_key(companyCode, lineCode), version);
		}

	}

	public void reloadAppUpgradeVersionCache() {
		List<AppUpgradeVersion> versionList = versionService.getAppUpgradeVersion();
		redis.removePattern("app_upgrade_version:*");
		for (AppUpgradeVersion version : versionList) {

			String companyCode = redis.getString(KeyGenerator.company_code_key(version.getCompanyId()));
			String deviceType = redis.getString(KeyGenerator.device_type_code(version.getDeviceType()));

			redis.setObject(KeyGenerator.app_upgrade_key(companyCode, deviceType), version);
		}

	}

	public void reloadAdVersionVersionCache() {
		List<AdVersion> versionList = versionService.getAdVersion();
		redis.removePattern("ad_version:*");
		for (AdVersion version : versionList) {

			String companyCode = redis.getString(KeyGenerator.company_code_key(version.getCompanyId()));
			Integer lineCode = redis.getInt(KeyGenerator.line_code_key(version.getTmpLineId()));

			redis.setObject(KeyGenerator.ad_version_key(companyCode, lineCode), version);
		}

	}

	public void reloadLineCommonConfigVersionCache() {
		List<LineVersion> versionList = versionService.getLineCommonConfigVersion();
		redis.removePattern("line_common_config:*");
		for (LineVersion version : versionList) {

			String companyCode = redis.getString(KeyGenerator.company_code_key(version.getCompanyId()));
			Integer lineCode = redis.getInt(KeyGenerator.line_code_key(version.getLineId()));

			redis.setObject(KeyGenerator.line_common_config_key(companyCode, lineCode), version);
		}

	}

	public void reloadLinePriceConfigVersionCache() {
		List<LineVersion> versionList = versionService.getLinePriceConfigVersion();
		redis.removePattern("line_pirce_config:*");
		for (LineVersion version : versionList) {

			String companyCode = redis.getString(KeyGenerator.company_code_key(version.getCompanyId()));
			Integer lineCode = redis.getInt(KeyGenerator.line_code_key(version.getLineId()));

			redis.setObject(KeyGenerator.line_pirce_config_key(companyCode, lineCode), version);
		}

	}

	public void reloadLineCardTypeConfigVersionCache() {
		List<LineVersion> versionList = versionService.getLineCardTypeVersion();
		redis.removePattern("line_card_type:*");
		for (LineVersion version : versionList) {

			String companyCode = redis.getString(KeyGenerator.company_code_key(version.getCompanyId()));
			Integer lineCode = redis.getInt(KeyGenerator.line_code_key(version.getLineId()));

			redis.setObject(KeyGenerator.line_card_type_key(companyCode, lineCode), version);
		}

	}

	public void reloadBalckListVersionCache() {
		List<BlackListVersion> versionList = versionService.getBalckListVersion();
		redis.removePattern("blacklist_version:*");
		for (BlackListVersion version : versionList) {
			String companyCode = redis.getString(KeyGenerator.company_code_key(version.getCompanyId()));
			redis.setObject(KeyGenerator.blacklist_version_key(companyCode), version);
		}
	}

}
