package com.lty.tmp.service.kafak;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.lty.tmp.service.kafak.modle.Message;

@Component
public class Receiver {
	protected static final Logger logger = LoggerFactory.getLogger(Receiver.class);
	@Autowired
	private ReceiveHandlerAdapter adapter;

	@KafkaListener(topics = { "TMP_Topic_OnlineStatus", "TMP_Topic_DevResp", "TMP_Topic_HardwareStatus" })
	public void processMessage(String content)
			throws ClassNotFoundException, JsonParseException, JsonMappingException, IOException {
		process(content);
	}

	public void process(String content)
			throws ClassNotFoundException, JsonParseException, JsonMappingException, IOException {
		Message msg = JSON.parseObject(content, Message.class);
		ReceiveHandler handler = adapter.getHandlerAdapter(msg);
		if (handler == null) {
			return;
		}
		String className = ((ParameterizedType) handler.getClass().getGenericInterfaces()[0])
				.getActualTypeArguments()[0].getTypeName();
		Object javaObject = JSONObject.toJavaObject((JSON) msg.getBody(), Class.forName(className));
		handler.handMsg(msg, javaObject);
	}

}
