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
 * IdentifiedObjectPositionPoints generated by hbm2java
 */
@Entity
@Table(name = "identified_object_position_points")
public class IdentifiedObjectPositionPoints implements java.io.Serializable {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(IdentifiedObjectPositionPoints.class);

	private Integer id;
	private IdentifiedObject identifiedObject;
	private Integer sequence;
	private Integer xposition;
	private Integer yposition;
	private Integer zposition;

	public IdentifiedObjectPositionPoints() {
	}

	public IdentifiedObjectPositionPoints(IdentifiedObject identifiedObject) {
		this.identifiedObject = identifiedObject;
	}

	public IdentifiedObjectPositionPoints(IdentifiedObject identifiedObject,
			Integer sequence, Integer xposition, Integer yposition,
			Integer zposition) {
		this.identifiedObject = identifiedObject;
		this.sequence = sequence;
		this.xposition = xposition;
		this.yposition = yposition;
		this.zposition = zposition;
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
	@JoinColumn(name = "identified_object_id", nullable = false)
	public IdentifiedObject getIdentifiedObject() {
		return this.identifiedObject;
	}

	public void setIdentifiedObject(IdentifiedObject identifiedObject) {
		this.identifiedObject = identifiedObject;
	}

	@Column(name = "sequence")
	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	@Column(name = "xposition")
	public Integer getXposition() {
		return this.xposition;
	}

	public void setXposition(Integer xposition) {
		log.debug("setXPosition : " + xposition);
		this.xposition = xposition;
	}

	@Column(name = "yposition")
	public Integer getYposition() {
		return this.yposition;
	}

	public void setYposition(Integer yposition) {
		log.debug("setYposition : " + yposition);
		this.yposition = yposition;
	}

	@Column(name = "zposition")
	public Integer getZposition() {
		return this.zposition;
	}

	public void setZposition(Integer zposition) {
		log.debug("setZposition : " + zposition);
		this.zposition = zposition;
	}

}