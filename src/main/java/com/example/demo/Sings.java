package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Sings implements Serializable {
	@Id
	private String SSN;

	@Override
	public String toString() {
		return "Sings [SSN=" + SSN + ", songId=" + songId + "]";
	}

	public Sings(String sSN, String songId) {
		super();
		SSN = sSN;
		this.songId = songId;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getSongId() {
		return songId;
	}

	public void setSongId(String songId) {
		this.songId = songId;
	}

	@Id
	private String songId;

}
