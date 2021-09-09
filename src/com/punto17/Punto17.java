package com.punto17;

import javax.swing.*;

public class Punto17 {

    public static void ejecutar() {
        double contadorPrecioElectrodomesticos = 0;
        double contadorPrecioLavadoras = 0;
        double contadorPrecioTelevisores = 0;

        Electrodomestico airfryer = new Electrodomestico();
        Electrodomestico batidora = new Electrodomestico(50, 2);
        Electrodomestico aspiradora = new Electrodomestico(120, 9);
        Electrodomestico nevera = new Electrodomestico(400, 60, "BLANCO", 'B');
        Electrodomestico microondas = new Electrodomestico(70, 6);

        Televisor tv1 = new Televisor(230, 20);
        Televisor tv2 = new Televisor();
        Televisor tv3 = new Televisor(50, true);

        Lavadora lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora(500, 50);
        Lavadora lavadora3 = new Lavadora(17);

        Electrodomestico [] electrodomesticos = {airfryer, batidora, aspiradora, nevera, microondas, tv2, tv3, lavadora1, lavadora2, lavadora3};


        for(Electrodomestico item: electrodomesticos){
            contadorPrecioElectrodomesticos+= item.precioFinal();

            if (item instanceof Lavadora){
                contadorPrecioLavadoras += item.precioFinal();
            }else if(item instanceof Televisor){
                contadorPrecioTelevisores += item.precioFinal();
            }
        }


        JOptionPane.showMessageDialog(null, "Precio total televisores: "+ contadorPrecioTelevisores+" €\n"+
                        "Precio total lavadoras: "+ contadorPrecioLavadoras+" €\n"+
                        "Precio de todos los electrodomésticos: "+ contadorPrecioElectrodomesticos+" €\n",
                "Precio de electrodomésticos", JOptionPane.INFORMATION_MESSAGE);

        return;
    }
}
