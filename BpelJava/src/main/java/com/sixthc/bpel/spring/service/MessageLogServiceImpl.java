package com.sixthc.bpel.spring.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sixthc.bpel.spring.dao.MessageDao;
import com.sixthc.bpel.spring.dao.MessageLogDao;
import com.sixthc.bpel.spring.dao.PkgDao;
import com.sixthc.bpel.spring.dao.PkgGroupDao;
import com.sixthc.bpel.spring.model.Message;
import com.sixthc.bpel.spring.model.MessageLog;
import com.sixthc.bpel.spring.model.Pkg;
import com.sixthc.bpel.spring.model.PkgGroup;

@Service("messageLogService")
@Transactional
public class MessageLogServiceImpl implements MessageLogService {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(MessageLogServiceImpl.class);

	@Autowired
	private MessageLogDao dao;
	
	@Autowired
	private PkgGroupDao pkgGroupDao;
	
	@Autowired PkgDao pkgDao;
	
	@Autowired
	private MessageDao msgDao;
	
	public void saveMessageLog(MessageLog log) {
		Pkg pkg = pkgDao.findByName(log.getPackageName());
		if( pkg != null ) {
			PkgGroup pkgGroup = pkgGroupDao.find(log.getPackageGroupName(), pkg);
			if( pkgGroup != null ) {
				Message msg = msgDao.find(log.getMessageName(), pkgGroup);
				log.setMessage(msg);
			}
				
		}
		dao.save(log);		
	}
	
	public PkgGroup getPkgGroup(String pkgName, String pkgGroupName) {
		Pkg pkg = pkgDao.findByName(pkgName);
		PkgGroup pkgGroup = pkgGroupDao.find(pkgGroupName, pkg);
		return pkgGroup;
	}
	
	public void updateMessageLog(MessageLog log) {
		dao.update(log);
	}
}
