package com.punto16;
import javax.swing.*;
import com.taller_java.Main;

import java.util.Locale;

public class Punto16 {
    public static void ejecutar() {
        String nombre = JOptionPane.
                showInputDialog(null, "Ingresa el nombre: ", "Crear persona", JOptionPane.QUESTION_MESSAGE);
        if(!com.taller_java.Main.checkString(nombre))return;

        String age = JOptionPane.
                showInputDialog(null, "Ingresa la edad: ", "Crear persona", JOptionPane.QUESTION_MESSAGE);
        if (!com.taller_java.Main.esNum(age)) return;
        int edad = Integer.parseInt(age);

        String sexo = JOptionPane.
                showInputDialog(null, "Ingresa sexo (H o M): ", "Crear persona", JOptionPane.QUESTION_MESSAGE).toUpperCase();
        if(!sexo.equals("M") && !sexo.equals("H") ){
            JOptionPane.showMessageDialog(null, "No ingresaste un sexo válido",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String weight = JOptionPane.
                showInputDialog(null, "Ingresa peso en kg: ", "Crear persona", JOptionPane.QUESTION_MESSAGE);
        if (!com.taller_java.Main.esNum(weight)) return;
        double peso = Double.parseDouble(weight);

        if(peso < 2 || peso > 500){
            JOptionPane.showMessageDialog(null, "No ingresaste un peso válido",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String height = JOptionPane.
                showInputDialog(null, "Ingresa altura en m: ", "Crear persona", JOptionPane.QUESTION_MESSAGE);
        if (!com.taller_java.Main.esNum(height)) return;
        double estatura = Double.parseDouble(height);
        if(estatura < 0.3 || estatura > 2.5){
            JOptionPane.showMessageDialog(null, "No ingresaste una estatura válida",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        Persona persona1 = new Persona(nombre, edad, sexo, estatura, peso);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();


        JOptionPane.showMessageDialog(null, "La persona 1 "+ chequearEsMayorDeEdad(persona1)+ " y " + chequearIMC(persona1)+"\n" +
                        "La persona 2 " + chequearEsMayorDeEdad(persona2)+ " y "+ chequearIMC(persona2)+"\n"+
                        "La persona 3 " + chequearEsMayorDeEdad(persona2)+ " y "+ chequearIMC(persona3)+"\n",
                    "Chequeo de Edad e IMC", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Persona 1 :"+ persona1+"\n"+
                        "\n Persona 2 :"+ persona2+"\n"+
                        "\n Persona 3 :"+ persona3+"\n",
                "Datos personales", JOptionPane.INFORMATION_MESSAGE);

        return;


    }

    public static String chequearEsMayorDeEdad(Persona persona){
        if(persona.esMayorDeEdad()){
            return("es mayor de edad");
        }
        else {
            return("es menor de edad");
        }
    }
    public static String chequearIMC(Persona persona){
        if(persona.calcularIMC()==-1){
            return("presenta bajo peso");
        }
        else if(persona.calcularIMC()==0){
            return("está en el peso ideal");
        }
        else {
            return("tiene sobrepeso");
        }
    }

}
