package edu.programacion.ejercicio2303;
/**
 * Representa un punto en un plano cartesiano.
 */
public class Punto {

    /**
     * Coordenada X.
     */
    private double x;

    /**
     * Coordenada Y.
     */
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
     * Suma el mismo valor a las coordenadas X e Y.
     *
     * @param unValor Valor a sumar.
     */
    public void sumarValor(double unValor) {
        x += unValor;
        y += unValor;
    }

    /**
     * Suma las coordenadas de otro punto.
     *
     * @param unPunto Punto a sumar.
     */
    public void sumarPunto(Punto unPunto) {
        x += unPunto.x;
        y += unPunto.y;
    }

    /**
     * Calcula la distancia entre este punto y otro.
     *
     * @param unPunto Punto destino.
     * @return Distancia entre ambos puntos.
     */
    public double distanciaDe(Punto unPunto) {

        double dx = unPunto.x - x;
        double dy = unPunto.y - y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Calcula la distancia desde el punto al origen.
     *
     * @return Distancia al origen.
     */
    public double distanciaAlOrigen() {
        return Math.sqrt(x * x + y * y);
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