package edu.programacion.ejercicio2306;

import javax.swing.*;

public class Persona {
    private Integer id;
    private String nombre;
    private String apellido;

    public Persona (Integer id, String nombre, String apellido){
        this.id=id;
        this.nombre=nombre;
        this. apellido=apellido;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return this.apellido;
    }

    @Override
    public String toString() {
        return this.nombre; // O el campo que quieras mostrar en consola
    }

}
