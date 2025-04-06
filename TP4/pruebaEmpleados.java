package TP4;

public class pruebaEmpleados {
    public static void main(String[] args) {
        // Crear empleados usando diferentes constructores
        Empleados emp1 = new Empleados (1, "Juan Pérez", "Desarrollador", 2500.0);
        Empleados emp2 = new Empleados ("María García", "Diseñadora");
        Empleados emp3 = new Empleados ("Carlos López", "Gerente");
        
        // Actualizar salarios usando métodos sobrecargados
        emp1.actualizarSalario(10); // Aumento del 10%
        emp2.actualizarSalario(500); // Aumento fijo de 500
        
        // Mostrar información de los empleados
        System.out.println("=== Información de Empleados ===");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        // Mostrar total de empleados usando el método estático
        System.out.println("Total de empleados creados: " + Empleados.mostrarTotalEmpleados());
    }
}
