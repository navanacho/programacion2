package TP8.Kata4;
import java.util.Collection;

public class Buscador<T extends Identificable<K>, K> {
    public T buscar(Collection<? extends T> elementos, K id) {
        for (T elemento : elementos) {
            if (elemento.tieneMismoID(id)) {
                return elemento;
            }
        }
        return null;
    }
}

