package edu.programacion.ejercicio2302;

public class Aireacondicionado {

    private Boolean estado;
    private Double temperaturaActual;
    private Double temperaturaConfigurada;
    private String modo;
    private Integer velocidadVentilador;
    private Integer temporizador;
    private Double consumoEnergetico;

    public Aireacondicionado(Boolean estado, Double temperaturaActual,
                             Double temperaturaConfigurada, String modo,
                             Integer velocidadVentilador, Integer temporizador,
                             Double consumoEnergetico) {

        this.estado = estado;
        this.temperaturaActual = temperaturaActual;
        this.temperaturaConfigurada = temperaturaConfigurada;
        this.modo = modo;
        this.velocidadVentilador = velocidadVentilador;
        this.temporizador = temporizador;
        this.consumoEnergetico = consumoEnergetico;
    }

    public void encender() {
        estado = true;
    }

    public void apagar() {
        estado = false;
    }

    public void subirTemperatura() {
        temperaturaConfigurada++;
    }

    public void bajarTemperatura() {
        temperaturaConfigurada--;
    }

    public void cambiarModo() {

    }

    public void ajustarVelocidad() {

    }

    public void programarTemporizador() {

    }
}