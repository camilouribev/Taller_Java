package com.punto17;

public class Lavadora extends Electrodomestico{
    static final int CARGA_DEFAULT = 5;
    private double carga;

    public Lavadora(){
        super();
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(double precioBase, double peso){
        super(precioBase, peso);
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(double carga){
        super();
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precio;
        if(getCarga()>30){
            precio = 50;
        }else{
            precio = 0;
        }
        return precio+ super.precioFinal();
    }
}

