package com.sixthc.bpel.spring.service;

import com.sixthc.bpel.spring.model.MessageLog;
import com.sixthc.bpel.spring.model.PkgGroup;

public interface MessageLogService {
	
	void saveMessageLog(MessageLog log);
	void updateMessageLog(MessageLog log);
	public PkgGroup getPkgGroup(String pkgName, String pkgGroupName) ;
}
