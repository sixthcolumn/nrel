package com.sixthc.bpel.spring.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sixthc.bpel.spring.dao.RequestLogDao;
import com.sixthc.bpel.spring.model.RequestLog;

@Service("requestLogService")
@Transactional
public class RequestLogServiceImpl implements RequestLogService {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(RequestLogServiceImpl.class);

	@Autowired
	private RequestLogDao dao;

	public void saveRequestLog(RequestLog logEntry) {
		log.debug("save : " + logEntry);
		dao.save(logEntry);
	}

	public void updateRequestLog(RequestLog logEntry) {
		log.debug("update : " + logEntry);
		dao.update(logEntry);
	}
}
