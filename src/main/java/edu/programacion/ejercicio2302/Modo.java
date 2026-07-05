package edu.programacion.ejercicio2302;

/**
 * Representa un modo de funcionamiento del aire acondicionado, definido
 * por un nombre y una descripción de su comportamiento.
 *
 * @author Kenya
 */
public class Modo {

    private String nombre;
    private String descripcion;

    /**
     * Constructor
     * inicializa el objeto Modo cuando se crea
     * almacena los parametros recibidos de nombre y descripcion
     * puede ser frío, calor, automático o ventilador
     * @param nombre nombre del modo, puede ser frio, calor, automatico o ventilador
     * @param descripcion descripcion del modo, explica su comportamiento
     */
    public Modo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * devuelve el valor del nombre del modo actual
     * @return nombre del modo, puede ser frio, calor, automatico o ventilador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setea el nuevo nombre del modo
     * @param nombre nuevo nombre a setear
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * devuelve el valor de la descripcion, ejemplo si esta en modo ventilador
     * la descripcion es a temperatura ambiente o inverter
     * @return descripcion del modo actual
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * setea el nuevo valor de la descripcion
     * @param descripcion nueva descripcion a setear
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Genera una representación en texto del modo, incluyendo su nombre
     * y descripción.
     *
     * @return una cadena con el nombre y la descripción del modo
     */
    @Override
    public String toString() {
        return "Modo: " + getNombre() + " - " + getDescripcion();
    }
}
