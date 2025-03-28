package TP3.Kata1;

public class Main {
    public static void main(String[] args) {
        //crear instancia
        Estudiante estudiante1 = new Estudiante("juan", "Perez", "Programacion", 7.5);
        
        //mostrar informacion
        estudiante1.mostrarInfo();

        //aumentar calificacion
        System.out.println("subiendo calificacion 2 puntos...");
        estudiante1.subirCalificacion(2);
        estudiante1.mostrarInfo();

        //disminuir puntos
        System.out.println("bajando punto en 1.5 puntos...");
        estudiante1.bajarCalificacion(1.5);
        estudiante1.mostrarInfo();
    }

}
