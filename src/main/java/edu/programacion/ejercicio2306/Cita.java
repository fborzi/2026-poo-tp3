package edu.programacion.ejercicio2306;

import java.time.LocalDate;
import java.util.Date;

public class Cita {
    // Atributos
    private LocalDate fecha;
    private Persona contacto;
    private Lugar lugar;
    private Integer importancia;

    /**
     * Constructor
     * @param fecha
     * @param contacto
     * @param lugar
     * @param importancia
     */
    public Cita(LocalDate fecha, Persona contacto, Lugar lugar,Integer importancia) {
        this.fecha = fecha;
        this.contacto = contacto;
        this.lugar = lugar;
        this.importancia = importancia;
    }


    public Integer getImportancia() {
        return importancia;
    }

    public void setImportancia(Integer importancia) {
        this.importancia = importancia;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Persona getContacto() {
        return contacto;
    }

    public void setContacto(Persona contacto) {
        this.contacto = contacto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Fecha: " + fecha +
                "\nContacto: " + contacto +
                "\nLugar: " + lugar +
                "\nImportancia: " + importancia;
    }
}
