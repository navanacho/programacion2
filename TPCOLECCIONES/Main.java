package TPCOLECCIONES;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("1", "Manzana", 50.0, 100, Categoriaproducto.ALIMENTOS);
        Producto p2 = new Producto("2", "Laptop", 15000.0, 10, Categoriaproducto.ELECTRONICA);
        Producto p3 = new Producto("3", "Camiseta", 500.0, 50, Categoriaproducto.ROPA);
        Producto p4 = new Producto("4", "Sofa", 12000.0, 5, Categoriaproducto.HOGAR);
        Producto p5 = new Producto("5", "Televisor", 25000.0, 3, Categoriaproducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Mostrar total de stock
        System.out.println("Total de stock: " + inventario.obtenerTotalStock());

        // Mostrar producto con mayor stock
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("Producto con mayor stock: ");
        mayorStock.mostrarInfo();

        // Filtrar productos por precio
        ArrayList<Producto> productosFiltrados = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : productosFiltrados) {
            p.mostrarInfo();
        }

        // Mostrar categorías disponibles
        inventario.mostrarCategoriasDisponibles();
    }
}

