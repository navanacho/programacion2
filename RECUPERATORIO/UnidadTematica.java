package RECUPERATORIO;

public class UnidadTematica {
    private String titulo;
    private String descripcion;

    public UnidadTematica(String titulo, String descrpcion){
        this.titulo = titulo;
        this.descripcion = descrpcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
