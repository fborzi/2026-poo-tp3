package edu.programacion.ejercicio2306;

public class Persona {
    private String nombre;
    private String telefono;

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tel: " + telefono);
    }
}