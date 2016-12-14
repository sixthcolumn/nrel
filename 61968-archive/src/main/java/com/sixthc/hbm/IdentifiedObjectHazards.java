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
 * IdentifiedObjectHazards generated by hbm2java
 */
@Entity
@Table(name = "identified_object_hazards")
public class IdentifiedObjectHazards implements java.io.Serializable {
	private static org.apache.log4j.Logger log = Logger
			.getLogger(IdentifiedObjectHazards.class);

	private Integer id;
	private IdentifiedObject identifiedObject;
	private Hazards hazards;

	public IdentifiedObjectHazards() {
	}

	public IdentifiedObjectHazards(IdentifiedObject identifiedObject,
			Hazards hazards) {
		this.identifiedObject = identifiedObject;
		this.hazards = hazards;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hazard_id", nullable = false)
	public Hazards getHazards() {
		return this.hazards;
	}

	public void setHazards(Hazards hazards) {
		this.hazards = hazards;
	}

}
