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
 * OtherContactinfo generated by hbm2java
 */
@Entity
@Table(name = "other_contactinfo")
public class OtherContactinfo implements java.io.Serializable {
	private static Constraint con = new Constraint(OtherContactinfo.class);

	private static org.apache.log4j.Logger log = Logger
			.getLogger(OtherContactinfo.class);

	private Integer id;
	private String details;
	private String infoType;
	private Set<ContactpersonOtherContactinfos> contactpersonOtherContactinfoses = new HashSet<ContactpersonOtherContactinfos>(
			0);

	public OtherContactinfo() {
	}

	public OtherContactinfo(String details) {
		this.details = details;
	}

	public OtherContactinfo(String details, String infoType,
			Set<ContactpersonOtherContactinfos> contactpersonOtherContactinfoses) {
		this.details = details;
		this.infoType = infoType;
		this.contactpersonOtherContactinfoses = contactpersonOtherContactinfoses;
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

	@Column(name = "details", nullable = false, length = 30)
	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		con.check( "setDetails", details, false, 30);
		this.details = details;
	}

	@Column(name = "info_type", length = 10)
	public String getInfoType() {
		return this.infoType;
	}

	public void setInfoType(String infoType) {
		con.check( "setInfoType", infoType, true, 10);
		this.infoType = infoType;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "otherContactinfo")
	public Set<ContactpersonOtherContactinfos> getContactpersonOtherContactinfoses() {
		return this.contactpersonOtherContactinfoses;
	}

	public void setContactpersonOtherContactinfoses(
			Set<ContactpersonOtherContactinfos> contactpersonOtherContactinfoses) {
		this.contactpersonOtherContactinfoses = contactpersonOtherContactinfoses;
	}

}
