package com.joyloruth;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job", schema = "jobs")
public class Job {
	
	private Long id;
	private String name;
	private String jobtitle;
	private String location;
	private float salary;
	private Date dateapplied;
	
	public Job() {
		
	}
	







	public Job(Long id, String name, String jobtitle, String location, float salary, Date dateapplied) {
		super();
		this.id = id;
		this.name = name;
		this.jobtitle = jobtitle;
		this.location = location;
		this.salary = salary;
		this.dateapplied = dateapplied;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	

	public String getJobtitle() {
		return jobtitle;
	}


	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public Date getDateapplied() {
		return dateapplied;
	}

	public void setDateapplied(Date dateapplied) {
		this.dateapplied = dateapplied;
	}








	@Override
	public String toString() {
		return "Job [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}
	
	

}
