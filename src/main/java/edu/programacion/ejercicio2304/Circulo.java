package edu.programacion.ejercicio2304;

import edu.programacion.ejercicio2303.Punto;

public class Circulo {

    private Punto centro;
    private Double radio;

    public Circulo(Punto centro, Double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public void ampliar(Double unValor) {
        radio = radio + unValor;
    }

    public Double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void trasladar(Double x, Double y) {
        centro.sumarValor(0.0);
        centro.setValorX(centro.getValorX() + x);
        centro.setValorY(centro.getValorY() + y);
    }

}