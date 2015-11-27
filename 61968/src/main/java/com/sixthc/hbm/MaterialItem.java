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
 * MaterialItem generated by hbm2java
 */
@Entity
@Table(name = "material_item", catalog = "wms")
public class MaterialItem implements java.io.Serializable {
	private static Constraint con = new Constraint(MaterialItem.class);

	private static org.apache.log4j.Logger log = Logger
			.getLogger(MaterialItem.class);

	private Integer id;
	private String multiplier;
	private String unit;
	private Float quantity;
	private Set<WorkTaskMaterialItems> workTaskMaterialItemses = new HashSet<WorkTaskMaterialItems>(
			0);
	private Set<MaterialItemNames> materialItemNameses = new HashSet<MaterialItemNames>(
			0);

	public MaterialItem() {
	}

	public MaterialItem(String multiplier, String unit, Float quantity,
			Set<WorkTaskMaterialItems> workTaskMaterialItemses,
			Set<MaterialItemNames> materialItemNameses) {
		this.multiplier = multiplier;
		this.unit = unit;
		this.quantity = quantity;
		this.workTaskMaterialItemses = workTaskMaterialItemses;
		this.materialItemNameses = materialItemNameses;
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

	@Column(name = "multiplier")
	public String getMultiplier() {
		return this.multiplier;
	}

	public void setMultiplier(String multiplier) {
		log.debug("setMultiplier : " + multiplier);
		this.multiplier = multiplier;
	}

	@Column(name = "unit", length = 12)
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		con.check( "setUnit", unit, true, 12);
		this.unit = unit;
	}

	@Column(name = "quantity", precision = 12, scale = 0)
	public Float getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Float quantity) {
		log.debug("setQuantity : " + quantity);
		this.quantity = quantity;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "materialItem")
	public Set<WorkTaskMaterialItems> getWorkTaskMaterialItemses() {
		return this.workTaskMaterialItemses;
	}

	public void setWorkTaskMaterialItemses(
			Set<WorkTaskMaterialItems> workTaskMaterialItemses) {
		this.workTaskMaterialItemses = workTaskMaterialItemses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "materialItem")
	public Set<MaterialItemNames> getMaterialItemNameses() {
		return this.materialItemNameses;
	}

	public void setMaterialItemNameses(
			Set<MaterialItemNames> materialItemNameses) {
		this.materialItemNameses = materialItemNameses;
	}

}
