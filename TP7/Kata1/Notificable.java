package TP7.Kata1;

public interface Notificable {
    void notificar(String mensaje);
}

class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación enviada a " + email + ": " + mensaje);
    }
}

class Pedido {
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("Su pedido ahora está " + nuevoEstado);
    }

}
