package com.sixthc.bpel.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.sixthc.bpel.spring.configuration.AppConfig;
import com.sixthc.bpel.spring.model.RequestLog;
import com.sixthc.bpel.spring.service.RequestLogService;

public class LogRequest {
	static RequestLogService service;
	static AbstractApplicationContext context;

	static {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		service = (RequestLogService) context.getBean("requestLogService");
	}
	
	public static void log(String messageID, String message) {
		RequestLog entry = new RequestLog(messageID, message);
		service.saveRequestLog(entry);
	}
	
	public static void main(String args[]) {
		log("12222", "testing part 2");
		log("12222", "testing part 3");
	}
}
