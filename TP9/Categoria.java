package TP9;

//para tener en cuenta la tabla sql
//CREATE TABLE categorias (
   // id INT AUTO_INCREMENT PRIMARY KEY,
   // nombre VARCHAR(100) NOT NULL UNIQUE,
   // descripcion VARCHAR(255)


public class Categoria {
     private int id;
    private String nombre;
    private String descripcion;

    public Categoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nombre='" + nombre + "', descripcion='" + descripcion + "'}";
    }

}
