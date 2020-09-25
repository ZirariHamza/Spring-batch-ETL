package com.java.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	private String firstName;
	private String lastName;
	private String bankCode;
	
	public Client() {
		
	}

	
	
	public Client(String firstName, String lastName, String bankCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bankCode = bankCode;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getBankCode() {
		return bankCode;
	}



	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}



	@Override
	public String toString() {
		return firstName + "," + lastName + "," + bankCode;
	}

	
	
}
