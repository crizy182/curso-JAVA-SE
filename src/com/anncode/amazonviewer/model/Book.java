package com.anncode.amazonviewer.model;

import java.util.Date;

public class Book extends Publication implements IVisualizable {
	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;

	public Book(String title, Date editionDate, String editorial, String[] authors, String isbn) {
		super(title, editionDate, editorial, authors);
		this.isbn = isbn;
		this.readed = readed;
		this.timeReaded = timeReaded;
	}

	public int getId() {
		return this.id;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isReaded() {
		return this.readed;
	}

	public boolean getReaded() {
		return this.readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public int getTimeReaded() {
		return this.timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

	@Override
	public String toString() {
		return "\n\t::: Book :::" + "\n Title:\t\t" + getTitle() + "\n Edition Date:" + getEditionDate()
				+ "\n Editorial:" + getEditorial() + "\n Authors: " + getAuthors() + "\n ISBN:\t\t" + getIsbn()
				+ "\n readed" + getReaded() + "\n time readed" + getTimeReaded();

	}

	// pepeating code????
	@Override
	public Date startToSee(Date dateI) {
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		if (dateF.getTime() > dateI.getTime()) {
			setTimeReaded((int) (dateF.getTime() - dateI.getTime()));
		} else {
			setTimeReaded(0);
		}
	};
}
