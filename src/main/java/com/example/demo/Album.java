package com.example.demo;

import javax.persistence.*;
import java.util.*;

@Entity
public class Album {
	@Override
	public String toString() {
		return "Album [identifier=" + identifier + ", title=" + title + ", copyrightdate=" + copyrightdate + ", format="
				+ format + "]";
	}

	@Id
	private String identifier;
	private String title;
	private int copyrightdate;
	private String format;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopyrightdate() {
		return copyrightdate;
	}

	public void setCopyrightdate(int copyrightdate) {
		this.copyrightdate = copyrightdate;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Album(String identifier, String title, int copyrightdate, String format) {
		super();
		this.identifier = identifier;
		this.title = title;
		this.copyrightdate = copyrightdate;
		this.format = format;
	}

}
