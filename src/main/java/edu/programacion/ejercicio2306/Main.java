package edu.programacion.ejercicio2306;

import edu.programacion.ejercicio2306.Cita;
import edu.programacion.ejercicio2306.Lugar;
import edu.programacion.ejercicio2306.Persona;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Sofia Bolmeni");
        persona.setTelefono("02475-414016");

        Lugar lugar = new Lugar();
        lugar.setNombre("Cafeteria Centro");
        lugar.setDireccion("Av. Principal 123");

        Cita cita = new Cita();
        cita.setFecha("15/06/2026");
        cita.setImportancia(4);
        cita.setContacto(persona);
        cita.setLugar(lugar);

        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Importancia: " + cita.getImportancia());
        System.out.println("Contacto: " + cita.getContacto().getNombre());
        System.out.println("Telefono: " + cita.getContacto().getTelefono());
        System.out.println("Lugar: " + cita.getLugar().getNombre());
        System.out.println("Direccion: " + cita.getLugar().getDireccion());
    }
}