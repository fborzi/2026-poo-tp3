package edu.programacion.ejercicio2306;

public class Cita {

    private String fecha;
    private Integer importancia;
    private Persona persona;
    private Lugar lugar;

    public Cita(String fecha, Integer importancia, Persona persona, Lugar lugar) {
        this.fecha = fecha;
        this.importancia = importancia;
        this.persona = persona;
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public int getImportancia() {
        return importancia;
    }

    public Persona getPersona() {
        return persona;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setImportancia(Integer importancia) {
        this.importancia = importancia;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
}
