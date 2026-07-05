package edu.programacion;

public class Punto {

    // Atributos
    private Double x;
    private Double y;

    // Constructor vacío
    public Punto() {
    }

    // Constructor con parámetros
    public Punto(Double x, Double y) {
        setX(x);
        setY(y);
    }

    // Setters
    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    // Getters
    public Double getX() {
        return this.x;
    }

    public Double getY() {
        return this.y;
    }

    // Suma el mismo valor a x e y
    public Punto sumarValor(Double unValor) {

        setX(getX() + unValor);
        setY(getY() + unValor);

        return this;
    }

    // Suma otro punto
    public Punto sumarPunto(Punto unPunto) {

        setX(getX() + unPunto.getX());
        setY(getY() + unPunto.getY());

        return this;
    }

    // Distancia entre dos puntos
    public Double distanciaDe(Punto unPunto) {

        Double dx = unPunto.getX() - getX();
        Double dy = unPunto.getY() - getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Distancia al origen
    public Double distanciaAlOrigen() {

        return Math.sqrt(getX() * getX() + getY() * getY());

    }

}