package TP7.Kata2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class manejoErrores {
    try {
    int a = 10;
    int b = 0;
    int resultado = a / b;
 } catch (ArithmeticException e) {
    System.out.println("Error: División por cero.");
 }

    try {
    int numero = Integer.parseInt("Hola");
 } catch (NumberFormatException e) {
    System.out.println("Error: No es un número válido.");
 }

    try {
    BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
    System.out.println(br.readLine());
    br.close();
 } catch (FileNotFoundException e) {
    System.out.println("Error: Archivo no encontrado.");
 }

    try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
    System.out.println(br.readLine());
 } catch (IOException e) {
    System.out.println("Error al leer el archivo.");
 }
}




