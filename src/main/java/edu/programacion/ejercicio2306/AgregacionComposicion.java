package edu.programacion.ejercicio2306;

/**
 * Representa una cita entre una persona y un lugar.
 */
public class Cita {

    /**
     * Persona que asiste.
     */
    private Persona persona;

    /**
     * Lugar de la cita.
     */
    private Lugar lugar;

    /**
     * Fecha.
     */
    private String fecha;

    /**
     * Hora.
     */
    private String hora;

    /**
     * Crea una cita.
     *
     * @param persona Persona.
     * @param lugar Lugar.
     * @param fecha Fecha.
     * @param hora Hora.
     */
    public Cita(Persona persona, Lugar lugar, String fecha, String hora) {
        this.persona = persona;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
    }

    /**
     * Muestra la información de la cita.
     */
    public void mostrarCita() {
        System.out.println("Persona: " + persona.getNombre());
        System.out.println("Lugar: " + lugar.getNombre());
        System.out.println("Dirección: " + lugar.getDireccion());
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
    }
}