package com.shameenakoodan.HibernateJPABeginner.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
	@Column(name = "Department_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int did;
	private String name;
	private String state;
	/**
	 * @param did
	 * @param name
	 * @param state
	 */
	public Department(int did, String name, String state) {
		super();
		this.did = did;
		this.name = name;
		this.state = state;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Department() {
		
	}
}
