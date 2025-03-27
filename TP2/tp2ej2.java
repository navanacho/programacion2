package TP2;
import java.util.Scanner;

public class tp2ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //solicitar los numeros al usuario
        System.out.println("Ingrese el primer numero: ");
            int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
            int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
            int num3 = scanner.nextInt();
        //determinar el mayor
        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }else if ( num3 > mayor ) {
            mayor = num3;
        }

        System.out.println("El numero mayos es: " + mayor);
        scanner.close();
            
        
    }
}
