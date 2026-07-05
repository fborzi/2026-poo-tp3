package edu.programacion.ejercicio2307;

/**
 * Representa una guitarra criolla, un tipo específico de guitarra que
 * hereda los atributos y comportamientos generales de Guitarra Pdre
 * agregando datos propios
 *
 * @author Kenya
 */
public class GuitarraCriolla extends Guitarra {

    private String tipoPuente;
    private String tamanoCaja;
    private Boolean tieneFunda;
    private Boolean tieneAccesorioProtector;

    /**
     * Crea una guitarra criolla con los datos heredados de Guitarra,
     * más los datos propios de tipo de puente, tamaño de caja. la funda y el protector es algo
     * que agrega el cliente cuando realiza la compra asi que lo inicio en false porque
     * no viene con el accesorio de manera predeterminada
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
     * @param tipoPuente tipo de puente de la guitarra criolla
     * @param tamanoCaja tamaño de la caja de resonancia que afecta el volumen y el tono del sonido
     */
    public GuitarraCriolla(Float precio, String fabricante, String modelo, String materialMadera,
                           String materialCuerdas, String numSerie, Integer cantidadCuerdas,
                           Integer stock, Float porcentajeFijo,
                           String tipoPuente, String tamanoCaja) {
        super(precio, fabricante, modelo, materialMadera, materialCuerdas, numSerie,
                cantidadCuerdas, stock, porcentajeFijo);
        this.tipoPuente = tipoPuente;
        this.tamanoCaja = tamanoCaja;
        this.tieneFunda = false;
        this.tieneAccesorioProtector = false;
    }

    /**
     * Coloca una funda protectora , si es que el cliente lo desea
     */
    public void colocarFunda() {
        setTieneFunda(true);
    }

    /**
     * Aplica un accesorio protector adicional a la guitarra criolla tambien si el cliente lo quiere
     */
    public void accesorioProtector() {
        setTieneAccesorioProtector(true);
    }

    /**
     * Convierte un valor booleano en un texto legible asi el toString no devuelve true o false
     *  y se ve mas lindo jaja, private porque es de uso interno
     *  no se puede llamar desde afuera de la clase solo segun accesorioProtector
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
     * Obtiene el tipo de puente de la guitarra
     *
     * @return el tipo de puente
     */
    public String getTipoPuente() {
        return tipoPuente;
    }

    /**
     * Establece el tipo de puente de la guitarra     *
     * @param tipoPuente nuevo tipo de puente
     */
    public void setTipoPuente(String tipoPuente) {
        this.tipoPuente = tipoPuente;
    }

    /**
     * Obtiene el tamaño de la caja de la guitarra
     *
     * @return el tamaño de la caja
     */
    public String getTamanoCaja() {
        return tamanoCaja;
    }

    /**
     * Establece el tamaño de la caja de la guitarra
     * @param tamanoCaja nuevo tamaño de caja
     */
    public void setTamanoCaja(String tamanoCaja) {
        this.tamanoCaja = tamanoCaja;
    }

    /**
     * obtiene si la guitarra viene con funda
     * @return true o false segun sea el caso
     */
    public Boolean getTieneFunda() {
        return tieneFunda;
    }

    /**
     * establece si la guitarra tiene funda
     * @param tieneFunda parametro a utilizar
     */
    public void setTieneFunda(Boolean tieneFunda) {
        this.tieneFunda = tieneFunda;
    }
    /**
     * Obtiene si la guitarra tiene un accesorio protector adicional
     *
     * @return true si tiene el accesorio, false si no
     */
    public Boolean getTieneAccesorioProtector() {
        return tieneAccesorioProtector;
    }

    /**
     * Establece si esta guitarra tiene un accesorio protector adicional.
     *
     * @param tieneAccesorioProtector nuevo estado del accesorio protector
     */
    public void setTieneAccesorioProtector(Boolean tieneAccesorioProtector) {
        this.tieneAccesorioProtector = tieneAccesorioProtector;
    }
    /**
     * Genera una representación en texto de la guitarra , mostrando
     * fabricante, modelo, tipo de puente y tamaño de caja.
     *
     * @return una cadena con los datos principales de la guitarra criolla
     */
    @Override
    public String toString() {
        return "Descripcion Guitarra Criolla: " + getFabricante() + " " + getModelo()
                + " - Puente: " + getTipoPuente() + ", Caja: " + getTamanoCaja()
                + ", Funda: " + convertirATexto(getTieneFunda())
                + ", Accesorio protector: " + convertirATexto(getTieneAccesorioProtector());
    }
}