package Relaciones;


import java.util.ArrayList;
import java.util.List;

public class DivisionCurso {

    private int codigo;
    private int anio;
    private int division;
    private Escuela escuela;
    private List<Catedra> catedras = new ArrayList();

    public DivisionCurso() {
    }

    public DivisionCurso(int codigo, int anio, int division) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public Alumno mejorAlumnoDivisionCurso() {
        double mejorPromedio = 0;
        Alumno mejorAlumno = null;
    
        for (Catedra catedra : catedras) {
            for (Alumno alumno : catedra.getAlumnos()) {
                List<Nota> notasValidas = new ArrayList<>();
                boolean tieneRecuperatorios = false;
    
                for (Nota nota : alumno.getNotas()) {
                    if (nota.getCatedra().equals(catedra)) {
                        if (nota.isEsRecuperatorio()) {
                            tieneRecuperatorios = true;
                            break;
                        }
                        notasValidas.add(nota);
                    }
                }
    
                if (!tieneRecuperatorios && notasValidas.size() >= 5) {
                    double suma = 0;
                    for (Nota nota : notasValidas) {
                        suma += nota.getValor();
                    }
                    double promedio = suma / notasValidas.size();
    
                    if (promedio > mejorPromedio) {
                        mejorPromedio = promedio;
                        mejorAlumno = alumno;
                    }
                }
            }
        }
    
        return mejorAlumno;
    }
}
