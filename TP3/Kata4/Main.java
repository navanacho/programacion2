package TP3.Kata4;

public class Main {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina("AB-1", 2, 0);
        Gallina gallina2 = new Gallina("AB-2", 3, 0);

        //hacer que las gallinas pongan huevos
        System.out.println("...Produccion de huevos...");
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();

        //hacer envejecer a las gallinas
        System.out.println("... Las gallinas envejecen...");
        gallina2.envejecer();
        gallina2.envejecer();
        gallina1.envejecer();

        //mostrar info final
        System.out.println("...Informacion final...");
        gallina1.mostrarInfo();
        gallina2.mostrarInfo();
    }
}
