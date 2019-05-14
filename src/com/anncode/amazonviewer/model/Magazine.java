package com.anncode.amazonviewer.model;

import java.util.Date;
import java.util.ArrayList;

public class Magazine extends Publication {

	private int id;

	public Magazine(String title, Date editionDate, String editorial) {
		super(title, editionDate, editorial);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n :: MAGAZINE ::" + "\n Title: " + getTitle() + "\n Editorial: " + getEditorial() + "\n Edition Date: "
				+ getEditionDate();
	}

	public static ArrayList<Magazine> makeMagazinesList() {
		ArrayList<Magazine> magazines = new ArrayList();
		Date dateM = new Date();
		for (int i = 0; i <= 5; i++) {
			// (String title, Date editionDate, String editorial)
			magazines.add(new Magazine("NY Time" + i, dateM, "The economist"));
		}
		return magazines;
	}
}