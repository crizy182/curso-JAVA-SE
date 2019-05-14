package com.anncode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualizable {
	private int id;
	private String isbn;
	private boolean Read;
	private int timeRead;

	public Book(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial);
		// setAuthors(authors);
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

	public boolean isRead() {
		return Read;
	}

	public void setRead(boolean Read) {
		this.Read = Read;
	}

	public int getTimeRead() {
		return timeRead;
	}

	public void setTimeRead(int timeRead) {
		this.timeRead = timeRead;
	}

	@Override
	public String toString() {
		String detailBook = "\n\t::: Book :::" + "\n Title:\t\t" + getTitle() + "\n Edition Date:" + getEditionDate()
				+ "\n Editorial:" + getEditorial() + "\n ISBN:\t\t" + getIsbn() + "\n time Read" + getTimeRead()
				+ "\n Authors: ";
		for (int i = 0; i < getAuthors().length; i++) {
			detailBook += "\t" + getAuthors()[i];
		}
		return detailBook;
	}

	// repeating code????
	@Override
	public Date startToSee(Date dateI) {
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		if (dateF.getTime() > dateI.getTime()) {
			setTimeRead((int) (dateF.getTime() - dateI.getTime()));
		} else {
			setTimeRead(0);
		}
	}

	public static ArrayList<Book> makeBooksList() {
		ArrayList<Book> books = new ArrayList();
		Date myDate = new Date();
		String[] authors = { "Gabo", "saramago", "toriyama" };
		for (int i = 1; i <= 5; i++) {
			// (String title, Date editionDate, String editorial, String[] authors)
			books.add(new Book("Book " + i, myDate, "sixtorial", authors));
		}
		return books;
	}
}
