package edu.programacion.ejercicio2306;

public class Cita {

    //ATRIBUTOS
    private String fecha;
    private Persona contacto;
    private Lugar lugar;
    private int importancia;

    //CONSTRUCTOR
    public Cita(String fecha, Persona contacto, Lugar lugar, int importancia) {
        this.fecha = fecha;
        this.contacto = contacto;
        this.lugar = lugar;
        this.importancia = importancia;
    }

}
