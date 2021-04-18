package com.example.demo;

import java.util.*;

import javax.persistence.*;

@Entity
public class Song {

	@Override
	public String toString() {
		return "Song [song_id=" + song_id + ", author=" + author + ", title=" + title + "]";
	}

	@Id
	private String song_id;
	private String author;
	private String title;

	public String getSong_id() {
		return song_id;
	}

	public void setSong_id(String song_id) {
		this.song_id = song_id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Song(String song_id, String author, String title) {
		super();
		this.song_id = song_id;
		this.author = author;
		this.title = title;
	}

}
