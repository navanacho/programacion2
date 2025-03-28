package TP3.Kata5;

public class NaveEspacial {
    //atributos encapsulados
    private String nombre;
    private int combustible;
    private static int limiteCobustible = 100;
    private static int combustibleDespegue = 10;

    //constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, limiteCobustible);//asegura no superar el limite
    }

    //metodo despegar
    public void despegar() {
        if (combustible >= combustibleDespegue) {
            combustible -= combustibleDespegue;
            System.out.println(nombre + "ha despegado exitosamente. Combustible restante: " + combustible);
        } else { 
            System.out.println(nombre + "no puede despegar. Combustible insuficiente se necesitan: " + combustibleDespegue + "unidades para despegar.");
        }
    }

    //metodo avanzar
    public void avanzar(int distancia) {
        if (distancia <= combustible) {
            combustible -= distancia;
            System.out.println(nombre + "ha avanzado " + distancia + "unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + "no puede avanzar " + distancia + " unidades. Combustible insuficiente.");
        }
    }

    //metodo para recargar combustible
    public void recargarCombustible(int cantidad) {
        int nuevoCombustible = combustible + cantidad;
        if (nuevoCombustible <= limiteCobustible) {
            combustible = nuevoCombustible;
            System.out.println(nombre + "ha recargado " + cantidad + "unidades. Total xombustible: " + combustible);
        } else {
            combustible = limiteCobustible;
            System.out.println(nombre + "ha recargado hasta el limite maximo");
        }
    }

    //metodo mostrar informacion
    public void mostrasInfo() {
        System.out.println("Estado actual de " + nombre + ":");
        System.out.println("Combustible disponible: " + combustible + "/" + limiteCobustible);
    }

    //genero solo getter parra que no se modifiquen en el camino
    public String getNombre() {
        return nombre;
    }

    public int getCombustible() {
        return combustible;
    }
}
