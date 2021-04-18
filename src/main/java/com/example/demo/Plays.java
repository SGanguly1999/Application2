package com.example.demo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Plays implements Serializable {

	@Override
	public String toString() {
		return "Plays [SSN=" + SSN + ", instrumentId=" + instrumentId + "]";
	}

	@Id
	private String SSN;
	@Id
	private String instrumentId;

	public Plays(String sSN, String instrumentId) {
		super();
		SSN = sSN;
		this.instrumentId = instrumentId;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

}
