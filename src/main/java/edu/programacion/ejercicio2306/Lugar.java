package edu.programacion.ejercicio2306;

/**
 * Modela un lugar definido por un nombre y una dirección.
 *
 * Permite representar la ubicación asociada a una cita u otro evento,
 * almacenando la información necesaria para identificar y localizar
 * un sitio determinado.
 *
 * La clase reúne los datos descriptivos de un lugar y facilita su
 * consulta y actualización mediante los métodos provistos.
 */

public class Lugar {
    private String nombre;
    private String direccion;

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
