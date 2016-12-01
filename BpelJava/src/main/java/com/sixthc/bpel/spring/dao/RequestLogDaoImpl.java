package com.sixthc.bpel.spring.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.sixthc.bpel.spring.model.RequestLog;

@Repository("requestLogDao")
public class RequestLogDaoImpl extends AbstractDao implements RequestLogDao {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(RequestLogDaoImpl.class);


	public boolean messageIDIsUnique(String messageID) {
		Criteria criteria = getSession().createCriteria(RequestLog.class);
		criteria.add(Restrictions.eq("messageId", messageID));
		List<RequestLog> list = criteria.list();

		if (list.size() > 0)
			return false;
		return true;
	}

	public void save(RequestLog log) {
		persist(log);
	}

	@Override
	public void update(RequestLog log) {
		update(log);
	}

	@Override
	public void delete(RequestLog log) {
		delete(log);
	}

	@Override
	public RequestLog findById(int id) {
		Criteria criteria = getSession().createCriteria(RequestLog.class);
		criteria.add(Restrictions.eq("id", id));
		return (RequestLog) criteria.uniqueResult();
	}

	public long getMessageIdSequence() {
		final int id[] = new int[1];
		Sequence seq = new Sequence(getSession(), "message_id");
		return seq.getNext();
	}

	public void saveOrUpdate(RequestLog log) {
		saveOrUpdate(log);
	}

	public List<RequestLog> findByMessageID(String messageID) {
		Criteria criteria = getSession().createCriteria(RequestLog.class);
		criteria.add(Restrictions.eq("message_id", messageID));
		return (List<RequestLog>) criteria.uniqueResult();
	}

}
