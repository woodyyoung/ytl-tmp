package com.lty.tmp.service.cache;

public class KeyGenerator {
	// TMP开启关闭设备状态缓存
	public static final String KEY_OPEN_DEVICE = "tmp_open_device_msg_sn:%s";
	public static final String KEY_CLOSE_DEVICE = "tmp_close_device_msg_sn:%s";
	// FTP参数缓存
	public static final String KEY_FTP_INFO = "FTP_KEY";
	// 报文序列号缓存
	public static final String KEY_MESSAGE_SEQUENCE = "MESSAGE_SEQUENCE";
	// 缓存城市的key2
	public static final String KEY_CITY = "city:%s";
	public static final String KEY_CITY_CODE = "city_code:%s";

	// 缓存公司的key
	public static final String KEY_COMPANY = "company:%s";
	public static final String KEY_COMPANY_CODE = "company_code:%s";

	// 缓存线路的key
	public static final String KEY_LINE = "line:%s:%s";
	public static final String KEY_LINE_CODE = "line_code:%s";

	// 缓存设备
	public static final String KEY_DEVICE = "device:%s";
	public static final String KEY_DEVICE_SN = "device_sn:%s";

	// 设备类型
	public static final String KEY_DEVICE_TYPE = "device_type:%s";
	public static final String KEY_DEVICE_TYPE_CODE = "device_type_code:%s";

	// 公司在线设备数量key
	public static final String KEY_COMPANY_ONLINE_DEVICE_NUM = "company_online_device_num:%s";
	// 线路在线设备数量key
	public static final String KEY_LINE_ONLINE_DEVICE_NUM = "line_online_device_num:%s:%s";
	// 线路在线设备列表key
	public static final String KEY_ONLINE_DEVICE_LIST = "online_device_list:%s:%s";
	// 广告版本key
	public static final String KEY_AD_VERSION = "ad_version:%s:%s";
	// 黑名单版本key
	public static final String KEY_BLACKLIST_VERSION = "blacklist_version:%s";
	// 应用程序版本key
	public static final String KEY_APP_UPGRADE_VERSION = "app_upgrade_version:%s:%s";
	// 线路基本属性配置版本key
	public static final String KEY_LINE_BASE_CONFIG = "line_base_config:%s:%s";
	// 线路公用属性配置版本key
	public static final String KEY_LINE_COMMON_CONFIG = "line_common_config:%s:%s";
	// 线路票价版本配置key
	public static final String KEY_LINE_PIRCE_CONFIG = "line_pirce_config:%s:%s";

	// 线路卡类配置
	public static final String KEY_CARD_TYPE_CONFIG = "line_card_type:%s:%s";

	public static String tmp_close_device(int msgSn) {
		return String.format(KEY_CLOSE_DEVICE, msgSn);
	}

	public static String tmp_open_device(int msgSn) {
		return String.format(KEY_OPEN_DEVICE, msgSn);
	}

	public static String message_sequence_key(String MESSAGE_SEQUENCE) {
		return String.format(KEY_MESSAGE_SEQUENCE, MESSAGE_SEQUENCE);
	}

	public static String city_key(String cityCode) {
		return String.format(KEY_CITY, cityCode);
	}

	public static String city_code_key(int cityID) {
		return String.format(KEY_CITY_CODE, cityID + "");
	}

	public static String company_key(String companyID) {
		return String.format(KEY_COMPANY, companyID);
	}

	public static String company_code_key(int companyID) {
		return String.format(KEY_COMPANY_CODE, companyID + "");
	}

	public static String line_key(String companyID, int lineCode) {
		return String.format(KEY_LINE, companyID, lineCode + "");
	}

	public static String line_code_key(int lineID) {
		return String.format(KEY_LINE_CODE, lineID + "");
	}

	public static String device_key(String deviceSn) {
		return String.format(KEY_DEVICE, deviceSn);
	}

	public static String device_sn_key(int deviceid) {
		return String.format(KEY_DEVICE_SN, deviceid);
	}

	public static String company_online_device_num_key(String companyCode) {
		return String.format(KEY_COMPANY_ONLINE_DEVICE_NUM, companyCode);
	}

	public static String line_online_device_num_key(String companyCode, int lineCode) {
		return String.format(KEY_LINE_ONLINE_DEVICE_NUM, companyCode, lineCode + "");
	}

	public static String online_device_list_key(String companyCode, int lineCode) {
		return String.format(KEY_ONLINE_DEVICE_LIST, companyCode, lineCode + "");
	}

	public static String ad_version_key(String companyCode, int lineCode) {
		return String.format(KEY_AD_VERSION, companyCode, lineCode + "");
	}

	public static String blacklist_version_key(String companyCode) {
		return String.format(KEY_BLACKLIST_VERSION, companyCode);
	}

	public static String app_upgrade_key(String companyCode, String deviceType) {
		return String.format(KEY_APP_UPGRADE_VERSION, companyCode, deviceType);
	}

	public static String line_base_config_key(String companyCode, int lineCode) {
		return String.format(KEY_LINE_BASE_CONFIG, companyCode, lineCode + "");
	}

	public static String line_common_config_key(String companyCode, int lineCode) {
		return String.format(KEY_LINE_COMMON_CONFIG, companyCode, lineCode + "");
	}

	public static String line_pirce_config_key(String companyCode, int lineCode) {
		return String.format(KEY_LINE_PIRCE_CONFIG, companyCode, lineCode + "");
	}

	public static String line_card_type_key(String companyCode, int lineCode) {
		return String.format(KEY_CARD_TYPE_CONFIG, companyCode, lineCode + "");
	}

	public static String device_type_key(String deviceTypeCode) {
		return String.format(KEY_DEVICE_TYPE, deviceTypeCode);
	}

	public static String device_type_code(int device_type_id) {
		return String.format(KEY_DEVICE_TYPE_CODE, device_type_id + "");
	}

}
