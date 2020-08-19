package com.java.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Logs {
	
	@Id
	private int Id;
	private String Date;
	private String line;

	public Logs() {
		
	}
	
	public Logs(int id, String date, String line) {
		this.Id = id;
		this.Date = date;
		this.line = line;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	@Override
	public String toString() {
		return Date + "," + line;
	}

	
	
}
