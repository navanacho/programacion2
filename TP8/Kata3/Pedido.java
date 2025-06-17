package TP8.Kata3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import TP8.Kata1.Producto;

public class Pedido implements Comparable<Pedido> {
    protected int id;
    private List<Producto<?>> productos = new ArrayList<>();
    private LocalDate fecha;

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public void agregarProducto(Producto<?> producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    @Override
    public int compareTo(Pedido otro) {
        return Double.compare(this.calcularTotal(), otro.calcularTotal());
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Pedido{id=" + id + ", total=" + calcularTotal() + ", fecha=" + fecha + "}";
    }
}

class ComparadorPedidosPorFecha implements Comparator<Pedido> {
    @Override
    public int compare(Pedido p1, Pedido p2) {
        return p1.getFecha().compareTo(p2.getFecha());
    }

}
