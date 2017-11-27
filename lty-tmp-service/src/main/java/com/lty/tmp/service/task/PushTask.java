package com.lty.tmp.service.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lty.tmp.service.cache.TmpCache;
import com.lty.tmp.service.kafak.Sender;

@EnableScheduling
@Component
public class PushTask {
	protected static final Logger logger = LoggerFactory
			.getLogger(PushTask.class);

	@Autowired
	private Sender sender;
	@Autowired
	private TmpCache cache;

	/**
	 * 
	 * @功能：每天晚上3点定时更新缓存
	 * 
	 * @param context
	 *
	 * @返回：void
	 */
	@Scheduled(cron = "0 0 3 * * ?")
	public void upateCache() {
		logger.info("update cache task begin!--------");
		cache.reloadCache();
		logger.info("update cache task end!--------");
	}

	/**
	 * 
	 * @功能：每天晚上3点半定时更新在线信息缓存
	 * 
	 * @param context
	 *
	 * @返回：void
	 */
	@Scheduled(cron = "0 30 3 * * ?")
	public void upateOnlineCache() {
		logger.info("update oline cache task begin!--------");
		cache.resetOnlineCache();
		logger.info("update oline cache task end!--------");
	}

}
