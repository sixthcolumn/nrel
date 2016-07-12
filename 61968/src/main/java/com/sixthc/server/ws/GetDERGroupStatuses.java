package com.sixthc.server.ws;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;

import com.epri.dercommon.ActivePower;
import com.epri.dergroupstatuses.DERGroupStatus;
import com.epri.dergroupstatuses.DERGroupStatuses;
import com.epri.dergroupstatuses.EndDeviceGroup;
import com.epri.dergroupstatuses.Status;
import com.epri.getdergroupstatuses.GetDERGroupStatusesFaultMessage;
import com.epri.getdergroupstatuses.GetDERGroupStatusesPort;
import com.epri.getdergroupstatusesmessage.DERGroupStatusesPayloadType;
import com.epri.getdergroupstatusesmessage.GetDERGroupStatusesRequestMessageType;
import com.epri.getdergroupstatusesmessage.GetDERGroupStatusesResponseMessageType;

public class GetDERGroupStatuses implements GetDERGroupStatusesPort {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(GetDERGroupStatuses.class);
	
	@Override
	public GetDERGroupStatusesResponseMessageType getDERGroupStatuses(
			GetDERGroupStatusesRequestMessageType getDERGroupStatusesRequestMessage)
			throws GetDERGroupStatusesFaultMessage {
		
		GetDERGroupStatusesResponseMessageType response = new GetDERGroupStatusesResponseMessageType();
		ReplyType reply = new ReplyType();
		response.setReply(reply);
		DERGroupStatusesPayloadType payload = new DERGroupStatusesPayloadType();
		response.setPayload(payload);
		DERGroupStatuses statuses = new DERGroupStatuses();
		payload.setDERGroupStatuses(statuses);
		DERGroupStatus status = new DERGroupStatus();
		statuses.getDERGroupStatuses().add(status);
		
		
		HeaderType header = getDERGroupStatusesRequestMessage.getHeader();
		response.setHeader(header);
		
		status.setMRID("1234");
		status.setName("der1");
		status.setEndDeviceGroup(new EndDeviceGroup());
		EndDeviceGroup group = status.getEndDeviceGroup();
		
		Status gstatus = new Status();
		group.setStatus(gstatus);
		gstatus.setValue("14.2");
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTimeInMillis(System.currentTimeMillis());
		XMLGregorianCalendar date2;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			gstatus.setDateTime(date2);
		} catch (DatatypeConfigurationException ex) {
			ex.printStackTrace();
		}		

		ActivePower ap = new ActivePower();
		ap.setMultiplier("k");
		ap.setValue((float) 12.5);
		ap.setUnit("W");
		group.setPresentActivePower(ap);
		
		ActivePower app = new ActivePower();
		app.setMultiplier("k");
		app.setValue((float) 10.5);
		app.setUnit("VA");
		group.setPresentActivePower(app);

				
		ActivePower rp = new ActivePower();
		rp.setMultiplier("k");
		rp.setValue((float) 11.0);
		rp.setUnit("VAr");
		group.setPresentActivePower(rp);
		
		
		reply.setResult("OK");

		return response;
	}

}
