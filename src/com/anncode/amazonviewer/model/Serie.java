package com.anncode.amazonviewer.model;

public class Serie extends Film {

	private int id;
	private int sessionQuantity;
	private Chapter[] chapters;// es una coleccion de objetos
	// chapters[]

	public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
		super(title, genre, creator, duration);
		this.sessionQuantity = sessionQuantity;

	}

	public int getId() {
		return this.id;
	}

	public int getSessionQuantity() {
		return this.sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public Chapter[] getChapter() {
		return this.chapters;
	}

	public void setChapter(Chapter[] chapters) {
		this.chapters = chapters;
	}

}
