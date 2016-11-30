package com.sixthc.bpel.spring.dao;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.sixthc.bpel.spring.model.Message;
import com.sixthc.bpel.spring.model.PkgGroup;

@Repository("messageDao")
public class MessageDaoImpl extends AbstractDao  implements MessageDao {
	private static org.apache.log4j.Logger log = Logger
	.getLogger(MessageDaoImpl.class);
	
	@Override
	public void save(Message face) {
		persist(face);
	}

	@Override
	public void update(Message face) {
		update(face);
	}

	@Override
	public void delete(Message face) {
		delete(face);
	}

	@Override
	public Message findById(int id) {
		Criteria criteria = getSession().createCriteria(Message.class);
		criteria.add(Restrictions.eq("message_id",id));
		return (Message) criteria.uniqueResult();
	}

	public Message findByName(String name) {
		Criteria criteria = getSession().createCriteria(Message.class);
		criteria.add(Restrictions.eq("name",name));
		return (Message) criteria.uniqueResult();
	}

	public Message find(String name, PkgGroup pkgGroup) {
		Criteria criteria = getSession().createCriteria(Message.class);
		criteria.add(Restrictions.eq("name",name)).add(Restrictions.eq("pkgGroup", pkgGroup));
		return (Message) criteria.uniqueResult();
	}

}
