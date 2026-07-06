package edu.programacion.ejercicio2306;

public class Persona {
    //atributos
    private String nombre;
    private String telefono;
    private String email;

    /** Constructor
     *
     * @param nombre
     * @param telefono
     * @param email
     */
    public Persona(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nTelefono: " + telefono +
                "\nEmail: " + email ;
    }

}

