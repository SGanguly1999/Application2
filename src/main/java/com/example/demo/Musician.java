package com.example.demo;

import java.util.*;

import javax.persistence.*;

@Entity
public class Musician {
	@Override
	public String toString() {
		return "Musician [SSN=" + SSN + ", name=" + name + "]";
	}

	@Id
	private String SSN;
	private String name;

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Musician(String sSN, String name) {
		super();
		SSN = sSN;
		this.name = name;
	}

}