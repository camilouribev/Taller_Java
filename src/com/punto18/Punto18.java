package com.punto18;
import javax.swing.*;
import java.util.*;

public class Punto18 {
    public static void ejecutar(){

        int videojuegosEntregados=0;
        int seriesEntregadas=0;
        double maxValue = -1;
        int indiceVideojuegos = -1;
        int indiceSeries = -1;

        Serie fleabag = new Serie("Fleabag", "Phoebe Walter Bridge", "comedia", 2);
        Serie sharpObjects = new Serie("Sharp Objects", "Jean-Marc Vallée", "suspenso", 1);
        Serie serieGenerica = new Serie();
        Serie atlanta = new Serie("Atlanta", "Donald Glover","comedia-drama",2);
        Serie breakingBad = new Serie ("Breaking Bad", "Vince Gilligan", "drama", 5);

        Videojuego plants = new Videojuego("Plants vs Zombies", 8);
        Videojuego bloodborne = new Videojuego("Bloodborne", 20, "Acción-terror","From Software");
        Videojuego callOfDuty = new Videojuego("Call of Duty", 12);
        Videojuego gta = new Videojuego("GTA V", 18);
        Videojuego videojuegoGenerico = new Videojuego();


        Serie[] series = {fleabag,sharpObjects,serieGenerica,atlanta,breakingBad};
        Videojuego[] videojuegos = {plants,bloodborne, callOfDuty, gta, videojuegoGenerico};


        //Entrega algunos
        series[0].entregar();
        series[3].entregar();
        videojuegos[4].entregar();
        videojuegos[1].entregar();
        videojuegos[2].entregar();

        for(Videojuego item: videojuegos){
            if(item.isEntregado()){
                videojuegosEntregados++;
                item.devolver();
            }
        }
        for(Serie item: series){
            if(item.isEntregado()){
                seriesEntregadas++;
                item.devolver();
            }
        }
        //Localizar Videojuegos y Series con más horas y temporadas respectivamente:

        JOptionPane.showMessageDialog(null, "Se han entregado "+seriesEntregadas+" series y "+videojuegosEntregados+" videojuegos. \n\n"+
                "El videojuego más largo del catálogo es: \n"+masLargo(videojuegos)+"\n\n"+"La serie con más temporadas del catálogo es:\n"+masTemporadas(series),
                "Series y videojuegos", JOptionPane.INFORMATION_MESSAGE);


    }

    public static Serie masTemporadas(Serie[] series) {
        return Arrays.stream(series).max(Comparator.comparingInt(Serie::getTemporadas)).orElseThrow(NoSuchElementException::new);
    }
    public static Videojuego masLargo(Videojuego[] videojuegos) {
        return Arrays.stream(videojuegos).max(Comparator.comparingInt(Videojuego::getHoras)).orElseThrow(NoSuchElementException::new);
    }


}
