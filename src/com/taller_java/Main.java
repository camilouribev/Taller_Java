package com.taller_java;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        int eleccion;
        do {
            eleccion = Integer.parseInt(JOptionPane.
                    showInputDialog(null, "Que punto quieres probar?: \n 1.Compración I\n 2.Comparación II\n 3. Área de un círculo ", "Taller Java Sofka U", JOptionPane.QUESTION_MESSAGE));
            switch (eleccion) {
                case 1:
                    punto1();
                    break;
                case 2:
                    punto2();
                    break;
                case 3:
                    punto3();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresaste una opcion invalida",
                            "Hey!", JOptionPane.ERROR_MESSAGE);
            }
        } while (eleccion != 0);
    }

    private static void punto1(){
        double num1 = 2;
        double num2 = 7;
        String message;

        if (num1 < num2) {
            message = num1 + " es menor que " + num2;
        } else if (num1 == num2) {
            message = "Los numeros ingresados son iguales";
        } else {
            message = num1 + " es mayor que " + num2;
        }
        JOptionPane.showMessageDialog(null, message,
                "Comparación de números", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void punto2() {
        String input1 = JOptionPane.
                showInputDialog(null, "Selecciona el primer número:", "Comparación de números", JOptionPane.QUESTION_MESSAGE);
        String input2 = JOptionPane.
                showInputDialog(null, "Selecciona el segundo número:", "Comparación de números", JOptionPane.QUESTION_MESSAGE);
        if(input1.isEmpty() || input2.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Ingresa un valor válido",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        String message;

        if (num1 < num2) {
            message = num1 + " es menor que " + num2;
        } else if (num1 == num2) {
            message = "Los numeros ingresados son iguales";
        } else {
            message = num1 + " es mayor que " + num2;
        }
        JOptionPane.showMessageDialog(null, message,
                "Resultado comparación", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void punto3(){
        double area;
        String input = JOptionPane.
                showInputDialog(null, "Selecciona el radio de la circunferencia en cm", "Área de un círculo", JOptionPane.QUESTION_MESSAGE);
        if(input.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Ingresa un valor válido",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double radio = Double.parseDouble(input) ;

        if(radio <=0){
            JOptionPane.showMessageDialog(null, "Un radio no puede ser igual o menor a cero",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        area = Math.PI* Math.pow(radio,2);
        DecimalFormat areaFormat = new DecimalFormat("#.00"); // Recorta decimales a máximo 2

        JOptionPane.showMessageDialog(null, "El área del círculo ingresado es de "+areaFormat.format(area)+" cm²",
                "Área de un círculo", JOptionPane.INFORMATION_MESSAGE);
    }

    


}




