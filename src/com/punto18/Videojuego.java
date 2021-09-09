package com.punto18;

import java.util.SplittableRandom;

public class Videojuego implements Entregable{
    static final int HORAS_DEFAULT = 10;
    static final boolean ENTREGADO_DEFAULT = false;
    private String titulo;
    private int horas;
    private String genero;
    private String compania;
    private boolean entregado;

    Videojuego(){
        this.titulo ="";
        this.horas = HORAS_DEFAULT;
        this.genero = "";
        this.compania = "";
        this.entregado = ENTREGADO_DEFAULT;
    }

    Videojuego(String titulo, int horas){
        this.titulo =titulo;
        this.horas = horas;
        this.genero = "";
        this.compania = "";
        this.entregado = ENTREGADO_DEFAULT;
    }

    Videojuego(String titulo, int horas, String genero, String compania){
        this.titulo =titulo;
        this.horas = horas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = ENTREGADO_DEFAULT;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getHoras() {
        return horas;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Videojuego\n "+
                "Titulo: " + titulo + "\n" +
                "Horas: " + horas + "\n"+
                "Genero: " + genero + "\n" +
                "Compañia: " + compania +  "\n" +
                "Entregado: " + entregado +  "\n";
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado= false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

}

