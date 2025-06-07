package TP9;

public class Main {
    public static void main(String[] args) {
        gestorCtegorias gestor = new gestorCtegorias();

        gestor.agregarCategoria("Electrónica", "Dispositivos y tecnología");
        gestor.agregarCategoria("Hogar", "Productos para el hogar");

        System.out.println("\n📋 Listado de categorías:");
        for (Categoria c : gestor.listarCategorias()) {
            System.out.println(c);
        }

        System.out.println("\n🔍 Mostrar categoría con ID 1:");
        System.out.println(gestor.mostrarCategoria(1));

        gestor.actualizarCategoria(1, "Electrónica Actualizada", "Tecnología avanzada");
        gestor.eliminarCategoria(2);
    }

}
