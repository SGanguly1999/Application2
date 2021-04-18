package com.example.demo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Lives implements Serializable {
	@Override
	public String toString() {
		return "Lives [SSN=" + SSN + ", phone=" + phone + "]";
	}

	public Lives(String sSN, long phone) {
		super();
		SSN = sSN;
		this.phone = phone;
	}

	@Id
	private String SSN;
	@Id
	private long phone;

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
