package com.punto18;

public class Serie implements Entregable {
    static final int TEMPORADAS_DEFAULT = 3;
    static final boolean ENTREGADO_DEFAULT = false;
    private String titulo;
    private String creador;
    private String genero;
    private int temporadas;
    private boolean entregado;

    Serie(){
        this.titulo = "";
        this.creador = "";
        this.genero = "";
        this.temporadas = TEMPORADAS_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
    }

    Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
        this.genero = "";
        this.temporadas = TEMPORADAS_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
    }

    Serie(String titulo, String creador, String genero, int temporadas){
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = temporadas;
        this.entregado = ENTREGADO_DEFAULT;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Serie \n" +
                "titulo: " + titulo + "\n" +
                "Creador: " + creador + "\n" +
                "Genero: " + genero + "\n" +
                "Temporadas: " + temporadas +"\n"+
                "Entregado: " + entregado + "\n";
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

    @Override
    public void compareTo(Object a) {

    }
}
