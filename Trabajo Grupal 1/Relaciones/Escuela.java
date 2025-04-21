package Relaciones;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private int numero;
    private String denominacion;
    private List<DivisionCurso> divisionCursos = new ArrayList();

    public Escuela() {
    }

    public Escuela(int numero, String denominacion) {
        this.numero = numero;
        this.denominacion = denominacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<DivisionCurso> getDivisionCursos() {
        return divisionCursos;
    }

    public void setDivisionCursos(List<DivisionCurso> divisionCursos) {
        this.divisionCursos = divisionCursos;
    }

    public Alumno getMejorAlumnoEscuela(int anioNacimientoAlumno) {
        Alumno mejorAlumno = null;
        double mejorPromedio = 0;
    
        for (DivisionCurso division : divisionCursos) {
            for (Catedra catedra : division.getCatedras()) {
                for (Alumno alumno : catedra.getAlumnos()) {
                    // Chequeamos año de nacimiento
                    @SuppressWarnings("deprecation")
                    int anioNacimiento = alumno.getFechaNacimiento().getYear() + 1900;
    
                    if (anioNacimiento == anioNacimientoAlumno) {
                        List<Nota> notasValidas = new ArrayList<>();
                        boolean tieneRecuperatorios = false;
    
                        for (Nota nota : alumno.getNotas()) {
                            if (nota.isEsRecuperatorio()) {
                                tieneRecuperatorios = true;
                                break;
                            }
                            notasValidas.add(nota);
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
            }
        }
    
        return mejorAlumno;
    }
}
