package edu.programacion.ejercicio2307;

public abstract class Guitarra {

    private Integer precio;
    private String fabricante;
    private String modelo;
    private String tipo;
    private String material;
    private String color;
    private Double peso;
    private String materialCuerdas;
    private String paisFabricacion;
    private String codigoProducto;
    private Boolean tieneAfinador;
    private String orientacion;
    private Boolean tieneMicrofonos;
    private Boolean requiereAmplificador;

    public Guitarra() {
    }

    public Integer getPrecio() {
        return this.precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getMaterialCuerdas() {
        return this.materialCuerdas;
    }

    public void setMaterialCuerdas(String materialCuerdas) {
        this.materialCuerdas = materialCuerdas;
    }

    public String getPaisFabricacion() {
        return this.paisFabricacion;
    }

    public void setPaisFabricacion(String paisFabricacion) {
        this.paisFabricacion = paisFabricacion;
    }

    public String getCodigoProducto() {
        return this.codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Boolean getTieneAfinador() {
        return this.tieneAfinador;
    }

    public void setTieneAfinador(Boolean tieneAfinador) {
        this.tieneAfinador = tieneAfinador;
    }

    public String getOrientacion() {
        return this.orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public Boolean getTieneMicrofonos() {
        return this.tieneMicrofonos;
    }

    public void setTieneMicrofonos(Boolean tieneMicrofonos) {
        this.tieneMicrofonos = tieneMicrofonos;
    }

    public Boolean getRequiereAmplificador() {
        return this.requiereAmplificador;
    }

    public void setRequiereAmplificador(Boolean requiereAmplificador) {
        this.requiereAmplificador = requiereAmplificador;
    }
}