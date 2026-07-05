package edu.programacion.ejercicio2304;

import edu.programacion.ejercicio2303.Punto;

    public class Circulo {
    private Double radio;
    private Punto centro;

    public Circulo() {
        this.centro = new Punto();
        this.radio = 0.0;
    }
    public Circulo(Punto centro, Double radio) {
        this.centro = centro;
        this.radio = radio;
    }
    public Punto getCentro() {
        return centro;
    }
    public Double getRadio() {
        return radio;
    }
    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    public void setRadio(Double radio) {
        this.radio = radio;
    }
}
