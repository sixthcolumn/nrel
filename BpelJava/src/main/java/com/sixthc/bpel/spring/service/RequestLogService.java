package com.sixthc.bpel.spring.service;

import com.sixthc.bpel.spring.model.RequestLog;
import com.sixthc.bpel.spring.model.PkgGroup;

public interface RequestLogService {

	void saveRequestLog(RequestLog log);

	void updateRequestLog(RequestLog log);

	public String getURLByVendor(String vendor, String user, String operationName) throws VendorLookupException;
}
