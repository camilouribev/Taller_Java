package com.punto17;

public class Electrodomestico {

    static final double PRECIO_BASE_DEFAULT=100;
    static final int PESO_DEFAULT=5;
    static final String  COLOR_DEFAULT="BLANCO";
    static final char CONSUMO_DEFAULT= 'F';

    private double precioBase;
    private String color;
    private char consumo;
    private double peso;

    public Electrodomestico(){
        this.color = COLOR_DEFAULT;
        this.consumo = CONSUMO_DEFAULT;
        this.precioBase = PRECIO_BASE_DEFAULT;
        this.peso = PESO_DEFAULT;

    }

    public Electrodomestico(double precioBase, double peso){
        this.color = COLOR_DEFAULT;
        this.consumo = CONSUMO_DEFAULT;
        this.precioBase = precioBase;
        this.peso = peso;
    }
    public Electrodomestico(double precioBase, double peso, String color, char consumo){
        this.color = color;
        this.consumo = consumo;
        this.precioBase = precioBase;
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra){
        char consumo = Character.toUpperCase(letra);
        switch (consumo){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                return consumo;
            default:
                return 'F';
        }
    }

    private String comprobarColor(String color){
        String color_upper = color.toUpperCase();
        switch (color_upper){
            case "BLANCO":
            case "NEGRO":
            case "ROJO":
            case "AZUL":
            case "GRIS":
                return color_upper;
            default:
                return "BLANCO";
        }
    }
    public double recargoPorPeso(){
        double peso = getPeso();
        double recargo = 0;
        if(peso > 80){
            recargo = 100;
        }else if(peso >= 50 && peso < 80 ){
            recargo =80;
        }else if(peso >= 20 && peso < 50 ){
            recargo = 50;
        }else if (peso >= 0 && peso < 20 ){
            recargo = 10;
        }
        return recargo;
    }

    public double recargoPorConsumo() {
        char consumo = getConsumo();
        double recargo;
        switch (consumo) {
            case 'A':
                recargo = 100;
                break;
            case 'B':
                recargo = 80;
                break;
            case 'C':
                recargo = 60;
                break;
            case 'D':
                recargo = 50;
                break;
            case 'E':
                recargo = 30;
                break;
            case 'F':
                recargo = 10;
                break;
            default:
                recargo=0;
                break;
        }
        return  recargo;
    }


    public double precioFinal(){
        double precioFinal = getPrecioBase()+recargoPorConsumo()+recargoPorPeso();
        return precioFinal;
    }


    public double getPrecioBase() {
        return precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public char getConsumo() {
        return consumo;
    }

    public String getColor() {
        return color;
    }
}
