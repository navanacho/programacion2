package TPHerenciaPolimorfismo;

import java.time.LocalDate;

public class EmpleadoSalarioFijo extends Empleado {
    private static final double PORC1 = 0.05;
    private static final double PORC2 = 0.1;
    private static final int ANIO1 = 2;
    private static final int ANIO2 = 5;
    private double sueldoBasico;

    public EmpleadoSalarioFijo(String DNI, String nombre, String apellido, LocalDate fechaIngreso,
                             double sueldoBasico) {
        super(DNI, nombre, apellido, fechaIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double getSalario() {
        return sueldoBasico * (1 + porcAdicional());
    }

    private double porcAdicional() {
        int antiguedad = antiguedadEnAnios();
        if (antiguedad < ANIO1) {
            return 0;
        } else if (antiguedad <= ANIO2) {
            return PORC1;
        } else {
            return PORC2;
        }
    }
}
