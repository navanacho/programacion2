package RECUPERATORIO;

public class Alumno extends Persona{
    private int legajo;

    public Alumno (String nombre, String dni, int legajo){
        super(nombre, dni);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    
}
