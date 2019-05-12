package com.anncode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Serie extends Film {

	private int id;
	private int sessionQuantity;
	private ArrayList<Chapter> chapters;// es una coleccion de objetos
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

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapter(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	public static ArrayList<Serie> makeSeriesList() {
		ArrayList<Serie> series = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			series.add(new Serie("Serie " + i, "Genero " + i, "Creador " + i, 120 + i, (short) (2017 + i)));
		}
		return series;
	}
}
