package TP7.Kata1;

import java.util.ArrayList;
import java.util.List;
//kata 1.1
public interface Pagable {
    interface Pagable {
    double calcularTotal();
}

class Producto implements Pagable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularTotal() {
        return precio;
    }
}

class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::calcularTotal).sum();
    }
}
}

