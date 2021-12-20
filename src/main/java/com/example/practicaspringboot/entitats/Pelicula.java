package com.example.practicaspringboot.entitats;
public class Pelicula {
    private int id;
    private String titol;
    private String any;
    private String director;
    private String genere;

    public Pelicula(int id, String titol, String any, String director, String genere) {
        this.id = id;
        this.titol = titol;
        this.any = any;
        this.director = director;
        this.genere = genere;
    }
    public Pelicula (int id){
        this.id = id;
    }

    public Pelicula() {
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
