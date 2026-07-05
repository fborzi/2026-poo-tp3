package edu.programacion.ejercicio2307;

/**
 * Representa una guitarra acústica
 * hereda los atributos y comportamientos generales de Guitarra padre,
 * agregando datos propios sobre su diseño constructivo.
 *
 * @author Kenya
 */
public class GuitarraAcustica extends Guitarra {

    private Boolean corte;
    private Boolean protector;
    private String tipoCuerda;
    private Boolean tieneFunda;

    /**
     * Crea una guitarra acústica con los datos heredados de Guitarra,
     * más los datos propios de corte, protector y tipo de cuerda. La
     * funda es algo que agrega el cliente cuando realiza la compra,
     * así que se inicia en false porque no viene con el accesorio de
     * manera predeterminada.
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
     * @param corte si la guitarra tiene corte en el cuerpo (cutaway)
     * @param protector si la guitarra viene con protector instalado
     * @param tipoCuerda tipo de cuerda utilizada (por ejemplo, nylon o acero)
     */
    public GuitarraAcustica(Float precio, String fabricante, String modelo, String materialMadera,
                            String materialCuerdas, String numSerie, Integer cantidadCuerdas,
                            Integer stock, Float porcentajeFijo,
                            Boolean corte, Boolean protector, String tipoCuerda) {
        super(precio, fabricante, modelo, materialMadera, materialCuerdas, numSerie,
                cantidadCuerdas, stock, porcentajeFijo);
        this.corte = corte;
        this.protector = protector;
        this.tipoCuerda = tipoCuerda;
        this.tieneFunda = false;
    }

    /**
     * Coloca una funda protectora sobre la guitarra acústica, si es
     * que el cliente quiere
     */
    public void colocarFunda() {
        setTieneFunda(true);
    }

    /**
     * Convierte un valor booleano en un texto legible ("Sí" o "No").
     * igual que en guitarra acustica los utilizo para que se vea mas lindo jjaja
     * es un metodo interno que cambia segun colocarFunda
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
     * Obtiene si la guitarra tiene corte en el cuerpo
     * @return true si tiene corte, false si no
     */
    public Boolean getCorte() {
        return corte;
    }

    /**
     * Establece si la guitarra tiene corte en el cuerpo
     * @param corte nuevo valor de corte
     */
    public void setCorte(Boolean corte) {
        this.corte = corte;
    }

    /**
     * Obtiene si la guitarra viene con protector instalado
     * @return true si tiene protector, false si no
     */
    public Boolean getProtector() {
        return protector;
    }

    /**
     * Establece si la guitarra viene con protector instalado
     * @param protector nuevo valor de protector
     */
    public void setProtector(Boolean protector) {
        this.protector = protector;
    }

    /**
     * Obtiene el tipo de cuerda de la guitarra
     * @return el tipo de cuerda
     */
    public String getTipoCuerda() {
        return tipoCuerda;
    }

    /**
     * Establece el tipo de cuerda de la guitarra
     *
     * @param tipoCuerda nuevo tipo de cuerda
     */
    public void setTipoCuerda(String tipoCuerda) {
        this.tipoCuerda = tipoCuerda;
    }

    /**
     * Obtiene si la guitarra tiene funda
     * @return true si tiene funda, false si no
     */
    public Boolean getTieneFunda() {
        return tieneFunda;
    }

    /**
     * Establece si la guitarra tiene funda
     * @param tieneFunda nuevo estado de la funda
     */
    public void setTieneFunda(Boolean tieneFunda) {
        this.tieneFunda = tieneFunda;
    }

    /**
     * Muestra la representación en texto de la guitarra acústica, el detalle;
     * fabricante, modelo, tipo de cuerda, corte y funda.
     *
     * @return una cadena con los datos principales de la guitarra acústica
     */
    @Override
    public String toString() {
        return "Descripcion Guitarra Acustica: " + getFabricante() + " " + getModelo()
                + " - Cuerda: " + getTipoCuerda() + ", Corte: " + convertirATexto(getCorte())
                + ", Funda: " + convertirATexto(getTieneFunda());
    }
}