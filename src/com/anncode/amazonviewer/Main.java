package com.anncode.amazonviewer;

import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

import com.anncode.amazonviewer.model.Movie;
import com.anncode.amazonviewer.model.Serie;
import com.anncode.amazonviewer.model.Chapter;

public class Main {

	public static void main(String[] args) {

		showMenu();

	}

	public static void showMenu() {
		int exit = 0;
		do {

			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");

			// Leer la respuesta del usuario
			// Scanner sc = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();

			switch (response) {
			case 0:
				// salir

				break;
			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				showBooks();
				break;
			case 4:
				showMagazines();
				break;
			case 5:
				makeReport();
				break;
			case 6:
				// Date date = new Date();
				makeReport(new Date());
				break;

			default:
				System.out.println();
				System.out.println("....¡¡Selecciona una opción!!....");
				System.out.println();

				break;
			}

		} while (exit != 0);
	}

	public static void showMovies() {
		int exit = 1;
		ArrayList<Movie> movies = Movie.makeMoviesList();
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			for (int i = 0; i <= (movies.size() - 1); i++) {
				System.out.println(i + 1 + ". " + movies.get(i).getTitle() + " visto " + movies.get(i).isViewed());
			}
			System.out.println("0. Back to menu");
			System.out.println();
			// Read the user's response
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();

			if (response == 0) {
				showMenu();
			}

			Movie movieSelected = movies.get(response - 1);
			movieSelected.setViewed(true);
			Date dateI = movieSelected.startToSee(new Date());

			for (int i = 0; i < 10000; i++) {
				System.out.println(".......");
			}
			// del objeto movieselected de la clase movie creado se usan los atributos
			// stoptosee
			movieSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("viste la pelicula " + movieSelected);
			System.out.println("por " + movieSelected.getTimeViewed() + " seg");

			if (response == 0) {
				// exit = 0;
				showMenu();
			}

		} while (exit != 0);
	}

	public static void showSeries() {
		int exit = 2;
		ArrayList<Serie> series = Serie.makeSeriesList();
		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();

			for (int i = 0; i <= (series.size() - 1); i++) {
				System.out.println(i + 1 + ". " + series.get(i).getTitle() + " visto " + series.get(i).isViewed());
			}

			System.out.println("0. Back to Movies");
			System.out.println();
			// Read the user's response
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();

			switch (response) {

			case 0:
				showMovies();
				break;
			case 1:
				showChapters();
				break;
			case 2:
				showChapters();
				break;
			case 3:
				showChapters();
				break;
			case 4:
				showChapters();
				break;
			case 5:
				showChapters();
				break;

			default:
				System.out.println();
				System.out.println("....¡¡Selecciona una opción!!....");
				System.out.println();

				break;
			}

		} while (exit != 0);
	}

	public static void showChapters() {
		int exitChapters = 1;
		ArrayList<Chapter> chapters = Chapter.makeChaptersList();
		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();

			for (int i = 0; i <= (chapters.size() - 1); i++) {
				System.out.println(i + 1 + ". " + chapters.get(i).getTitle() + " visto " + chapters.get(i).isViewed());
			}

			System.out.println("0. Back to menu");
			System.out.println();
			// Read the user's response
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();

			if (response == 0) {
				showMenu();
			}

			Chapter ChapterSelected = chapters.get(response - 1);
			ChapterSelected.setViewed(true);
			Date dateI = ChapterSelected.startToSee(new Date());

			for (int i = 0; i < 10000; i++) {
				System.out.println(".......");
			}
			// del objeto Chapterselected de la clase Chapter creado se usan los atributos
			// stoptosee
			ChapterSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("viste el capitulo " + ChapterSelected);
			System.out.println("por " + ChapterSelected.getTimeViewed() + " seg");

			if (response == 0) {
				// exit = 0;
				showMenu();
			}

		} while (exitChapters != 0);
	}

	public static void showBooks() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();
		} while (exit != 0);
	}

	public static void showMagazines() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();
		} while (exit != 0);
	}

	public static void makeReport() {

	}

	// El siguiente metodo es el mismo que el anterior pero se encuentra
	// sobrecargado con el argumento
	// date de la clase Date su valor es ingresado en la línea 54
	public static void makeReport(Date date) {

	}
}
