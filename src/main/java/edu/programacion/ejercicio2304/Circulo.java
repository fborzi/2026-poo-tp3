package edu.programacion.ejercicio2304;

/**
 * Modela un círculo definido por un punto central y un radio.
 *
 * Permite inicializar sus atributos, ampliar el tamaño del radio,
 * calcular el área utilizando la fórmula de la superficie del círculo
 * y trasladar su centro en el plano cartesiano según los valores
 * indicados.
 *
 * Proporciona operaciones para modificar sus dimensiones y ubicación
 * dentro del plano cartesiano.
 */

import edu.programacion.ejercicio2303.Punto;

public class Circulo {

    private Punto centro;
    private Double radio;

    public Punto getCentro() {
        return this.centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public Double getRadio() {
        return this.radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public void iniciar(Punto centro, Double radio) {
        setCentro(centro);
        setRadio(radio);
    }

    public void ampliar(Double unValor) {
        setRadio(getRadio() + unValor);
    }

    public Double area() {
        return Math.PI * getRadio() * getRadio();
    }

    public void trasladar(Double x, Double y) {

        getCentro().setValorX(getCentro().getValorX() + x);

        getCentro().setValorY(getCentro().getValorY() + y);
    }
}
