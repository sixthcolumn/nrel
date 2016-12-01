package com.sixthc.bpel.spring.dao;

import java.util.List;

import com.sixthc.bpel.spring.model.RequestLog;



public interface RequestLogDao {

	public void save(RequestLog log);
	public void update(RequestLog log);
	public void delete(RequestLog log);
	public RequestLog findById(int id);
	public long getMessageIdSequence();
	public void saveOrUpdate(RequestLog log);
	public List<RequestLog> findByMessageID(String messageID);
}
