package RECUPERATORIO;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //alumno
        Alumno alumno = new Alumno("Ignacio", "123456798", 01);
        System.out.println( "Alumno:" + alumno.getNombre() + "DNI: " + alumno.getDni() + "Legajo: " + alumno.getLegajo());

        //profesor
        Profesor profesor = new Profesor("Ricardo Gomez", "23456984", 22);
        System.out.println("Profesor: "+ profesor.getNombre() + "DNI: " + profesor.getDni() + "Legajo: " + profesor.getLegajo());

        //curso
        Curso curso = new Curso("Programacion", "comision 4");
        System.out.println("Curso: " + curso.getNombre() + " | Código: " + curso.getCodigo());

        //unidad tematica
        UnidadTematica unidad1 = new UnidadTematica("Java", "Programacion orientada a objetos");
        curso.agregarUnidadTematica(unidad1);

        //examen
        Examen examen = new Examen(new Date(), "final");
        System.out.println("Examen: " + examen.getTipo() + "Fecha: " + examen.getFecha());

        //nota
        Nota nota = new Nota(8.5, examen);
        System.out.println("Nota: " + nota.getNota() + "Tipo: " + examen.getTipo());

    }

}
