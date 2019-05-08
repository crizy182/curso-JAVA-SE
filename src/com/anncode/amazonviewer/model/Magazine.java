package com.anncode.amazonviewer.model;

import java.util.Date;

public class Magazine {
	private int id;
	private String title;
	private Date edititionDate;
	private String editorial;
	private String[] authors;

	public Magazine(String title, Date edititionDate, String editorial) {
		super();
		this.title = title;
		this.edititionDate = edititionDate;
		this.editorial = editorial;
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

	public Date getEdititionDate() {
		return this.edititionDate;
	}

	public void setEdititionDate(Date edititionDate) {
		this.edititionDate = edititionDate;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String[] getAuthors() {
		return this.authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

}
