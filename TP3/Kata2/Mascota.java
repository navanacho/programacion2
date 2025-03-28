package TP3.Kata2;

public class Mascota {
    //atributos encapsulados
    private String nombre;
    private String especie;
    private int edad;

    //constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    //metodo mostrar informacion
    public void mostrarInfo() {
        System.out.println("\nInformacion de la mascota: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    //metodo para aumentar la edad
    public void cumplirAños() {
        edad++;
        System.out.println("Cumple un año, " + nombre + "Ahora tiene " + edad + "años.");
    }

    //getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
