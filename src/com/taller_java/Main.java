package com.taller_java;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String inicio;
        int eleccion;
        do {
            inicio = JOptionPane.
                    showInputDialog(null, "Que punto quieres probar?: \n 1.Comparación " +
                            "I\n 2.Comparación II\n 3. Área de un círculo \n 4. Cálculo precio con IVA \n 5. Pares While " +
                            "\n 6. Pares ciclo For "+ "\n 7. Evita negativos " + "\n 8. ¿Laboral o festivo? " +
                            "\n 9. Concatenación de cadenas " + "\n 10. Eliminación de espacios en cadenas ", "Taller Java Sofka U", JOptionPane.QUESTION_MESSAGE);
            if (!esNum(inicio)) return;
            eleccion = Integer.parseInt(inicio);

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

                case 4:
                    punto4();
                    break;

                case 5:
                    punto5();
                    break;
                case 6:
                    punto6();
                    break;

                case 7:
                    punto7();
                    break;

                case 8:
                    punto8();
                    break;

                case 9:
                    punto9();
                    break;

                case 10:
                    punto10();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresaste una opcion invalida",
                            "Hey!", JOptionPane.ERROR_MESSAGE);
            }
        } while (eleccion != 0);
    }

    private static void punto1() {
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
        if (!esNum(input1)) return;
        String input2 = JOptionPane.
                showInputDialog(null, "Selecciona el segundo número:", "Comparación de números", JOptionPane.QUESTION_MESSAGE);
        if (!esNum(input2)) return;

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

    private static void punto3() {

        String input = JOptionPane.
                showInputDialog(null, "Escribe el radio de la circunferencia en cm", "Área de un círculo", JOptionPane.QUESTION_MESSAGE);
        if(!esNum(input))return;
        double radio = Double.parseDouble(input);

        if (radio <= 0) {
            JOptionPane.showMessageDialog(null, "Un radio no puede ser igual o menor a cero",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double area = Math.PI * Math.pow(radio, 2);
        DecimalFormat areaFormat = new DecimalFormat("#.00"); // Recorta a máximo 2 decimales

        JOptionPane.showMessageDialog(null, "El área del círculo ingresado es de " + areaFormat.format(area) + " cm²",
                "Área de un círculo", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void punto4() {
        String input = JOptionPane.
                showInputDialog(null, "Escribe el precio base del producto en pesos", "Calculadora de precio con IVA", JOptionPane.QUESTION_MESSAGE);
        if (!esNum(input)) return;

        double precioBase = Double.parseDouble(input);
        if (precioBase <= 0) {
            JOptionPane.showMessageDialog(null, "El precio base no puede ser igual o menor a cero",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double precioIva = precioBase + precioBase * 0.21;
        DecimalFormat precioFormat = new DecimalFormat("#.00"); // Recorta a máximo 2 decimales

        JOptionPane.showMessageDialog(null, "El precio con IVA incluido es de " + precioFormat.format(precioIva) + " presos",
                "Calculadora de precio con IVA", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void punto5() {
        JOptionPane.showMessageDialog(null, "Observa la consola",
                "Pares While", JOptionPane.INFORMATION_MESSAGE);
        int num = 1;
        while (num < 101) {
            if (num % 2 == 0) {
                System.out.println(num + " Par");
            } else {
                System.out.println(num + " Impar");
            }
            num++;
        }
        return;
    }

    private static void punto6() {
        JOptionPane.showMessageDialog(null, "Observa la consola",
                "Pares ciclo For", JOptionPane.INFORMATION_MESSAGE);
        for (int num = 1; num < 101; num++) {
            if (num % 2 == 0) {
                System.out.println(num + " Par");
            } else {
                System.out.println(num + "  Impar");
            }
        }
    }

    private static void punto7(){
        boolean esPositivo = false;
        do {
            String input = JOptionPane.
                    showInputDialog(null, "Ingresa un número igual o mayor a cero", "Número positivo", JOptionPane.QUESTION_MESSAGE);
            if (!esNum(input)) return;
            double num = Double.parseDouble(input);
            if (num < 0 ) {
                JOptionPane.showMessageDialog(null, "Ingresa un número mayor que 0",
                        "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Felicitaciones!, " + input+ " es igual o mayor a 0",
                        "Número positivo", JOptionPane.INFORMATION_MESSAGE);
                esPositivo = true;
            }
        } while (esPositivo == false);

    }

    private static void punto8(){
        String dia = JOptionPane.
                showInputDialog(null, "Ingresa un dia de la semana y averigua si es festivo", "¿Laboral o festivo?", JOptionPane.QUESTION_MESSAGE);
        switch (dia.toUpperCase(Locale.ROOT)) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "MIÉRCOLES":
            case "JUEVES":
            case "VIERNES":
                JOptionPane.showMessageDialog(null, "El dia "+ dia+" es laboral",
                        "¿Laboral o festivo?", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "SABADO":
            case "SÁBADO":
            case "DOMINGO":
                JOptionPane.showMessageDialog(null, " El dia "+ dia+" es festivo!!!",
                        "¿Laboral o festivo?", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, dia + " no es un día válido",
                        "Error!", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    private static void punto9(){
        String sonrisa = "La sonrisa será la mejor arma contra la tristeza";
        String nuevo_mensaje = sonrisa.replaceAll("a","e").replaceAll("á", "e");
        String input = JOptionPane.
                showInputDialog(null, "Ingresa una frase:", "Concatenación de cadenas", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, nuevo_mensaje+ " "+ input,
                "Concatenación de cadenas", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void punto10(){
        String input = JOptionPane.
                showInputDialog(null, "Ingresa una frase: ", "Eliminación de espacios", JOptionPane.QUESTION_MESSAGE);
        String sinEspacios = input.replaceAll("\\s", ""); // using built in method
        JOptionPane.showMessageDialog(null, sinEspacios,
                "Eliminación de espacios", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean esNum(String input) {
        if (esDouble(input) || esInt(input)) { //inicialmente chequea si es double o int, si lo es, no hay problema y retorna falso
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un valor numérico válido",
                    "Error!", JOptionPane.ERROR_MESSAGE);
            return false;

        }
    }

    private static boolean esDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean esInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}




