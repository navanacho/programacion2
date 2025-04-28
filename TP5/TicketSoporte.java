package TP5;
//kata 1.1
import java.time.LocalDate;

public class TicketSoporte {
    private static int contador = 1; //contador de id
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario; 
    private String tecnicoAsignado;

    // Constructor sin usuario
    public TicketSoporte(String descripcion) {
        this.id = contador++;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
    }

    // Constructor con usuario
    public TicketSoporte(String descripcion, Usuario usuario) {
        this(descripcion);
        this.usuario = usuario;
    }
    //metodo para asignar tecnico
    public void asignarTecnico(String tecnico) {
        this.tecnicoAsignado = tecnico;
    }
    //metodo para cerrar el ticket
    public void cerrarTicket() {
        this.estado = "Cerrado";
    }
    
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
    //muestra estado del ticket 
    public String getEstado() {
        return estado;
    }
    //muestra el usuario
    public Usuario getUsuario() {
        return usuario;
    }
    //muestra el tecnico
    public String getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public String mostrarDetalle() {
        return "Ticket ID: " + id +
               "\nDescripción: " + descripcion +
               "\nEstado: " + estado +
               "\nFecha de Creación: " + fechaCreacion +
               (usuario != null ? "\nUsuario: " + usuario.getNombre() : "") +
               (tecnicoAsignado != null ? "\nTécnico Asignado: " + tecnicoAsignado : "");
    }

    @Override
    public String toString() {
        return mostrarDetalle();
    }
}