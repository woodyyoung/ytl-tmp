package com.lty.tmp.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.lty.tmp.service.mapper")
@EnableCaching
public class TmpServiceApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(TmpServiceApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(TmpServiceApplication.class);
	}
}
