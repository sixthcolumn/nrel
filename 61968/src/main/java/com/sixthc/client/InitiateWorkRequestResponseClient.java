package com.sixthc.client;

import java.net.URL;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.multispeak.v5.ExpirationTime;
import org.multispeak.v5_0.commonarrays.ArrayOfAttachment;
import org.multispeak.v5_0.commonarrays.ArrayOfAttachmentContainer;
import org.multispeak.v5_0.commonarrays.ArrayOfAttachmentUnlinkContainer;
import org.multispeak.v5_0.commonarrays.ArrayOfClearanceInstance;
import org.multispeak.v5_0.commonarrays.ArrayOfClearanceInstanceRequest;
import org.multispeak.v5_0.commonarrays.ArrayOfClearanceTag;
import org.multispeak.v5_0.commonarrays.ArrayOfDomainMember;
import org.multispeak.v5_0.commonarrays.ArrayOfObjectID;
import org.multispeak.v5_0.commonarrays.ArrayOfObjectRef;
import org.multispeak.v5_0.commonarrays.ArrayOfScheduleDate;
import org.multispeak.v5_0.commonarrays.ArrayOfString;
import org.multispeak.v5_0.commonarrays.ArrayOfTaggedDeviceRef;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkAssignmentChange;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkHistoryReferable;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkItem;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkItemDeletionRequest;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkItemRef;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkItemSummary;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkRequest;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkRequestRef;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkRequestStatusReferable;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkScheduleChange;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkStatusCategory;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkStatusCode;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkType;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkUnassignment;
import org.multispeak.v5_0.commontypes.BoundingBox;

public class InitiateWorkRequestResponseClient implements org.multispeak.v5_0.wsdl.wo_server.WOServerSoap {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(WorkRequestClient.class);
	private static final QName SERVICE_NAME = new QName(
			"http://iec.ch/TC57/2010/WorkRequest", "RequestWorkRequest");
	URL wsdlURL = WorkRequestClient.class
			.getResource("/resources/wsdl/61968-6/RequestWorkRequest.wsdl");
	public void respond() {
		
	}
	@Override
	public void deleteClearanceInstance(
			ArrayOfClearanceInstance arrayOfClearanceInstance,
			String responseURL, String transactionID) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void initiateWorkUnassignment(
			ArrayOfWorkUnassignment arrayOfWorkUnassignment,
			XMLGregorianCalendar mustChangeBy, String responseURL,
			String transactionID) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayOfWorkItemRef getWorkItemRefsByBoundsAndWorkStatusCategory(
			BoundingBox boundingBox,
			ArrayOfWorkStatusCategory arrayOfWorkStatusCategory) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayOfWorkType getSupportedWorkTypes(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayOfWorkItemSummary getWorkItemSummaries(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayOfWorkItem getWorkItemsByWorkItemRefs(
			ArrayOfWorkItemRef arrayOfWorkItemRef) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void pingURL() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayOfString getMethods() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void initiateWorkItemsDeletion(
			ArrayOfWorkItemDeletionRequest arrayOfWorkItemDeletionRequest,
			String responseURL, String transactionID,
			ExpirationTime expirationTime) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayOfWorkItemRef getWorkItemRefsByResourceIDsAndWorkStatusCategory(
			ArrayOfObjectID arrayOfObjectID,
			ArrayOfWorkStatusCategory arrayOfWorkStatusCategory) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void unlinkAttachmentsFromObjects(
			ArrayOfAttachmentUnlinkContainer arrayOfAttachmentUnlinkContainer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void initiateClearanceTagRequestByTaggedDeviceIDs(
			ArrayOfTaggedDeviceRef arrayOfTaggedDeviceRef, String responseURL,
			String transactionID) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void initiateClearanceInstanceRequest(
			ArrayOfClearanceInstanceRequest arrayOfClearanceInstanceRequest,
			String responseURL, String transactionID) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void initiateWorkScheduleDeletion(
			ArrayOfWorkItemRef arrayOfWorkItemRef,
			XMLGregorianCalendar mustChangeBy, String responseURL,
			String transactionID) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayOfWorkItemRef getWorkItemRefsByScheduleDateAndWorkStatusCategory(
			ArrayOfScheduleDate arrayOfScheduleDate,
			ArrayOfWorkStatusCategory arrayOfWorkStatusCategory) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayOfWorkHistoryReferable getWorkHistoriesByWorkItemRefs(
			ArrayOfWorkItemRef arrayOfWorkItemRef) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayOfString getDomainNames() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void linkAttachmentsToObjects(
			ArrayOfAttachmentContainer arrayOfAttachmentContainer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayOfWorkItemSummary getWorkItemSummariesByWorkItemRefs(
			ArrayOfWorkItemRef arrayOfWorkItemRef) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void initiateWorkAssignmentChanges(
			ArrayOfWorkAssignmentChange arrayOfWorkAssignmentChange,
			XMLGregorianCalendar mustChangeBy, String responseURL,
			String transactionID) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayOfAttachment getAttachmentsByObjectRefs(
			ArrayOfObjectRef arrayOfObjectRef) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayOfWorkRequestStatusReferable getWorkRequestStatuses(
			ArrayOfWorkRequestRef arrayOfWorkRequestRef) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayOfWorkItemRef getWorkItemRefsByWorkStatusCodes(
			ArrayOfWorkStatusCode arrayOfWorkStatusCode) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayOfClearanceTag getClearanceTagsByTaggedDeviceIDs(
			ArrayOfTaggedDeviceRef arrayOfTaggedDeviceRef) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayOfWorkItemSummary getActiveWorkItemSummaries(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void initiateWorkScheduleChanges(
			ArrayOfWorkScheduleChange arrayOfWorkScheduleChange,
			XMLGregorianCalendar mustChangeBy, String responseURL,
			String transactionID) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void initiateWorkRequest(ArrayOfWorkRequest arrayOfWorkRequest,
			String responseURL, String transactionID,
			ExpirationTime expirationTime) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayOfWorkItemRef getWorkItemRefsByWorkTypesAndWorkStatusCategory(
			ArrayOfWorkType arrayOfWorkType,
			ArrayOfWorkStatusCategory arrayOfWorkStatusCategory) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayOfDomainMember getDomainMembers(String domainName) {
		// TODO Auto-generated method stub
		return null;
	}
}
