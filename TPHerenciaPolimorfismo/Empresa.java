package TPHerenciaPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarSalarios() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.nombreCompleto() + ": $" + empleado.getSalario());
        }
    }

    public Empleado empleadoConMasClientes() {
        Empleado empleadoMaxClientes = null;
        int maxClientes = -1;

        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoComision) {
                EmpleadoComision empComision = (EmpleadoComision) empleado;
                if (empComision.getCantClientesCaptados() > maxClientes) {
                    maxClientes = empComision.getCantClientesCaptados();
                    empleadoMaxClientes = empComision;
                }
            }
        }
        return empleadoMaxClientes;
    }
}
