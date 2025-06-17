package TP8.Kata3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import TP8.Kata1.Producto;

public class testPedido {
     public static void main(String[] args) {
        Pedido p1 = new Pedido(1, LocalDate.of(2024, 5, 10));
        Pedido p2 = new Pedido(2, LocalDate.of(2024, 3, 22));
        Pedido p3 = new Pedido(3, LocalDate.of(2024, 4, 15));

        p1.agregarProducto(new Producto<>(1, "Tablet", 150.0));
        p2.agregarProducto(new Producto<>(2, "Celular", 300.0));
        p3.agregarProducto(new Producto<>(3, "Cargador", 20.0));

        List<Pedido> pedidos = Arrays.asList(p1, p2, p3);
        System.out.println("Ordenados por total:");
        Collections.sort(pedidos);
        pedidos.forEach(System.out::println);

        System.out.println("\nOrdenados por fecha:");
        pedidos.sort(new ComparadorPedidosPorFecha());
        pedidos.forEach(System.out::println);
    }

}
