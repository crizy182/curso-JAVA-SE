package com.anncode.amazonviewer.model;

import java.util.Date;

public class Publication {

    private String title;
    private Date editionDate;
    private String editorial;
    private String[] authors;
    private boolean viewed;

    public Publication(String title, Date editionDate, String editorial) {
        super();
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String isViewed() {
        String visto = "";
        if (viewed == true) {
            visto = "si";
        } else {
            visto = "no";
        }
        return visto;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }
}