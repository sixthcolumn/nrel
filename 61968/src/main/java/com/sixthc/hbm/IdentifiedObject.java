package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.log4j.Logger;

/**
 * IdentifiedObject generated by hbm2java
 */
@Entity
@Table(name = "identified_object")
public class IdentifiedObject implements java.io.Serializable {
	private static Constraint con = new Constraint(IdentifiedObject.class);

	private static org.apache.log4j.Logger log = Logger
			.getLogger(IdentifiedObject.class);

	private Integer id;
	private String mrid;
	private String description;
	private int criticalFlag;
	private String utcNumber;
	private String coordSystem;
	private Integer addressId;
	private Set<IdentifiedObjectProcedures> identifiedObjectProcedureses = new HashSet<IdentifiedObjectProcedures>(
			0);
	private Set<IdentifiedObjectPositionPoints> identifiedObjectPositionPointses = new HashSet<IdentifiedObjectPositionPoints>(
			0);
	private Set<IdentifiedObjectNames> identifiedObjectNameses = new HashSet<IdentifiedObjectNames>(
			0);
	private Set<WorkTaskIdentifiedObjects> workTaskIdentifiedObjectses = new HashSet<WorkTaskIdentifiedObjects>(
			0);
	private Set<IdentifiedObjectHazards> identifiedObjectHazardses = new HashSet<IdentifiedObjectHazards>(
			0);

	public IdentifiedObject() {
	}

	public IdentifiedObject(String mrid, int criticalFlag) {
		this.mrid = mrid;
		this.criticalFlag = criticalFlag;
	}

	public IdentifiedObject(
			String mrid,
			String description,
			int criticalFlag,
			String utcNumber,
			String coordSystem,
			Integer addressId,
			Set<IdentifiedObjectProcedures> identifiedObjectProcedureses,
			Set<IdentifiedObjectPositionPoints> identifiedObjectPositionPointses,
			Set<IdentifiedObjectNames> identifiedObjectNameses,
			Set<WorkTaskIdentifiedObjects> workTaskIdentifiedObjectses,
			Set<IdentifiedObjectHazards> identifiedObjectHazardses) {
		this.mrid = mrid;
		this.description = description;
		this.criticalFlag = criticalFlag;
		this.utcNumber = utcNumber;
		this.coordSystem = coordSystem;
		this.addressId = addressId;
		this.identifiedObjectProcedureses = identifiedObjectProcedureses;
		this.identifiedObjectPositionPointses = identifiedObjectPositionPointses;
		this.identifiedObjectNameses = identifiedObjectNameses;
		this.workTaskIdentifiedObjectses = workTaskIdentifiedObjectses;
		this.identifiedObjectHazardses = identifiedObjectHazardses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		log.debug("SetId : " + id);
		this.id = id;
	}

	@Column(name = "mRID", nullable = false, length = 40)
	public String getMrid() {
		return this.mrid;
	}

	public void setMrid(String mrid) {
		con.check( "setMrid", mrid, false, 40);
		this.mrid = mrid;
	}

	@Column(name = "description", length = 512)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		con.check( "setDescription", description, true, 512);
		this.description = description;
	}

	@Column(name = "critical_flag", nullable = false)
	public int getCriticalFlag() {
		return this.criticalFlag;
	}

	public void setCriticalFlag(int criticalFlag) {
		log.debug("setCriticalFlag : " + criticalFlag);
		this.criticalFlag = criticalFlag;
	}

	@Column(name = "utc_number", length = 40)
	public String getUtcNumber() {
		return this.utcNumber;
	}

	public void setUtcNumber(String utcNumber) {
		con.check( "setUtcNumber", utcNumber, true, 40);
		this.utcNumber = utcNumber;
	}

	@Column(name = "coord_system", length = 12)
	public String getCoordSystem() {
		return this.coordSystem;
	}

	public void setCoordSystem(String coordSystem) {
		con.check( "setCoordSystem", coordSystem, true, 12);
		this.coordSystem = coordSystem;
	}

	@Column(name = "address_id")
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "identifiedObject")
	public Set<IdentifiedObjectProcedures> getIdentifiedObjectProcedureses() {
		return this.identifiedObjectProcedureses;
	}

	public void setIdentifiedObjectProcedureses(
			Set<IdentifiedObjectProcedures> identifiedObjectProcedureses) {
		this.identifiedObjectProcedureses = identifiedObjectProcedureses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "identifiedObject")
	public Set<IdentifiedObjectPositionPoints> getIdentifiedObjectPositionPointses() {
		return this.identifiedObjectPositionPointses;
	}

	public void setIdentifiedObjectPositionPointses(
			Set<IdentifiedObjectPositionPoints> identifiedObjectPositionPointses) {
		this.identifiedObjectPositionPointses = identifiedObjectPositionPointses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "identifiedObject")
	public Set<IdentifiedObjectNames> getIdentifiedObjectNameses() {
		return this.identifiedObjectNameses;
	}

	public void setIdentifiedObjectNameses(
			Set<IdentifiedObjectNames> identifiedObjectNameses) {
		this.identifiedObjectNameses = identifiedObjectNameses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "identifiedObject")
	public Set<WorkTaskIdentifiedObjects> getWorkTaskIdentifiedObjectses() {
		return this.workTaskIdentifiedObjectses;
	}

	public void setWorkTaskIdentifiedObjectses(
			Set<WorkTaskIdentifiedObjects> workTaskIdentifiedObjectses) {
		this.workTaskIdentifiedObjectses = workTaskIdentifiedObjectses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "identifiedObject")
	public Set<IdentifiedObjectHazards> getIdentifiedObjectHazardses() {
		return this.identifiedObjectHazardses;
	}

	public void setIdentifiedObjectHazardses(
			Set<IdentifiedObjectHazards> identifiedObjectHazardses) {
		this.identifiedObjectHazardses = identifiedObjectHazardses;
	}

}
