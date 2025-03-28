package TP3.Kata2;

public class Main {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota("Lola", "Caniche", 4);

        System.out.println("...Informacion inicial...");
        miMascota.mostrarInfo();

        miMascota.cumplirAños();

        System.out.println("...Informacion actualizada...");
        miMascota.mostrarInfo();

        miMascota.setEdad(5);
        System.out.println("...Despues de modificar la edad...");
        miMascota.mostrarInfo();
    }
}
