package edu.programacion.ejercicio2306;

/**
 * Representa un lugar donde se realiza una cita.
 */
public class Lugar {

    /**
     * Nombre del lugar.
     */
    private String nombre;

    /**
     * Dirección.
     */
    private String direccion;

    /**
     * Crea un lugar.
     *
     * @param nombre Nombre.
     * @param direccion Dirección.
     */
    public Lugar(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * Devuelve el nombre.
     *
     * @return Nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la dirección.
     *
     * @return Dirección.
     */
    public String getDireccion() {
        return direccion;
    }
}
