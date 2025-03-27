package TP2;

import java.util.Scanner;
public class tp2ej4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //solicitar datos al usuario
    System.out.println("Ingrese el precio del producto: ");
    double precio = scanner.nextDouble();

    System.out.println("Ingrese la categoria del producto (A, B o C): ");
    String categoria = scanner.next().toUpperCase();

    //validar categoria y calcular descuento
    double descuento = 0;
    boolean categoriaValida = true; 
    switch (categoria) {
        case "A":
            descuento = 0.10;
            break;
    
        case "B":
            descuento = 0.15;
            break;

        case "C" :
            descuento = 0.20;
            break;

        default:
        categoriaValida = false;
        System.out.println("La categoria no es valida.");

    }

    //mostrar los descuento y precios
    if (categoriaValida) {
        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;

        System.out.println("\nResumen de compra:");
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
    scanner.close();
  }  
}
