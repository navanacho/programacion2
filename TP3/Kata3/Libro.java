package TP3.Kata3;
import java.time.Year;
public class Libro {
    //atributos privados
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);//uso setter para validacion
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int nuevoAño) {
        int añoActual = Year.now().getValue();

        if (nuevoAño >= 1900 && nuevoAño <= añoActual) {
            this.añoPublicacion = nuevoAño;
        } else {
            System.out.println("El año de publiccion debe estar entre 1900 y " + añoActual);
        }
    }

    //metodo mostrar info
    public void mostrarInfo() {
        System.out.println("Informacion del libro: ");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + añoPublicacion);
    }
}
