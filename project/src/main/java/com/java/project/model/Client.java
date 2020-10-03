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
	private String accountType;
	private String firstName;
	private String lastName;
	private String bankCode;
	private String adress;
	private String phoneNumber;
	private String city;
	private String country;
	private String email;
	
	public Client() {
		
	}

	public Client(String accountType, String firstName, String lastName, String bankCode, String adress, String phoneNumber,
			String country, String city, String email) {
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bankCode = bankCode;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.country = country;
		this.email = email;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return accountType + ", " + firstName + ", " + lastName
				+ ", " + bankCode + ", " + adress + ", " + phoneNumber + ", " + city
				+ ", " + country + ", " + email;
	}
	
}
