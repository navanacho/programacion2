package TP8.Kata2;
import TP8.Kata1.Producto;

public class testCarrito {
    public static void main(String[] args) {
        Carrito<Producto<?>> carrito = new Carrito<>();
        carrito.agregarProducto(new Producto<String>("SKU001", "Auriculares", 50.0));
        carrito.agregarProducto(new Producto<Integer>(222, "Monitor", 300.0));
        carrito.mostrarProductos();
        System.out.println("Total: $" + carrito.obtenerTotal());
    }

}
