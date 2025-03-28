package TP3.Kata1;

public class Estudiante {
        //atributos
        private String nombre;
        private String apellido;
        private String curso;
        private double calificacion;
    
        //constructor
        public Estudiante (String nombre, String apellido, String curso, double calificacion){
            this.nombre = nombre;
            this.apellido = apellido;
            this.curso = curso;
            this.calificacion = calificacion;
        }

        //metodo mostrar informacion
        public void mostrarInfo(){
            System.out.println("Informacion del estudiante: ");
            System.out.println("Apellido: " + apellido);
            System.out.println("Nombre: " + nombre);
            System.out.println("Curso: " + curso);
            System.out.println("Clificacion: " + calificacion + "/10");
        }

        //metodo subir calificacion
        public void subirCalificacion (double puntos){
            if (puntos > 0) {
                calificacion += puntos;
                if (calificacion > 10) {
                    calificacion = 10;
                    System.out.println("La calificacion no puede superar 10. Se redondea a 10");
                }
            }
        }

        //meodo bajar calificacion
        public void bajarCalificacion (double puntos){
            if (puntos > 0) {
                calificacion -= puntos;
                if (calificacion < 0) {
                    calificacion = 0;
                    System.out.println("La calificacion no puede ser menor a 0. Se redondea a cero");
                }
            }
        }

        //getter and setter
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

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public double getCalificacion() {
            return calificacion;
        }

        public void setCalificacion(double calificacion) {
            if (calificacion >= 0 && calificacion <= 10) {
                this.calificacion = calificacion;
            } else{
                System.out.println("La calificaion no valida");
            }
        }
}
