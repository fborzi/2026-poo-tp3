package edu.programacion.ejercicio2304;

/**
 * Representa un punto en el plano cartesiano.
 */
public class Punto {

    private double x;
    private double y;

    /**
     * Crea un punto con las coordenadas indicadas.
     *
     * @param x Coordenada X.
     * @param y Coordenada Y.
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calcula la distancia entre este punto y otro.
     *
     * @param otro Punto destino.
     * @return Distancia entre ambos puntos.
     */
    public double distanciaDe(Punto otro) {
        double dx = otro.x - this.x;
        double dy = otro.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Devuelve la coordenada X.
     *
     * @return Coordenada X.
     */
    public double getX() {
        return x;
    }

    /**
     * Devuelve la coordenada Y.
     *
     * @return Coordenada Y.
     */
    public double getY() {
        return y;
    }
}
/**
 * Representa un círculo mediante su centro y su radio.
 */
public class Circulo {

    /**
     * Centro del círculo.
     */
    private Punto centro;

    /**
     * Radio del círculo.
     */
    private double radio;

    /**
     * Crea un círculo.
     *
     * @param centro Centro del círculo.
     * @param radio Radio del círculo.
     */
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    /**
     * Calcula el área del círculo.
     *
     * @return Área.
     */
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Calcula el perímetro del círculo.
     *
     * @return Perímetro.
     */
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    /**
     * Determina si un punto pertenece al círculo.
     *
     * @param punto Punto a verificar.
     * @return true si pertenece.
     */
    public boolean pertenece(Punto punto) {
        return centro.distanciaDe(punto) <= radio;
    }

    /**
     * Devuelve el centro.
     *
     * @return Centro.
     */
    public Punto getCentro() {
        return centro;
    }

    /**
     * Devuelve el radio.
     *
     * @return Radio.
     */
    public double getRadio() {
        return radio;
    }
}