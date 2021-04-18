package com.example.demo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Contains implements Serializable {
	@Override
	public String toString() {
		return "Contains [identifier=" + identifier + ", songId=" + songId + "]";
	}

	@Id
	private String identifier;
	private String songId;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getSongId() {
		return songId;
	}

	public void setSongId(String songId) {
		this.songId = songId;
	}

	public Contains(String identifier, String songId) {
		super();
		this.identifier = identifier;
		this.songId = songId;
	}

}
