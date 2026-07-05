package edu.programacion.ejercicio2306;

/**
 * Representa un lugar físico donde puede realizarse una cita, definido por
 * su dirección, tipo y nombre.
 *
 * @author Kenya
 */
public class Lugar {
    private String direccion;
    private String tipo;
    private String nombre;

    /**
     * Crea un lugar con la dirección, tipo y nombre indicados.
     *
     * @param direccion dirección física del lugar
     * @param tipo tipo de lugar (por ejemplo, oficina, café, domicilio)
     * @param nombre nombre identificatorio del lugar
     */
    public Lugar(String direccion, String tipo, String nombre){
        this.direccion = direccion;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del lugar.
     *
     * @return la dirección del lugar
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del lugar.
     *
     * @param direccion nueva dirección del lugar
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el tipo de lugar.
     *
     * @return el tipo del lugar
     */
    public String getTipo(){
        return tipo;
    }

    /**
     * Establece el tipo de lugar.
     *
     * @param tipo nuevo tipo del lugar
     */
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    /**
     * Obtiene el nombre del lugar.
     *
     * @return el nombre del lugar
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Establece el nombre del lugar.
     *
     * @param nombre nuevo nombre del lugar
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Genera una representación en texto del lugar, incluyendo su dirección,
     * nombre y tipo.
     *
     * @return una cadena con los datos principales del lugar
     */
    @Override
    public String toString() {
        return "Lugar: " + getDireccion() + " " + getNombre() + ",  Descripcion:  " + getTipo();
    }
}