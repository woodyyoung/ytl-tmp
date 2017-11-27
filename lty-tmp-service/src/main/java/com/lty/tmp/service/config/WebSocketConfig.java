package com.lty.tmp.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.lty.tmp.service.socket.DeviceWsHandler;
import com.lty.tmp.service.socket.WsHandlerInterceptor;

/**
 * websocket配置
 * 
 * @描述:
 * @作者: hgy
 * @创建时间: 2017年9月26日
 * @版本: 1.0
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		// 设备GIS监控页面
		registry.addHandler(lineWsHandler(), "/deviceWs")
				.addInterceptors(wsInterceptor()).setAllowedOrigins("*");

	}

	@Bean
	public WebSocketHandler lineWsHandler() {
		return new DeviceWsHandler();
	}

	@Bean
	public WsHandlerInterceptor wsInterceptor() {
		return new WsHandlerInterceptor();
	}

}
