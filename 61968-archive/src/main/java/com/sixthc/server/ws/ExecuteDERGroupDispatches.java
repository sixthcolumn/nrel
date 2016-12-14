package com.sixthc.server.ws;

import java.util.UUID;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;
import ch.iec.tc57._2011.schema.message.RequestType;

import com.epri.dergroupdispatchesmessage.DERGroupDispatchesPayloadType;
import com.epri.executedergroupdispatches.DERGroupDispatchesPort;
import com.sixthc.dao.MessageLogDao;
import com.sixthc.interceptor.CIMLoggingInInterceptor;

public class ExecuteDERGroupDispatches implements DERGroupDispatchesPort {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(CIMLoggingInInterceptor.class);
	
	@Autowired
	private MessageLogDao messageLogDao;
	
	@Override
	public void createDERGroupDispatches(Holder<HeaderType> header,
			RequestType request, Holder<DERGroupDispatchesPayloadType> payload,
			Holder<ReplyType> reply)
			throws com.epri.executedergroupdispatches.FaultMessage {

		reply.value = new ReplyType();
		reply.value.setResult("OK");
		
		header.value.setCorrelationID(header.value.getMessageID());
		header.value.setMessageID(UUID.randomUUID().toString());

		log.debug("createDERGroups set correlation id [" + header.value.getCorrelationID() + "]");
		log.debug("createDERGroups set message id     [" + header.value.getMessageID() + "]");
		
	}
}
