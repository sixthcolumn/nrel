package com.sixthc.hbm;

// Generated Jun 3, 2015 2:34:41 PM by Hibernate Tools 3.2.2.GA

import javax.persistence.CascadeType;
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
 * WorkTaskNames generated by hbm2java
 */
@Entity
@Table(name = "work_task_names", catalog = "wms")
public class WorkTaskNames implements java.io.Serializable {
	private static Constraint con = new Constraint(WorkTaskNames.class);

	private static org.apache.log4j.Logger log = Logger
			.getLogger(WorkTaskNames.class);

	private Integer id;
	private WorkTask workTask;
	private Nametype nametype;
	private String name;

	public WorkTaskNames() {
	}

	public WorkTaskNames(WorkTask workTask, String name) {
		this.workTask = workTask;
		this.name = name;
	}

	public WorkTaskNames(WorkTask workTask, Nametype nametype, String name) {
		this.workTask = workTask;
		this.nametype = nametype;
		this.name = name;
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
	@JoinColumn(name = "work_task_id", nullable = false)
	public WorkTask getWorkTask() {
		return this.workTask;
	}

	public void setWorkTask(WorkTask workTask) {
		this.workTask = workTask;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "name_type_id")
	public Nametype getNametype() {
		return this.nametype;
	}

	public void setNametype(Nametype nametype) {
		this.nametype = nametype;
	}

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		con.check("setName", name, false, 20);
		this.name = name;
	}

}