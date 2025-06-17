package TP8.Kata4;

import java.time.LocalDate;
import TP8.Kata3.Pedido;

public class pedidoIdentificable extends Pedido implements Identificable <Integer>{
    public pedidoIdentificable(int id, LocalDate fecha) {
        super(id, fecha);
    }

    @Override
    public Integer getID() {
        return super.id;
    }

    @Override
    public boolean tieneMismoID(Integer id) {
        return this.getID().equals(id);
    }

    @Override
    public boolean tieneMismoID(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'tieneMismoID'");
    }

}
