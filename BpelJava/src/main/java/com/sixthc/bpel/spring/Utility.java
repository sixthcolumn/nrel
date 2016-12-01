package com.sixthc.bpel.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.sixthc.bpel.spring.configuration.AppConfig;
import com.sixthc.bpel.spring.model.RequestLog;
import com.sixthc.bpel.spring.service.RequestLogService;
import com.sixthc.bpel.spring.service.VendorLookupException;

public class Utility {
	static RequestLogService service;
	static AbstractApplicationContext context;

	static {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		service = (RequestLogService) context.getBean("requestLogService");
	}
	
	public static String log(String messageID, String message) {
		RequestLog entry = new RequestLog(messageID, message);
		service.saveRequestLog(entry);
		return messageID + ":" + message;
	}
	
	public static String getURLByVendor(String vendor, String user, String operationName) {
		try {
			return service.getURLByVendor(vendor, user, operationName);
		} catch (VendorLookupException e) {
			throw new RuntimeException(e.getMessage());		
		}
	}
	
	public static void main(String args[]) {
		String logResponse;
		logResponse = log("12222", "testing part 2");
		System.out.println("log response : " + logResponse);
		
		logResponse = log("12222", "testing part 3");
		System.out.println("log response : " + logResponse);
		
		String vendorURL = getURLByVendor("adms", "adms1", "CIM_DER (createDERGroupDispatch)");
		System.out.println("vendor url : " + vendorURL);
	}
}
