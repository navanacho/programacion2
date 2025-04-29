package TPCOLECCIONES;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private Categoriaproducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, Categoriaproducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Precio: $" + precio + ", Cantidad: " + cantidad + ", Categoría: " + categoria);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Categoriaproducto getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoriaproducto categoria) {
        this.categoria = categoria;
    }

    
}
