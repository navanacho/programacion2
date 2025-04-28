package TP5;
//kata 1.3 
//gestiona los tickets de soporte tecnico
import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
        private List<TicketSoporte> tickets;
    
        public SistemaSoporte() {
            this.tickets = new ArrayList<>();
        }
        
        //crea un nuevo ticket
        public TicketSoporte crearTicket(String descripcion, Usuario usuario) {
            TicketSoporte ticket = new TicketSoporte(descripcion, usuario);
            tickets.add(ticket);
            return ticket;
        }
        
        //asigna un tecnico
        public void asignarTecnico(TicketSoporte ticket, Tecnico tecnico) {
            ticket.asignarTecnico(tecnico.getNombre());
            ticket.setEstado("En proceso");
        }
    
        public void cerrarTicket(TicketSoporte ticket) {
            ticket.cerrarTicket();
        }
        
        //muestra los tickets y detalles
        public void listarTickets() {
            System.out.println("=== Lista de Tickets ===");
            for (TicketSoporte ticket : tickets) {
                System.out.println(ticket + "\n------------------");
            }
        }
        
        //genera reporte con estadisticas y datos tickets
        public void generarReporte() {
            long abiertos = tickets.stream().filter(t -> t.getEstado().equals("Abierto")).count();
            long cerrados = tickets.stream().filter(t -> t.getEstado().equals("Cerrado")).count();
    
            System.out.println("\n=== Reporte de Tickets ===");
            System.out.println("Tickets Abiertos: " + abiertos);
            System.out.println("Tickets Cerrados: " + cerrados);
    
            for (TicketSoporte t : tickets) {
                System.out.println("Ticket ID: " + t + 
                    "\nUsuario: " + (t.getUsuario() != null ? t.getUsuario().getNombre() : "N/A") + 
                    "\nTécnico: " + (t.getTecnicoAsignado() != null ? t.getTecnicoAsignado() : "No asignado") +
                    "\nEstado: " + t.getEstado() +
                    "\n------------------------");
            }
        }
    
}
