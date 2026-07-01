package edu.programacion.ejercicio2306;

/**
 * Modela una persona identificada por su nombre y número de teléfono.
 *
 * Permite representar un contacto asociado a una cita, almacenando
 * la información necesaria para su identificación y comunicación.
 *
 * La clase reúne los datos básicos de una persona y ofrece operaciones
 * para consultar y actualizar sus atributos.
 */

public class Persona {
    private String nombre;
    private String telefono;

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre ;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
