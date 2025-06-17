package TP8.Kata1;

import java.util.ArrayList;
import java.util.List;

public class testProducto {
        public static void main(String[] args) {
        List<Producto<?>> productos = new ArrayList<>();
        productos.add(new Producto<String>("SKU123", "Laptop", 1200.0));
        productos.add(new Producto<Integer>(101, "Mouse", 25.5));
        productos.add(new Producto<String>("SKU789", "Teclado", 45.0));

        for (Producto<?> p : productos) {
            System.out.println(p);
        }
    }

}
