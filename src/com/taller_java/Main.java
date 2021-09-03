package com.taller_java;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args) {

            int pick = 0;
            do {

                pick = Integer.parseInt(JOptionPane.
                        showInputDialog("Revisión de taller Java SofkaU: \n 1.Punto 1 "));

                switch (pick) {
                    case 1:
                        System.out.println("Escogiste opción 1");
                        break;
                    case 2:
                        System.out.println("escogiste opción 2");
                        break;
                    case 3:
                        System.out.println("Escogiste opción 3");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ingresaste una opcion invalida",
                                "Hey!", JOptionPane.ERROR_MESSAGE);
                }
            }while (pick != 0);
        }

    }


