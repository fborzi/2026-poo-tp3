package edu.programacion.ejercicio2306;

public class Cita {

    private String fecha;
    private Integer importancia;
    private Persona contacto;
    private Lugar lugar;

    public Cita(String fecha, Integer importancia, Persona contacto, Lugar lugar) {
        this.fecha = fecha;
        this.importancia = importancia;
        this.contacto = contacto;
        this.lugar = lugar;
    }

}
