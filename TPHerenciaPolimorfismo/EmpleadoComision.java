package TPHerenciaPolimorfismo;

import java.time.LocalDate;

public class EmpleadoComision extends Empleado {
    private double salarioMinimo;
    private int cantClientesCaptados;
    private double montoPorCliente;

    public EmpleadoComision(String DNI, String nombre, String apellido, LocalDate fechaIngreso,
                            double salarioMinimo, int cantClientesCaptados, double montoPorCliente) {
        super(DNI, nombre, apellido, fechaIngreso);
        this.salarioMinimo = salarioMinimo;
        this.cantClientesCaptados = cantClientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    @Override
    public double getSalario() {
        double salario = cantClientesCaptados * montoPorCliente;
        return Math.max(salario, salarioMinimo);
    }

    public int getCantClientesCaptados() {
        return cantClientesCaptados;
    }
}
