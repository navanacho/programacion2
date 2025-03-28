package TP3.Kata4;

public class Gallina {
    //atributos encapsulados
    private String idGallina;
    private int edad;
    private int huevosPuestos = 0;

    public Gallina(String idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    //metodo para poner huevos
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + "ha puesto un huevo. Total: " + huevosPuestos);
    }

    //metodo para envjecer
    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + "ha cumplido un año. Ahora tiene: " + edad + "años");
    }

    //metodo mostrar info
    public void mostrarInfo() {
        System.out.println("Informacion de la gallina: " + idGallina + ":");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }

    public String getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    
}
