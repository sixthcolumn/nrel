package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.log4j.Logger;

/**
 * Nametype generated by hbm2java
 */
@Entity
@Table(name = "nametype", catalog = "wms")
public class Nametype implements java.io.Serializable {
	private static Constraint con = new Constraint(Nametype.class);

	private static org.apache.log4j.Logger log = Logger.getLogger(Asset.class);

	private Integer id;
	private NameTypeAuthority nameTypeAuthority;
	private String name;
	private String description;
	private Set<WorkOrderNames> workOrderNameses = new HashSet<WorkOrderNames>(
			0);
	private Set<CrewNames> crewNameses = new HashSet<CrewNames>(0);
	private Set<AssetNames> assetNameses = new HashSet<AssetNames>(0);
	private Set<WorkTaskNames> workTaskNameses = new HashSet<WorkTaskNames>(0);
	private Set<MaterialItemNames> materialItemNameses = new HashSet<MaterialItemNames>(
			0);
	private Set<IdentifiedObjectNames> identifiedObjectNameses = new HashSet<IdentifiedObjectNames>(
			0);
	private Set<OrganizationNames> organizationNameses = new HashSet<OrganizationNames>(
			0);
	private Set<MaintorderNames> maintOrderNameses = new HashSet<MaintorderNames>(
			0);

	public Nametype() {
	}

	public Nametype(NameTypeAuthority nameTypeAuthority, String name) {
		this.nameTypeAuthority = nameTypeAuthority;
		this.name = name;
	}

	public Nametype(NameTypeAuthority nameTypeAuthority, String name,
			String description, Set<WorkOrderNames> workOrderNameses,
			Set<CrewNames> crewNameses, Set<AssetNames> assetNameses,
			Set<WorkTaskNames> workTaskNameses,
			Set<MaterialItemNames> materialItemNameses,
			Set<IdentifiedObjectNames> identifiedObjectNameses,
			Set<OrganizationNames> organizationNameses) {
		this.nameTypeAuthority = nameTypeAuthority;
		this.name = name;
		this.description = description;
		this.workOrderNameses = workOrderNameses;
		this.crewNameses = crewNameses;
		this.assetNameses = assetNameses;
		this.workTaskNameses = workTaskNameses;
		this.materialItemNameses = materialItemNameses;
		this.identifiedObjectNameses = identifiedObjectNameses;
		this.organizationNameses = organizationNameses;
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

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "name_type_authority_id")
	public NameTypeAuthority getNameTypeAuthority() {
		return this.nameTypeAuthority;
	}

	public void setNameTypeAuthority(NameTypeAuthority nameTypeAuthority) {
		this.nameTypeAuthority = nameTypeAuthority;
	}

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		con.check( "setName", name, false, 20);
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		con.check( "setDescription", description, true, 20);
		this.description = description;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "nametype")
	public Set<WorkOrderNames> getWorkOrderNameses() {
		return this.workOrderNameses;
	}

	public void setWorkOrderNameses(Set<WorkOrderNames> workOrderNameses) {
		this.workOrderNameses = workOrderNameses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "nametype")
	public Set<CrewNames> getCrewNameses() {
		return this.crewNameses;
	}

	public void setCrewNameses(Set<CrewNames> crewNameses) {
		this.crewNameses = crewNameses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "nametype")
	public Set<AssetNames> getAssetNameses() {
		return this.assetNameses;
	}

	public void setAssetNameses(Set<AssetNames> assetNameses) {
		this.assetNameses = assetNameses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "nametype")
	public Set<WorkTaskNames> getWorkTaskNameses() {
		return this.workTaskNameses;
	}

	public void setWorkTaskNameses(Set<WorkTaskNames> workTaskNameses) {
		this.workTaskNameses = workTaskNameses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "nametype")
	public Set<MaterialItemNames> getMaterialItemNameses() {
		return this.materialItemNameses;
	}

	public void setMaterialItemNameses(
			Set<MaterialItemNames> materialItemNameses) {
		this.materialItemNameses = materialItemNameses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "nametype")
	public Set<IdentifiedObjectNames> getIdentifiedObjectNameses() {
		return this.identifiedObjectNameses;
	}

	public void setIdentifiedObjectNameses(
			Set<IdentifiedObjectNames> identifiedObjectNameses) {
		this.identifiedObjectNameses = identifiedObjectNameses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "nametype")
	public Set<OrganizationNames> getOrganizationNameses() {
		return this.organizationNameses;
	}

	public void setOrganizationNameses(
			Set<OrganizationNames> organizationNameses) {
		this.organizationNameses = organizationNameses;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "nametype")
	public Set<MaintorderNames> getMaintOrderNameses() {
		return this.maintOrderNameses;
	}

	public void setMaintOrderNameses(
			Set<MaintorderNames> MaintOrderNameses) {
		this.maintOrderNameses = MaintOrderNameses;
	}	

}
