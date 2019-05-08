package com.anncode.amazonviewer.model;

public class Chapter {

	private int id;
	private String title;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeViewed;
	private int sessionNumber;

	public Chapter(String title, int duration, short year) {
		super();
		this.title = title;
		this.duration = duration;
		this.year = year;
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

	public int getSessionNumber() {
		return this.sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}

}
