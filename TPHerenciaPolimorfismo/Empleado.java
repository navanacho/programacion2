package TPHerenciaPolimorfismo;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
    protected String DNI;
    protected String nombre;
    protected String apellido;
    protected LocalDate fechaIngreso;

    public Empleado(String DNI, String nombre, String apellido, LocalDate fechaIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    public int antiguedadEnAnios() {
        return Period.between(fechaIngreso, LocalDate.now()).getYears();
    }

    public abstract double getSalario();
}
