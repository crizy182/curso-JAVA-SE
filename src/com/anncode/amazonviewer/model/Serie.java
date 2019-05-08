package com.anncode.amazonviewer.model;

public class Serie {

	private int id;
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeViewed;

	private int sessionQuantity;
	// chapters[]

	public Serie(String title, String genre, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public short getYear() {
		return this.year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public boolean isViewed() {
		return this.viewed;
	}

	public boolean getViewed() {
		return this.viewed;
	}

	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}

	public int getTimeViewed() {
		return this.timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}

	public int getSessionQuantity() {
		return this.sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

}
