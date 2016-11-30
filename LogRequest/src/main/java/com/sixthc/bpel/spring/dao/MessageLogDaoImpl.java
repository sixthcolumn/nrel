package com.sixthc.bpel.spring.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.sixthc.bpel.spring.model.MessageLog;

@Repository("messageLogDao")
public class MessageLogDaoImpl extends AbstractDao implements MessageLogDao {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(MessageLogDaoImpl.class);


	public boolean messageIDIsUnique(String messageID) {
		Criteria criteria = getSession().createCriteria(MessageLog.class);
		criteria.add(Restrictions.eq("messageId", messageID));
		List<MessageLog> list = criteria.list();

		if (list.size() > 0)
			return false;
		return true;
	}

	public MessageLog findByCorrelation(String correlationID) {
		Criteria criteria = getSession().createCriteria(MessageLog.class);
		criteria.add(Restrictions.eq("messageId", correlationID));
		return (MessageLog) criteria.uniqueResult();
	}

	public void save(MessageLog log) {
		persist(log);
	}

	@Override
	public void update(MessageLog log) {
		update(log);
	}

	@Override
	public void delete(MessageLog log) {
		delete(log);
	}

	@Override
	public MessageLog findById(int id) {
		Criteria criteria = getSession().createCriteria(MessageLog.class);
		criteria.add(Restrictions.eq("id", id));
		return (MessageLog) criteria.uniqueResult();
	}

	public long getMessageIdSequence() {
		final int id[] = new int[1];
		Sequence seq = new Sequence(getSession(), "message_id");
		return seq.getNext();
	}

	public void saveOrUpdate(MessageLog log) {
		saveOrUpdate(log);
	}

	public MessageLog findByMessageID(String messageID) {
		Criteria criteria = getSession().createCriteria(MessageLog.class);
		criteria.add(Restrictions.eq("messageID", messageID));
		return (MessageLog) criteria.uniqueResult();
	}

}
