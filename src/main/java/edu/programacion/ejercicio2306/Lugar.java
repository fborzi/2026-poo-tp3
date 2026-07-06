package edu.programacion.ejercicio2306;

public class Lugar {

    private String nombreLugar;
    private String localidad;
    private String calle;
    private Integer numero;

    /**
     * Constructor
     * @param nombreLugar
     * @param localidad
     * @param calle
     * @param numero
     */

    public Lugar(String nombreLugar,String localidad, String calle, Integer numero ) {
            this.nombreLugar = nombreLugar;
            this.localidad = localidad;
            this.calle = calle;
            this.numero = numero;
    }









    /**obtener nombre lugar
     *
     * @return
     */
    public String getNombreLugar() {
        return nombreLugar;
    }

    /**poner nombre lugar
     *
     * @param nombre
     */
    public void setNombreLugar(String nombre) {
        this.nombreLugar = nombreLugar;
    }

    /**obtener nmbro calle
     *
     * @return
     */
    public String getCalle() {
        return calle;
    }

    /**poner nombre calle
     *
     * @param calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     *
     * @return
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     *
     * @return
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     *
     * @param localidad
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nombre del lugar: " + nombreLugar +
                "\nLocalidad: " + localidad +
                "\nCalle: " + calle +
                " n°: " + numero;
    }
}