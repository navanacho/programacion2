package TP3.Kata3;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter", "J.K Rowling", 1997);

        System.out.println("...Informacion inicial...");
        libro1.mostrarInfo();

        System.out.println("Cambio de año (invalido):");
        libro1.setAñoPublicacion(1775);//no deberia cambiar

        System.out.println("Cambio de año (valido):");
        libro1.setAñoPublicacion(2000);//deberia cambiar

        System.out.println("...Informacion actualizada...");
        libro1.mostrarInfo();
    }
}
