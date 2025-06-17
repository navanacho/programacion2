package RECUPERATORIO;

public class Nota {
    private double nota;
    private Examen examen;

    public Nota(double nota, Examen examen){
        this.nota = nota;
        this.examen = examen;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    

}
