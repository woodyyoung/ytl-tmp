package com.lty.tmp.service.kafak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {

	@Autowired
	private KafkaTemplate kafkaTemplate;

	/**
	 * @功能：登录应答方法
	 * @param context
	 * @author LiuJianJun
	 * @返回：void
	 */
	public void senderMessage(String msg) {
		// kafkaTemplate.send("TMP_Topic_ToDev", 0, msg);
		kafkaTemplate.send("TMP_Topic_ToDev", msg);
	}

}
