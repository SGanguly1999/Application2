package com.example.demo;

import javax.persistence.*;

@Entity
public class Produces {

	@Override
	public String toString() {
		return "Produces [SSN=" + SSN + ", identifier=" + identifier + "]";
	}

	public Produces(String sSN, String identifier) {
		super();
		SSN = sSN;
		this.identifier = identifier;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Id
	private String SSN;
	private String identifier;
}
