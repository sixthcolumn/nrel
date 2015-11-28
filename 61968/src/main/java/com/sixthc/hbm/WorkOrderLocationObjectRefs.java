package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.log4j.Logger;

/**
 * WorkOrderLocationObjectRefs generated by hbm2java
 */
@Entity
@Table(name = "work_order_location_object_refs", catalog = "wms")
public class WorkOrderLocationObjectRefs implements java.io.Serializable {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(WorkOrderLocationObjectRefs.class);

	private Integer id;
	private WorkOrder workOrder;
	private Objectref objectref;

	public WorkOrderLocationObjectRefs() {
	}

	public WorkOrderLocationObjectRefs(WorkOrder workOrder, Objectref objectref) {
		this.workOrder = workOrder;
		this.objectref = objectref;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		log.debug("setId : " + id);
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "work_order_id", nullable = false)
	public WorkOrder getWorkOrder() {
		return this.workOrder;
	}

	public void setWorkOrder(WorkOrder workOrder) {
		this.workOrder = workOrder;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loc_ref_object_id", nullable = false)
	public Objectref getObjectref() {
		return this.objectref;
	}

	public void setObjectref(Objectref objectref) {
		this.objectref = objectref;
	}

}