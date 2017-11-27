package com.lty.tmp.service.socket;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

public class WsHandlerInterceptor implements HandshakeInterceptor {
	protected static final Logger logger = LoggerFactory
			.getLogger(WsHandlerInterceptor.class);

	@Override
	public boolean beforeHandshake(ServerHttpRequest request,
			ServerHttpResponse response, WebSocketHandler wsHandler,
			Map<String, Object> attributes) throws Exception {
		String companyID = "";
		if (request instanceof ServletServerHttpRequest) {
			ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
			companyID = servletRequest.getServletRequest().getParameter(
					DeviceWsHandler.COMPANY_CODE);
			attributes.put(DeviceWsHandler.COMPANY_CODE, companyID);
			if(StringUtils.isBlank(companyID)){
				logger.error("handshake error! companyID is empty!--" );
				return false;
			}
			logger.info("companyID:" + companyID);
		}
		return true;
	}

	@Override
	public void afterHandshake(ServerHttpRequest request,
			ServerHttpResponse response, WebSocketHandler wsHandler,
			Exception exception) {

	}

}
