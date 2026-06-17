package edu.programacion.ejercicio2304;

import edu.programacion.ejercicio2303.Punto;

public class Circulo {

    // Atributos
    private Punto centro;
    private Double radio;

    // Getter del centro
    public Punto getCentro() {
        return this.centro;
    }

    // Setter del centro
    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    // Getter del radio
    public Double getRadio() {
        return this.radio;
    }

    // Setter del radio
    public void setRadio(Double radio) {
        this.radio = radio;
    }

    // Inicializa el círculo
    public void iniciar(Punto centro, Double radio) {
        setCentro(centro);
        setRadio(radio);
    }

    // Amplía el radio
    public void ampliar(Double unValor) {
        setRadio(getRadio() + unValor);
    }

    // Calcula el área
    public Double area() {
        return Math.PI * getRadio() * getRadio();
    }

    // Traslada el centro del círculo
    public void trasladar(Double x, Double y) {

        getCentro().setX(getCentro().getX() + x);

        getCentro().setY(getCentro().getY() + y);
    }
}