package edu.programacion.ejercicio2306;

/**
 * Modela una cita compuesta por una fecha, un nivel de importancia,
 * una persona de contacto y un lugar determinado.
 *
 * Permite representar reuniones o eventos asignando una prioridad
 * comprendida entre 1 y 5, siendo 5 el nivel de mayor importancia.
 *
 * La clase establece una relación con objetos de tipo Persona y Lugar,
 * integrando la información necesaria para describir una cita completa.
 */

public class Cita {

    private String fecha;
    private Integer importancia;
    private Persona contacto;
    private Lugar lugar;

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getImportancia() {
        return this.importancia;
    }

    public void setImportancia(Integer importancia) {
        this.importancia = importancia;
    }

    public Persona getContacto() {
        return this.contacto;
    }

    public void setContacto(Persona contacto) {
        this.contacto = contacto;
    }

    public Lugar getLugar() {
        return this.lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
}
