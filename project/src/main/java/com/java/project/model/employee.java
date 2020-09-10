package com.java.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	private String name;
	private String dept;
	private Integer salary;
	
	public employee() {
		
	}

	public employee(String name, String dept, Integer salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + "," + dept + "," + salary;
	}
	
	
	
}
