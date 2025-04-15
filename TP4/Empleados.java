package TP4;

public class Empleados {
     // Atributos de la clase
     private int id;
     private String nombre;
     private String puesto;
     private double salario;
     
     // Atributo estático para llevar el conteo de empleados
     private static int totalEmpleados = 0;
     
     // Constructor que recibe todos los atributos
     public Empleados (int id, String nombre, String puesto, double salario) {
         this.id = id;
         this.nombre = nombre;
         this.puesto = puesto;
         this.salario = salario;
         totalEmpleados++; // Incrementamos el contador estático
     }
     
     // Constructor sobrecargado que recibe solo nombre y puesto
     public Empleados (String nombre, String puesto) {
         this(totalEmpleados + 1, nombre, puesto, 1000.0); // ID autoincremental y salario por defecto
     }
     
     // Método para actualizar salario con porcentaje de aumento
     public void actualizarSalario (double porcentajeAumento) {
         this.salario += this.salario * (porcentajeAumento / 100);
     }
     
     // Método sobrecargado para actualizar salario con cantidad fija
     public void actualizarSalario (int aumentoFijo) {
         this.salario += aumentoFijo;
     }
     
     // Método estático para mostrar el total de empleados
     public static int mostrarTotalEmpleados() {
         return totalEmpleados;
     }
     
     // Sobreescritura del método toString()
     @Override
     public String toString() {
         return "ID: " + id + 
                "\nNombre: " + nombre + 
                "\nPuesto: " + puesto + 
                "\nSalario: $" + String.format("%.2f", salario) + "\n";
     }
}
