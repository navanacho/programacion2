package TP3.Kata5;

public class SimuladorAgenciaEspacial {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Enterprise", 50);
        nave.mostrasInfo();

        //avanzar 60 unidades
        System.out.println("Intento de avance inicial:");
        nave.avanzar(60);

        //revargar 40 unidades
        System.out.println("Recarga de combustible:");
        nave.recargarCombustible(40);

        //avanzar 60 unidades
        System.out.println("Intento de avance luego de recargar:");
        nave.avanzar(60);

        //mostrar estado final
        System.out.println("Estado final:");
        nave.mostrasInfo();
    }
}
