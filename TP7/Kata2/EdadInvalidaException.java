package TP7.Kata2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EdadInvalidaException {
    try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
    System.out.println(br.readLine());
} catch (IOException e) {
    System.out.println("Error al leer el archivo.");
}


}
