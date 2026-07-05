package edu.programacion.ejercicio2306;

import java.beans.PersistenceDelegate;
import java.net.Inet4Address;
import java.util.Date;

public class Cita {
    private Persona persona ;
    private Lugar lugar;
    private Date fecha;
    private Integer importancia;

    public Cita (Persona persona, Lugar lugar, Date fecha, Integer importancia){
        this.persona = persona;
        this.lugar = lugar;
        this.fecha = fecha;
        this.importancia = importancia;
    }

    public void setPersona(Persona persona) {
        this.persona=persona;
    }
    public Persona getPersona() {
        return this.persona;
    }

    public void setLugar(Lugar lugar) {
        this.lugar=lugar;
    }
    public Lugar getLugar() {
        return this.lugar;
    }

    public void setFecha(Date fecha) {
        this.fecha=fecha;
    }
    public Date getFecha() {
        return this.fecha;
    }

    public void setImportancia(Integer importancia) {
        this.importancia = importancia;
    }
    public Integer getImportancia() {
        return this.importancia;
    }


}
