package RECUPERATORIO;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String codigo;
    private List<UnidadTematica> unidadesTematicas;

    public Curso (String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
        this.unidadesTematicas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<UnidadTematica> getUnidadesTematicas() {
        return unidadesTematicas;
    }

   public void agregarUnidadTematica(UnidadTematica unidad){
    unidadesTematicas.add(unidad);
   }

    

}
