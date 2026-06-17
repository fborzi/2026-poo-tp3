package edu.programacion.ejercicio2306;

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