package TP5;

public class Main {
    public static void main(String[] args) {
        SistemaSoporte sistema = new SistemaSoporte();

        Usuario usuario1 = new Usuario(1, "Laura Gómez", "laura@mail.com");
        Usuario usuario2 = new Usuario(2, "Mario Díaz", "mario@mail.com");

        Tecnico tecnico1 = new Tecnico(101, "Ana Torres", "Redes");
        Tecnico tecnico2 = new Tecnico(102, "Luis Fernández", "Software");

        TicketSoporte ticket1 = sistema.crearTicket("No tengo acceso a la red", usuario1);
        TicketSoporte ticket2 = sistema.crearTicket("Error al iniciar sesión", usuario2);

        sistema.asignarTecnico(ticket1, tecnico1);
        sistema.asignarTecnico(ticket2, tecnico2);

        sistema.cerrarTicket(ticket2);

        sistema.listarTickets();
        sistema.generarReporte();
    }
}
