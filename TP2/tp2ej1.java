package TP2;

import java.util.Scanner;

public class tp2ej1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año: ");
        int año = scanner.nextInt();

        boolean esBisiesto = false;

        //verificar si el año es bisiesto o no 
        if (año % 4 == 0 && año % 100 != 0) {
            esBisiesto = true;
        
            if (año % 400 == 0){
            esBisiesto = true;
            }    
        }

        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
        scanner.close();
    }
}