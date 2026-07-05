package edu.programacion.ejercicio2307;

/**
 * Representa una guitarra padre, con los atributos y comportamientos establecidos
 * Es una clase abstracta, no puede instanciarse directamente,
 * solo lo hace a travez de sus clases hijas
 * @author Kenya
 */
public abstract class Guitarra {

    private Float precio;
    private String fabricante;
    private String modelo;
    private String materialMadera;
    private String materialCuerdas;
    private String numSerie;
    private Integer cantidadCuerdas;
    private Integer stock;
    private Boolean estaDisponible;
    private Boolean garantiaVigente;
    private Float porcentajeFijo;

    /**
     * Crea una guitarra con los datos indicados. La disponibilidad se
     * calcula según el stock inicial, y la garantía arranca vigente.
     *
     * @param precio precio de venta de la guitarra
     * @param fabricante fabricante de la guitarra
     * @param modelo modelo de la guitarra
     * @param materialMadera material de la madera utilizada
     * @param materialCuerdas material de las cuerdas utilizadas
     * @param numSerie número de serie único de la guitarra
     * @param cantidadCuerdas cantidad de cuerdas que posee
     * @param stock cantidad de unidades disponibles en stock
     * @param porcentajeFijo porcentaje de descuento a aplicar en promociones
     */
    public Guitarra(Float precio, String fabricante, String modelo, String materialMadera,
                    String materialCuerdas, String numSerie, Integer cantidadCuerdas,
                    Integer stock, Float porcentajeFijo) {
        this.precio = precio;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.materialMadera = materialMadera;
        this.materialCuerdas = materialCuerdas;
        this.numSerie = numSerie;
        this.cantidadCuerdas = cantidadCuerdas;
        this.stock = stock;
        this.porcentajeFijo = porcentajeFijo;
        this.estaDisponible = stock > 0;
        this.garantiaVigente = true;
    }

    /**
     * Este metodo condiciona que el stock debe ser mayor a 0 para poder avenzar, si es asi le resta
     * 1 y modifica el nuevo stock al actualizado
     */
    public void venderUnidad() {
        if (getStock() > 0) {
            setStock(getStock() - 1);
            setEstaDisponible(getStock() > 0);
        }
    }

    /**
     * para conseguir el porcentaje divido / 100 al porcentajeFijo
     * a eso le multiplico el precio y por ultimo le resto para conseguir el precio final
     */
    public void aplicarPromocion(){
        setPrecio(getPrecio() - (getPrecio() * (getPorcentajeFijo() / 100)));
    }

    /**
     * Genera un mensaje informando si la garantía de la guitarra está
     * vigente o no, identificando la guitarra por su número de serie.
     *
     * @return un mensaje indicando el estado de la garantía
     */
    public String verificarGarantia() {
        if (getGarantiaVigente()) {
            return "La guitarra " + getNumSerie() + " tiene garantía vigente.";
        } else {
            return "La guitarra " + getNumSerie() + " no tiene garantía vigente.";
        }
    }

    /**
     * Este metodo muestra el detalle completo de cada guitarra
     * @return detalle de la guitarra
     */
    public String mostrarDetalle() {
        return "Fabricante: " + getFabricante() + ", Modelo: " + getModelo()
                + ", Precio: $" + getPrecio() + ", Stock: " + getStock();
    }

    /**
     * Obtiene el precio establecido de la guitarra.
     *
     * @return el precio de la guitarra
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio de la guitarra.
     *
     * @param precio nuevo precio de la guitarra
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el fabricante de la guitarra.
     *
     * @return el fabricante de la guitarra
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Establece el fabricante de la guitarra.
     *
     * @param fabricante nuevo fabricante de la guitarra
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * Obtiene el modelo de la guitarra.
     *
     * @return el modelo de la guitarra
     */
    public String getModelo(){
        return modelo;
    }

    /**
     * Establece el modelo de la guitarra.
     *
     * @param modelo nuevo modelo de la guitarra
     */
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    /**
     * Obtiene el material de la madera de la guitarra.
     *
     * @return el material de la madera
     */
    public String getMaterialMadera(){
        return materialMadera;
    }

    /**
     * Establece el material de la madera de la guitarra.
     *
     * @param materialMadera nuevo material de madera
     */
    public void setMaterialMadera(String materialMadera){
        this.materialMadera = materialMadera;
    }

    /**
     * Obtiene el material de las cuerdas de la guitarra.
     *
     * @return el material de las cuerdas
     */
    public String getMaterialCuerdas(){
        return materialCuerdas;
    }

    /**
     * Establece el material de las cuerdas de la guitarra.
     *
     * @param materialCuerdas nuevo material de cuerdas
     */
    public void setMaterialCuerdas(String materialCuerdas){
        this.materialCuerdas = materialCuerdas;
    }

    /**
     * Obtiene el número de serie de la guitarra.
     *
     * @return el número de serie
     */
    public String getNumSerie(){
        return numSerie;
    }

    /**
     * Establece el número de serie de la guitarra.
     *
     * @param numSerie nuevo número de serie
     */
    public void setNumSerie(String numSerie){
        this.numSerie = numSerie;
    }

    /**
     * Obtiene la cantidad de cuerdas de la guitarra.
     *
     * @return la cantidad de cuerdas
     */
    public Integer getCantidadCuerdas() {
        return cantidadCuerdas;
    }

    /**
     * Establece la cantidad de cuerdas de la guitarra.
     *
     * @param cantidadCuerdas nueva cantidad de cuerdas
     */
    public void setCantidadCuerdas(Integer cantidadCuerdas) {
        this.cantidadCuerdas = cantidadCuerdas;
    }

    /**
     * Obtiene el stock disponible de la guitarra.
     *
     * @return el stock actual
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * Establece el stock disponible de la guitarra.
     *
     * @param stock nuevo valor de stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * Obtiene si la guitarra está disponible para la venta.
     *
     * @return true si está disponible, false si no
     */
    public Boolean getEstaDisponible() {
        return estaDisponible;
    }

    /**
     * Establece si la guitarra está disponible para la venta.
     *
     * @param estaDisponible nuevo estado de disponibilidad
     */
    public void setEstaDisponible(Boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    /**
     * Obtiene si la garantía de la guitarra está vigente.
     *
     * @return true si la garantía está vigente, false si no
     */
    public Boolean getGarantiaVigente() {
        return garantiaVigente;
    }

    /**
     * Establece si la garantía de la guitarra está vigente.
     *
     * @param garantiaVigente nuevo estado de la garantía
     */
    public void setGarantiaVigente(Boolean garantiaVigente) {
        this.garantiaVigente = garantiaVigente;
    }

    /**
     * Obtiene el porcentaje fijo de descuento aplicado en promociones.
     *
     * @return el porcentaje de descuento
     */
    public Float getPorcentajeFijo() {
        return porcentajeFijo;
    }

    /**
     * Establece el porcentaje fijo de descuento aplicado en promociones.
     *
     * @param porcentajeFijo nuevo porcentaje de descuento
     */
    public void setPorcentajeFijo(Float porcentajeFijo) {
        this.porcentajeFijo = porcentajeFijo;
    }

    /**
     * Genera una representación breve de la guitarra, mostrando
     * fabricante y modelo. Ya que tengo un metodo que regresa el detalle completo
     *
     * @return una cadena con el fabricante y modelo de la guitarra
     */
    @Override
    public String toString() {
        return "Guitarra " + getFabricante() + " " + getModelo();
    }
}