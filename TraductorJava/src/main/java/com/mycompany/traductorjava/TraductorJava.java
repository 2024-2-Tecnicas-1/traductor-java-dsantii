package com.mycompany.traductorjava;

import java.util.Scanner;

public class TraductorJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona el idioma / Select the language (Espanol/English): ");
        String idioma = sc.next();

        System.out.println("Ingrese el primer número del 0 a 100): ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número del 0 a 100: ");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;

        if (idioma.equalsIgnoreCase("Espanol")) {
            String numero1Palabra = NumsEspanol(numero1);
            String numero2Palabra = NumsEspanol(numero2);
            String sumaPalabra = NumsEspanol(suma);
            
            System.out.println("La suma de " + numero1Palabra + " más " + numero2Palabra + " es " + sumaPalabra);
        } else if (idioma.equalsIgnoreCase("English")) {
            String numero1Palabra = NumsEnglish(numero1);
            String numero2Palabra = NumsEnglish(numero2);
            String sumaPalabra = NumsEnglish(suma);
            
            System.out.println("The sum of " + numero1Palabra + " plus " + numero2Palabra + " is " + sumaPalabra);
        } 
    }

    private static String NumsEspanol(int num) {
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
        String[] decenas = {"", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};

        if (num < 20) {
            return unidades[num];
        } else if (num < 100) {
            int unidad = num % 10;
            int decena = num / 10;
            if (unidad == 0) {
                return decenas[decena];
            } else {
                return decenas[decena] + " y " + unidades[unidad];
            }
        } else if (num == 100) {
            return "cien";
        } else {
            return "";
        }
    }

    private static String NumsEnglish(int num) {
        String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (num < 20) {
            return units[num];
        } else if (num < 100) {
            int unit = num % 10;
            int ten = num / 10;
            if (unit == 0) {
                return tens[ten];
            } else {
                return tens[ten] + "-" + units[unit];
            }
        } else if (num == 100) {
            return "one hundred";
        } else {
            return "";
        }
    }
}
