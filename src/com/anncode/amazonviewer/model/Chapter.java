package com.anncode.amazonviewer.model;

import java.util.Date;
import java.util.ArrayList;

public class Chapter extends Movie {

	private int id;
	private int sessionNumber;

	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);// agarra los atributos de Chapter
		this.setSessionNumber(sessionNumber);
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}

	@Override
	public int getId() {
		return this.id;
	}

	public static ArrayList<Chapter> makeChaptersList() {
		ArrayList<Chapter> chapters = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			// Chapter(String title, String genre, String creator, int duration, short year,
			// int sessionNumber)
			chapters.add(new Chapter("Chapter " + i, "Genero " + i, "Creador " + i, 120 + i, (short) (2017 + i), i));
		}
		return chapters;
	}

}
