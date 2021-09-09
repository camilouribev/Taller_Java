package com.punto17;

public class Televisor extends Electrodomestico{
    int resolucion;
    boolean esTDT;
    static final int RESOLUCION_DEFAULT = 20;
    static final boolean ES_TDT_DEFAULT = false;

    public Televisor(){
        super();
        this.resolucion = RESOLUCION_DEFAULT;
        this.esTDT = ES_TDT_DEFAULT;
    }

    public Televisor(double precioBase, double peso){
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEFAULT;
        this.esTDT = ES_TDT_DEFAULT;

    }

    public Televisor(int resolucion, boolean esTDT){
        super();
        this.resolucion = resolucion;
        this.esTDT = esTDT;
    }


    public int getResolucion() {
        return resolucion;
    }
    public boolean getEsTDT(){
        return esTDT;
    }

    @Override
    public double precioFinal() {

        double recargo = 0;
        if(getResolucion() > 40){
            recargo =  super.precioFinal()*0.3;
        }

        if(getEsTDT()){
            recargo += 50;
        }
        return super.precioFinal()+recargo;
    }
}
