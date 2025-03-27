package TP2;
import java.util.Scanner;
public class tp2ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("La edad no puede ser negativa.");
        } else{
            String etapa;
            if (edad < 12) {
                etapa = "niño";
            }else if (edad <= 17) {
                etapa = "adolescente";
            }else if (edad <= 59){
                etapa = "adulto";
            }else {
                etapa = "adulto mayor";
            }
            System.out.println("Usted es un " + etapa);
        }
        scanner.close();

    }
}
