package edu.programacion.ejercicio2303;

/**
 * Modela un punto en el plano cartesiano mediante dos coordenadas
 * representadas por los valores x e y.
 *
 * Permite inicializar sus coordenadas, sumar un mismo valor a ambas,
 * sumar las coordenadas de otro punto, calcular la distancia entre
 * dos puntos mediante el teorema de Pitágoras y determinar la
 * distancia desde el punto al origen de coordenadas.
 *
 * La información del punto se mantiene protegida y puede ser
 * consultada o modificada mediante los métodos provistos por la clase.
 */

public class Punto {

    private Double x;
    private Double y;

    public Double getValorX() {
        return this.x;
    }

    public void setValorX(Double x) {
        this.x = x;
    }

    public Double getValorY() {
        return this.y;
    }

    public void setValorY(Double y) {
        this.y = y;
    }

    public void iniciar(Double x, Double y) {
        setValorX(x);
        setValorY(y);
    }

    public void sumarValor(Double unValor) {

        setValorX(getValorX() + unValor);

        setValorY(getValorY() + unValor);
    }

    public void sumarPunto(Punto unPunto) {

        setValorX(getValorX() + unPunto.getValorX());

        setValorY(getValorY() + unPunto.getValorY());
    }

    public Double distanciaDe(Punto unPunto) {

        Double dx = getValorX() - unPunto.getValorX();

        Double dy = getValorY() - unPunto.getValorY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    public Double distanciaAlOrigen() {

        return Math.sqrt(getValorX() * getValorX() + getValorY() * getValorY());
    }

}
