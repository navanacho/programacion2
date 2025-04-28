package TP5;
//kata1.2
public class Usuario {
    private int id;
    private String nombre;
    private String email;

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Usuario ID: " + id + ", Nombre: " + nombre + ", Email: " + email;
    }  
}
