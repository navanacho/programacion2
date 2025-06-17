package RECUPERATORIO;

public class Profesor extends Persona {
    private int legajo;

    public Profesor (String nombre, String dni, int legajo){
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
