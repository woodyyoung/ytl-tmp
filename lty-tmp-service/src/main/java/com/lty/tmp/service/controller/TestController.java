package com.lty.tmp.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lty.tmp.service.cache.TmpCache;

@RestController
@RequestMapping("test")
public class TestController {

	@Autowired
	private TmpCache cache;
	@Autowired
	private KafkaTemplate kafkaTemplate;

	protected static final Logger logger = LoggerFactory
			.getLogger(TmpCache.class);

	@GetMapping(value = "/reloadAllCache")
	public void reloadAllCache() {
		logger.info("reloadAllCache begin！----");
		cache.reloadCache();
		logger.info("reloadAllCache end！----");
	}

	@GetMapping(value = "/reloadSignCache/{type}")
	public void reloadSignCache(@PathVariable("type") Integer type) {
		logger.info("reloadSignCache begin！type:" + type + "---- ");
		if (type == 1) {
			cache.reloadCityCache();
		}
		if (type == 2) {
			cache.reloadCompnayCache();
		}
		if (type == 3) {
			cache.reloadLineCache();
		}
		if (type == 4) {
			cache.reloadDeviceCache();
		}
		if (type == 5) {
			cache.reloadLineBaseConfigVersionCache();
		}
		if (type == 6) {
			cache.reloadLineCommonConfigVersionCache();
		}
		if (type == 7) {
			cache.reloadLinePriceConfigVersionCache();
		}
		if (type == 8) {
			cache.reloadBalckListVersionCache();
		}
		if (type == 9) {
			cache.reloadFTPCache();
		}
		if (type == 10) {
			cache.reloadDeviceType();
		}
		if (type == 11) {
			cache.resetOnlineCache();
		}
		if (type == 12) {
			cache.reloadAppUpgradeVersionCache();
		}
		if (type == 13) {
			cache.reloadAdVersionVersionCache();
		}
		if (type == 14) {
			cache.reloadLineCardTypeConfigVersionCache();
		}
		logger.info("reloadSignCache end！type:" + type + "---- ");
	}

}
