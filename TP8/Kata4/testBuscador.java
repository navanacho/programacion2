package TP8.Kata4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class testBuscador {
    public static void main(String[] args) {
        List<pedidoIdentificable> pedidos = new ArrayList<>();
        pedidos.add(new pedidoIdentificable(101, LocalDate.now()));
        pedidos.add(new pedidoIdentificable(102, LocalDate.now()));
        pedidos.add(new pedidoIdentificable(103, LocalDate.now()));

        Buscador<pedidoIdentificable, Integer> buscador = new Buscador<>();
        pedidoIdentificable encontrado = buscador.buscar(pedidos, 102);
        System.out.println("Pedido encontrado: " + (encontrado != null ? encontrado : "No encontrado"));
    }
}
