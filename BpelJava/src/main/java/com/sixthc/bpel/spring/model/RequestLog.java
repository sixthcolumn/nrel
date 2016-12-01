package com.sixthc.bpel.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="request_log")
public class RequestLog {
	@Id
	@GeneratedValue
	@Column(name = "request_log_id")
	private int id;
	
	@Column(name="message_id")
	private String message_id;
	
	@Column(name="message", length=4000)
	private String message;
	
	public RequestLog() {
		
	}
	
	public RequestLog(String messageID, String message) {
		this.message_id = messageID;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage_id() {
		return message_id;
	}

	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}


