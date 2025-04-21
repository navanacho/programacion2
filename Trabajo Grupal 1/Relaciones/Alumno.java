package Relaciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Alumno {

    private long legajo;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Catedra catedra;
    private List<Nota> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(long legajo, String nombre, String apellido, Date fechaNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public Nota mejorNota(Integer codigoCatedra){
        Nota mejor = new Nota();
        for (Nota nota : notas) {
            if(nota.isEsRecuperatorio()){
                continue;
            }
            if(codigoCatedra != null && nota.getCatedra().getCodigo() == codigoCatedra){
                if(nota.getValor() > mejor.getValor()){
                    mejor = nota;
                }
            }else{
                if(nota.getValor() > mejor.getValor()){
                    mejor = nota;
                }
            }
        }
        return mejor;
    }

    public double promedioNotas(Integer codigoCatedra){
        double suma = 0;
        int contador = 0;
        for (Nota nota : notas) {
            if(codigoCatedra != null && nota.getCatedra().getCodigo() != codigoCatedra){
                continue;
            }
            suma += nota.getValor();
            contador++;
        }
        return suma/contador;
    }
}
