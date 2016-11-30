package com.sixthc.bpel.spring.dao;

import com.sixthc.bpel.spring.model.Message;
import com.sixthc.bpel.spring.model.PkgGroup;

public interface MessageDao {

	public void save(Message face);
	public void update(Message face);
	public void delete(Message face);
	public Message findById(int id);
	public Message findByName(String name);
	public Message find(String name, PkgGroup pkgGroup) ;
}
