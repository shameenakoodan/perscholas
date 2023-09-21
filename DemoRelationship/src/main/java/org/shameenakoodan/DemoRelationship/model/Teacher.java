package org.shameenakoodan.DemoRelationship.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int tid;
	private String salary;
	private String teachername;
	//For the demo of onetomany we are going to comment the below two lines
	//@ManyToOne
	//private Department department;

	@ManyToMany(targetEntity = Cohort.class)
	private Set cohortSet;
	public Set getCohortSet() {
		return cohortSet;
	}
	public void setCohortSet(Set cohortSet) {
		this.cohortSet = cohortSet;
	}
	public Teacher(String salary, String teachername,Set cohortSet) {
		super();
		this.salary = salary;
		this.teachername = teachername;
		this.cohortSet = cohortSet;
		
	}
	public Teacher()
	{
		super();
	}
	
	/*
	 * public Department getDep() { return department; } public void
	 * setDep(Department department) { this.department = department; }
	 */
	
	public int getTit() {
		return tid;
	}
	public void setTit(int tit) {
		this.tid = tit;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String Teachername) {
		this.teachername = Teachername;
	}
}
