package edu.programacion.ejercicio2306;

public class Lugar {

    private String nombre;
    private String direccion;

    public Lugar(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void mostrar() {
        System.out.println("Lugar: " + nombre);
        System.out.println("Dirección: " + direccion);
    }
}