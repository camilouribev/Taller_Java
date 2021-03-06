package com.taller_java;
import com.punto16.*;
import com.punto17.*;
import com.punto18.*;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Locale;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {

    static final String ERROR = "Error";

    public static void main(String[] args) {
        String inicio;
        int eleccion;
        do {
            inicio = JOptionPane.
                    showInputDialog(null, "¿Que punto quieres probar?:\n \n 1.Comparación " +
                            "I\n 2.Comparación II\n 3. Área de un círculo \n 4. Cálculo precio con IVA \n 5. Pares While " +
                            "\n 6. Pares ciclo For "+ "\n 7. Evita negativos " + "\n 8. ¿Laboral o festivo? " +
                            "\n 9. Concatenación de cadenas " + "\n 10. Eliminación de espacios en cadenas " +
                            "\n 11. Contador de caracteres y vocales " +  "\n 12. Comparador de cadenas " +
                            "\n 13. Fecha y hora"+ "\n 14. Cuenta hasta 1000 "+ "\n 15. Gestión cinematográfica "
                            + "\n 16. Clase Persona" + "\n 17. Electrodomésticos"+ "\n 18. Series y videojuegos", "Taller Java Sofka U", JOptionPane.QUESTION_MESSAGE);
            if (!esNum(inicio))return;
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

                case 11:
                    punto11();
                    break;
                case 12:
                    punto12();
                    break;
                case 13:
                    punto13();
                    break;
                case 14:
                    punto14();
                    break;
                case 15:
                    punto15();
                    break;
                case 16:
                    Punto16.ejecutar();
                    break;
                case 17:
                    Punto17.ejecutar();
                    break;
                case 18:
                    Punto18.ejecutar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresaste una opcion invalida",
                            ERROR, JOptionPane.ERROR_MESSAGE);
            }
        } while (eleccion != 000);
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
                    ERROR, JOptionPane.ERROR_MESSAGE);
            return;
        }
        double area = Math.PI * Math.pow(radio, 2);
        DecimalFormat areaFormat = new DecimalFormat("#.00"); // Recorta a máximo 2 decimales

        JOptionPane.showMessageDialog(null, "El área del círculo ingresado es de " + areaFormat.format(area) + " cm²",
                "Área de un círculo", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void punto4() {
        final double IVA = 0.21;
        String input = JOptionPane.
                showInputDialog(null, "Escribe el precio base del producto en pesos", "Calculadora de precio con IVA", JOptionPane.QUESTION_MESSAGE);
        if (!esNum(input)) return;

        double precioBase = Double.parseDouble(input);
        if (precioBase <= 0) {
            JOptionPane.showMessageDialog(null, "El precio base no puede ser igual o menor a cero",
                    ERROR, JOptionPane.ERROR_MESSAGE);
            return;
        }
        double precioIva = precioBase + precioBase * IVA;
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
                        ERROR, JOptionPane.ERROR_MESSAGE);
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
                        ERROR, JOptionPane.ERROR_MESSAGE);
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
        if (!checkString(input)) return;


        String sinEspacios = input.replaceAll("\\s", "");
        JOptionPane.showMessageDialog(null, sinEspacios,
                "Eliminación de espacios", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void punto11(){
        String input = JOptionPane.
                showInputDialog(null, "Ingresa una frase: ", "Contador de caracteres y vocales", JOptionPane.QUESTION_MESSAGE);
        int size = input.length();
        if (!checkString(input)) return;

        String inputLower = input.toLowerCase(Locale.ROOT);
        int vowels = 0;
            for (int i = 0; i < inputLower.length(); i++)
            {
                if (inputLower.charAt(i) == 'a' || inputLower.charAt(i) == 'e' || inputLower.charAt(i) == 'i'
                        || inputLower.charAt(i) == 'o' || inputLower.charAt(i) == 'u' || inputLower.charAt(i) == 'á' ||
                        inputLower.charAt(i) == 'é' || inputLower.charAt(i) == 'í'
                        || inputLower.charAt(i) == 'ó' || inputLower.charAt(i) == 'ú')
                {
                    vowels++;
                }
            }

        JOptionPane.showMessageDialog(null, "La frase ingresada tiene "+size+" caracteres y "+vowels+" vocales",
                "Contador de caracteres y vocales", JOptionPane.INFORMATION_MESSAGE);

    }

    private static void punto12(){
        String string_1 = JOptionPane.
                showInputDialog(null, "Ingresa la primera palabra o frase: ", "Comparación de cadenas", JOptionPane.QUESTION_MESSAGE);
        if (!checkString(string_1)) return;

        String string_2 = JOptionPane.
                showInputDialog(null, "Ingresa la segunda palabra o frase: ", "Comparación de cadenas", JOptionPane.QUESTION_MESSAGE);
        if (!checkString(string_2)) return;
        if(string_1.equals(string_2)){
            JOptionPane.showMessageDialog(null, "Las palabras o frases son iguales",
                    "Comparación de cadenas", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "La diferencia entre las cadenas es:\n"+diferencia(string_1,string_2),
                    "Comparación de cadenas", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void punto13(){
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime hora_actual = LocalDateTime.now();
        JOptionPane.showMessageDialog(null, "La Fecha y hora actuales son:\n"+formateador.format(hora_actual),
                "Fecha y hora ", JOptionPane.INFORMATION_MESSAGE);

    }

    private static void punto14(){
        String input = JOptionPane.
                showInputDialog(null, "Ingresa un número: ", "Contador", JOptionPane.QUESTION_MESSAGE);
        if (!esNum(input)) return;
        JOptionPane.showMessageDialog(null, "Observa la consola",
                "Contador", JOptionPane.INFORMATION_MESSAGE);
        double input_double = Math.round(Double.parseDouble(input));
        int valor_inicial = (int) input_double;

        for(int i = valor_inicial; i <=1000; i+=2 ){
            System.out.println(i);
        }
    }

    private static void punto15(){
        boolean salir = false;
        do {
            String inicio = JOptionPane.
                    showInputDialog(null, " \n 1.NUEVO ACTOR " +
                            "\n 2.BUSCAR ACTOR\n 3. ELIMINAR ACTOR \n 4. MODIFICAR ACTOR \n 5. VER TODOS LOS ACTORES " +
                            "\n 6. VER PELICULAS DE LOS ACTORES "+ "\n 7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES " + "\n 8. SALIR ", "***GESTIÓN CINEMATOGRÁFICA***", JOptionPane.QUESTION_MESSAGE);

            switch (inicio) {
                case "8":
                        salir = true;
                        return;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresaste una opcion invalida",
                            ERROR, JOptionPane.ERROR_MESSAGE);
            }
        } while (!salir );
    }




    public static boolean esNum(String input) {
        if (esDouble(input) || esInt(input)) { //inicialmente chequea si es double o int, si lo es, no hay problema y retorna falso
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un valor numérico válido",
                    ERROR, JOptionPane.ERROR_MESSAGE);
            return false;

        }
    }

    public static boolean esDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean esInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkString(String input){
        if(input.length() == 0 ){
            JOptionPane.showMessageDialog(null, "No ingresaste ninguna cadena",
                    ERROR, JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            return true;
        }
    }


    public static String diferencia(String str1, String str2) {


        if (str1 == null) {
            return str2;
        }
        if (str2 == null) {
            return str1;
        }
        int at = indiceDeDiferencia(str1, str2);
        if (at == 404) {
            return "";
        }
        return str2.substring(at);
    }

    public static int indiceDeDiferencia(CharSequence cs1, CharSequence cs2) {
        if (cs1 == cs2) {
            return 404;
        }
        if (cs1 == null || cs2 == null) {
            return 0;
        }
        int i;
        for (i = 0; i < cs1.length() && i < cs2.length(); ++i) {
            if (cs1.charAt(i) != cs2.charAt(i)) {
                break;
            }
        }
        if (i < cs2.length() || i < cs1.length()) {
            return i;
        }
        return 404;
    }

}




