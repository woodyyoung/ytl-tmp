package com.lty.tmp.service.socket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public abstract class BasicWsHandler extends TextWebSocketHandler {

	public abstract Map<String, WebSocketSession> userMap();

	protected static final Logger logger = LoggerFactory.getLogger(BasicWsHandler.class);

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		userMap().remove(session.getId());
		logger.info(session.getRemoteAddress() + " leaved!---");
		logger.info("user size:---" + userMap().size());
	}

	public static void pushMsgToAllUser(String companyCode, TextMessage message) {
		pushMsgToAllUser(companyCode, null, message);
	}

	public static void pushMsgToAllUser(String companyCode, Integer lineCode, TextMessage message) {

		List<String> sendFailSession = new ArrayList<String>();
		// 推送消息给前端
		if (DeviceWsHandler.users.isEmpty()) {
			return;
		}

		for (Entry<String, WebSocketSession> user : DeviceWsHandler.users.entrySet()) {
			String sessionID = user.getKey();
			WebSocketSession session = user.getValue();
			if (session == null || !session.isOpen()) {
				sendFailSession.add(sessionID);
				continue;
			}
			Map<String, Object> attributes = session.getAttributes();
			if (attributes == null) {
				continue;
			}
			String company_code = (String) attributes.get(DeviceWsHandler.COMPANY_CODE);
			Integer line_code = (Integer) attributes.get(DeviceWsHandler.LINE_CODE);
			if (StringUtils.isBlank(company_code)) {
				continue;
			}
			if (!company_code.equals(companyCode)) {
				continue;
			}
			if (line_code != null && lineCode != null && !line_code.equals(lineCode)) {
				continue;
			}

			try {
				synchronized (session) {
					session.sendMessage(message);
				}
			} catch (Exception e) {
				sendFailSession.add(sessionID);
				logger.error("push msg to user error!", e);
			}
		}

		// 把发送失败的websocket会话关闭
		for (String sessionID : sendFailSession) {
			WebSocketSession session = DeviceWsHandler.users.get(sessionID);
			if (session == null) {
				continue;
			}
			try {
				session.close();
			} catch (IOException e) {
				logger.error("push msg to user close session error!", e);
			}
			DeviceWsHandler.users.remove(sessionID);
		}
	}

}
