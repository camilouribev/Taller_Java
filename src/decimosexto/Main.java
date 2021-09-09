package decimosexto;
package com.taller_java;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.
                showInputDialog(null, "Ingresa el nombre: ", "Crear persona", JOptionPane.QUESTION_MESSAGE);
        String edad = JOptionPane.
                showInputDialog(null, "Ingresa la edad: ", "Crear persona", JOptionPane.QUESTION_MESSAGE);
        String sexo = JOptionPane.
                showInputDialog(null, "Ingresa sexo (H o M): ", "Crear persona", JOptionPane.QUESTION_MESSAGE);
        String peso = JOptionPane.
                showInputDialog(null, "Ingresa peso en kg: ", "Crear persona", JOptionPane.QUESTION_MESSAGE);
        String estatura = JOptionPane.
                showInputDialog(null, "Ingresa altura en m: ", "Crear persona", JOptionPane.QUESTION_MESSAGE);


        Persona p1 = new Persona(nombre,edad,sexo,estatura,peso);



        public static void chequearIMC(Persona persona){
            if(persona.calcularIMC()==-1){
                System.out.println("Estas bajo de peso");
            }
            else if(persona.calcularIMC()==0){
                System.out.println("Estas en tu peso ideal");
            }
            else {
                System.out.println("Estas en sobrepeso");
            }
        }
    }

}
