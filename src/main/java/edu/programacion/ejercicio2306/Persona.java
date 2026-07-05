package edu.programacion.ejercicio2306;

/**
 * Representa a una persona con sus datos de contacto básicos, utilizada
 * como parte de la información asociada a una cita.
 *
 * @author Kenya
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String descripcion;
    private Integer edad;
    private Integer telefono;

    /**
     * Constructor
     * Crea una persona con los datos indicados.
     *
     * @param nombre nombre de la persona
     * @param apellido apellido de la persona
     * @param descripcion descripción o dato adicional sobre la persona
     * @param edad edad de la persona
     * @param telefono número de teléfono de la persona
     */
    public Persona(String nombre, String apellido, String descripcion, Integer edad, Integer telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.edad = edad;
        this.telefono = telefono;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre nuevo nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return el apellido de la persona
     */
    public String getApellido(){
        return apellido;
    }

    /**
     * Establece el apellido de la persona.
     *
     * @param apellido nuevo apellido de la persona
     */
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    /**
     * Obtiene la descripción de la persona.
     *
     * @return la descripción de la persona
     */
    public String getDescripcion(){
        return descripcion;
    }

    /**
     * Establece la descripción de la persona.
     *
     * @param descripcion nueva descripción de la persona
     */
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return la edad de la persona
     */
    public Integer getEdad(){
        return edad;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param edad nueva edad de la persona
     */
    public void setEdad(Integer edad){
        this.edad = edad;
    }

    /**
     * Obtiene el número de teléfono de la persona.
     *
     * @return el número de teléfono de la persona
     */
    public Integer getTelefono(){
        return telefono;
    }

    /**
     * Establece el número de teléfono de la persona.
     *
     * @param telefono nuevo número de teléfono de la persona
     */
    public void setTelefono(Integer telefono){
        this.telefono = telefono;
    }

    /**
     * Genera una representación en texto de la persona, incluyendo su
     * nombre, apellido y edad.
     *
     * @return una cadena con el nombre, apellido y edad de la persona
     */
    @Override
    public String toString() {
        return "Persona: " + getNombre() + " " + getApellido() + ", Edad: " + getEdad();
    }
}