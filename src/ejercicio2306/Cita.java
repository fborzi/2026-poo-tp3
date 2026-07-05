package edu.programacion.ejercicio2306;

public class Cita {

    private String fecha;
    private Persona contacto;
    private Lugar lugar;
    private int importancia;

    public Cita(String fecha, Persona contacto, Lugar lugar, int importancia) {
        this.fecha = fecha;
        this.contacto = contacto;
        this.lugar = lugar;

        if (importancia < 1) importancia = 1;
        if (importancia > 5) importancia = 5;

        this.importancia = importancia;
    }

    public void mostrar() {
        System.out.println("Fecha: " + fecha);

        System.out.println("\nContacto:");
        contacto.mostrar();

        System.out.println("\nLugar:");
        lugar.mostrar();

        System.out.println("\nImportancia: " + importancia);
    }
}