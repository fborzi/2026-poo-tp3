package edu.programacion.ejercicio2302;

public class AireAcondicionado {
    private String controlRemoto;
    private String marca;
    private String modelo;
    private String color;
    private Integer temperaturaMaxima;
    private Integer temperaturaMinima;
    private Integer temperaturaActual;
    private Integer temporizador;
    private Boolean encendido;
    private Boolean swing;
    private Double tamanio;

    public Integer temperaturaMaxima() {
        return temperaturaMaxima;
    }
    public Integer temperaturaMinima() {
        return temperaturaMinima;
    }
    public Integer temperaturaActual() {
        return temperaturaActual;
    }
    public Integer temporizador() {
        return temporizador;
    }
    public Boolean encendido(){
        return true;
    }
   public Boolean swing() {
        return true;
   }

    public String getControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(String controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(Integer temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Integer getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(Integer temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public Integer getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(Integer temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public Integer getTemporizador() {
        return temporizador;
    }

    public void setTemporizador(Integer temporizador) {
        this.temporizador = temporizador;
    }

    public Boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(Boolean encendido) {
        this.encendido = encendido;
    }

    public Boolean getSwing() {
        return swing;
    }

    public void setSwing(Boolean swing) {
        this.swing = swing;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }
}
