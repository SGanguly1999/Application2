package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Instruments {
	@Override
	public String toString() {
		return "Instruments [instrumentid=" + instrumentid + ", key=" + key + ", name=" + name + "]";
	}

	@Id
	private String instrumentid;
	private String key;
	private String name;

	public String getInstrumentid() {
		return instrumentid;
	}

	public void setInstrumentid(String instrumentid) {
		this.instrumentid = instrumentid;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instruments(String instrumentid, String key, String name) {
		super();
		this.instrumentid = instrumentid;
		this.key = key;
		this.name = name;
	}

}
