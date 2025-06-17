package RECUPERATORIO;
import java.util.Date;

public class Examen {
    private Date fecha;
    private String tipo;

    public Examen (Date fecha, String tipo){
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

}
