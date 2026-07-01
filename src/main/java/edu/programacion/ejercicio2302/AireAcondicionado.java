package edu.programacion.ejercicio2302;

/**
 * Se modela un aire acondicionado con atributos que representan sus
 * características y estado de funcionamiento.
 *
 * Permite encender y apagar el equipo, modificar la temperatura
 * dentro de límites establecidos, cambiar el modo de funcionamiento,
 * ajustar la velocidad del ventilador y administrar el temporizador.
 *
 * Sus atributos son privados y su acceso se realiza a través de los
 * métodos definidos en la clase.
 */

public class AireAcondicionado {

    // ATRIBUTOS
    private String marca;
    private String modelo;
    private Boolean encendido;
    private Boolean modoAhorroEnergia;
    private String tipo;
    private Double potencia;
    private String modo;

    private Double temperaturaMinima;
    private Double temperaturaActual;
    private Double temperaturaDeseada;
    private Double temperaturaMaxima;

    private String velocidadVentilador;
    private Boolean timer;

    // GETTERS Y SETTERS

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

    public Boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(Boolean encendido) {
        this.encendido = encendido;
    }

    public Boolean getModoAhorroEnergia() {
        return modoAhorroEnergia;
    }

    public void setModoAhorroEnergia(Boolean modoAhorroEnergia) {
        this.modoAhorroEnergia = modoAhorroEnergia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public Double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(Double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public Double getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(Double temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public Double getTemperaturaDeseada() {
        return temperaturaDeseada;
    }

    public void setTemperaturaDeseada(Double temperaturaDeseada) {
        this.temperaturaDeseada = temperaturaDeseada;
    }

    public Double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(Double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public String getVelocidadVentilador() {
        return velocidadVentilador;
    }

    public void setVelocidadVentilador(String velocidadVentilador) {
        this.velocidadVentilador = velocidadVentilador;
    }

    public Boolean getTimer() {
        return timer;
    }

    public void setTimer(Boolean timer) {
        this.timer = timer;
    }

    // MÉTODOS

    public void encender() {
        setEncendido(true);
    }

    public void apagar() {
        setEncendido(false);
    }

    public void subirTemperatura() {
        if (getTemperaturaActual() < getTemperaturaMaxima()) {
            setTemperaturaActual(getTemperaturaActual() + 1);
        }
    }

    public void bajarTemperatura() {
        if (getTemperaturaActual() > getTemperaturaMinima()) {
            setTemperaturaActual(getTemperaturaActual() - 1);
        }
    }

    public void cambiarModo(String modo) {
        setModo(modo);
    }

    public void cambiarVelocidadVentilador(String velocidad) {
        setVelocidadVentilador(velocidad);
    }

    public void activarTimer() {
        setTimer(true);
    }

    public void desactivarTimer() {
        setTimer(false);
    }
}
