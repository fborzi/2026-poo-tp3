package edu.programacion.ejercicio2307;

/**
 * Representa una guitarra electroacústica, un tipo específico de guitarra
 * que hereda los atributos y comportamientos generales de Guitarra padre,
 * agregando datos propios pensados para el contexto de venta: tipo de
 * conector, preamplificador, prueba de sonido previa a la venta, y la
 * posibilidad de agregar una batería extra como accesorio.
 *
 * @author Kenya
 */
public class GuitarraElectroAcustica extends Guitarra {

    private Integer nivelBateria;
    private String tipoConector;
    private Boolean tienePreamplificador;
    private Boolean sonidoProbado;
    private Boolean tieneBateriaExtra;

    /**
     * Crea una guitarra electroacústica con los datos heredados de Guitarra,
     * más el tipo de conector y si tiene preamplificador. Al ser una guitarra
     * nueva, el nivel de batería arranca en 100, y tanto la prueba de sonido
     * como la batería extra arrancan en false, ya que son acciones que se
     * realizan después, antes o durante la venta.
     *
     * @param precio precio de venta de la guitarra
     * @param fabricante fabricante de la guitarra
     * @param modelo modelo de la guitarra
     * @param materialMadera material de la madera utilizada
     * @param materialCuerdas material de las cuerdas utilizadas
     * @param numSerie número de serie único de la guitarra
     * @param cantidadCuerdas cantidad de cuerdas que posee
     * @param stock cantidad de unidades disponibles en stock
     * @param porcentajeFijo porcentaje de descuento a aplicar
     * @param tipoConector tipo de conector de salida de audio (por ejemplo, jack 1/4" o XLR)
     * @param tienePreamplificador si la guitarra viene con preamplificador incorporado
     */
    public GuitarraElectroAcustica(Float precio, String fabricante, String modelo, String materialMadera,
                                   String materialCuerdas, String numSerie, Integer cantidadCuerdas,
                                   Integer stock, Float porcentajeFijo,
                                   String tipoConector, Boolean tienePreamplificador) {
        super(precio, fabricante, modelo, materialMadera, materialCuerdas, numSerie,
                cantidadCuerdas, stock, porcentajeFijo);
        this.tipoConector = tipoConector;
        this.tienePreamplificador = tienePreamplificador;
        this.nivelBateria = 100;
        this.sonidoProbado = false;
        this.tieneBateriaExtra = false;
    }

    /**
     * Registra que el sonido de la guitarra fue probado antes de la venta.
     */
    public void probarSonido() {
        setSonidoProbado(true);
    }

    /**
     * Agrega una batería extra como accesorio adicional a la compra.
     */
    public void agregarBateriaExtra() {
        setTieneBateriaExtra(true);
    }

    /**
     * Convierte un valor booleano en un texto legible, si es true = si, si es false = no
     *
     * @param valor el valor booleano a convertir
     * @return "Sí" si el valor es true, "No" si es false
     */
    private String convertirATexto(Boolean valor) {
        if (valor) {
            return "Sí";
        } else {
            return "No";
        }
    }

    /**
     * Obtiene el nivel de batería actual de la guitarra.
     *
     * @return el nivel de batería, de 0 a 100
     */
    public Integer getNivelBateria() {
        return nivelBateria;
    }

    /**
     * Establece el nivel de batería de la guitarra.
     *
     * @param nivelBateria nuevo nivel de batería
     */
    public void setNivelBateria(Integer nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    /**
     * Obtiene el tipo de conector de la guitarra.
     *
     * @return el tipo de conector
     */
    public String getTipoConector() {
        return tipoConector;
    }

    /**
     * Establece el tipo de conector de la guitarra.
     *
     * @param tipoConector nuevo tipo de conector
     */
    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    /**
     * Obtiene si la guitarra tiene preamplificador incorporado.
     *
     * @return true si tiene preamplificador, false si no
     */
    public Boolean getTienePreamplificador() {
        return tienePreamplificador;
    }

    /**
     * Establece si la guitarra tiene preamplificador incorporado.
     *
     * @param tienePreamplificador nuevo valor de preamplificador
     */
    public void setTienePreamplificador(Boolean tienePreamplificador) {
        this.tienePreamplificador = tienePreamplificador;
    }

    /**
     * Obtiene si el sonido de la guitarra ya fue probado.
     *
     * @return true si fue probado, false si no
     */
    public Boolean getSonidoProbado() {
        return sonidoProbado;
    }

    /**
     * Establece si el sonido de la guitarra ya fue probado.
     *
     * @param sonidoProbado nuevo estado de la prueba de sonido
     */
    public void setSonidoProbado(Boolean sonidoProbado) {
        this.sonidoProbado = sonidoProbado;
    }

    /**
     * Obtiene si la guitarra incluye una batería extra como accesorio.
     *
     * @return true si tiene batería extra, false si no
     */
    public Boolean getTieneBateriaExtra() {
        return tieneBateriaExtra;
    }

    /**
     * Establece si la guitarra incluye una batería extra como accesorio.
     *
     * @param tieneBateriaExtra nuevo valor de batería extra
     */
    public void setTieneBateriaExtra(Boolean tieneBateriaExtra) {
        this.tieneBateriaExtra = tieneBateriaExtra;
    }

    /**
     * Genera una representación en texto de la guitarra electroacústica,
     * mostrando fabricante, modelo, conector y si el sonido fue probado.
     *
     * @return una cadena con los datos principales de la guitarra electroacústica
     */
    @Override
    public String toString() {
        return "Descripcion Guitarra ElectroAcustica: " + getFabricante() + " " + getModelo()
                + " - Conector: " + getTipoConector() + ", Sonido probado: " + convertirATexto(getSonidoProbado());
    }
}