package edu.programacion.ejercicio2303;

public class Punto {

    private Double x;
    private Double y;
    public Punto() {
        this.x = 0.0;
        this.y = 0.0;
    }
    public Punto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public Double getX() {
        return x;
    }
    public Double getY() {
        return y;
    }
    public void setX(Double x) {
        this.x = x;
    }
    public void setY(Double y) {
        this.y = y;
    }
    public void sumarValor(Double unValor) {
        this.x += unValor;
        this.y += unValor;
    }
    public void sumarPunto(Punto unPunto) {
        this.x += unPunto.getX();
        this.y += unPunto.getY();
    }
    public Double distanciaDe(Punto unPunto) {
        return Math.sqrt(
                Math.pow(unPunto.getX() - this.x, 2) +
                        Math.pow(unPunto.getY() - this.y, 2)
        );
    }
    public Double distanciaAlOrigen() {
        return Math.sqrt(
                Math.pow(this.x, 2) +
                        Math.pow(this.y, 2)
        );
    }
}
// Math.pow() es una función de Java que sirve para elevar un número a una potencia.
