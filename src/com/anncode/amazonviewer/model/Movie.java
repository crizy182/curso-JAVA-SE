package com.anncode.amazonviewer.model;

public class Movie extends Film {
	private int id;
	private int timeViewed;

	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);// this set method is written in film
	}

	public void showData() {
		// System.out.println("Title: " + title);
		// System.out.println("Genre: " + genre);
		// System.out.println("Year: " + year);
	}

	public int getId() {
		return this.id;
	}

	public int getTimeViewed() {
		return this.timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}

	@Override
	public String toString() {
		return "\n ::Movie ::" + "\n Title:" + getTitle() + "\n Genero:" + getGenre() + "\n Year:\t" + getYear()
				+ "\n Creator:" + getCreator() + "\n Duration:" + getDuration();
	}
}
