package TP7.Kata1;

public interface Pago {
    void procesarPago(double monto);
}

interface PagoConDescuento extends Pago {
    void aplicarDescuento(double porcentaje);
}

class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado con tarjeta de crédito: $" + monto);
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Descuento aplicado: " + porcentaje + "%");
    }

}
