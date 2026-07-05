package edu.programacion.ejercicio2303;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void sumarValor(double valor) {
        x += valor;
        y += valor;
    }

    public void sumarPunto(Punto p) {
        x += p.x;
        y += p.y;
    }

    public double distanciaDe(Punto p) {
        return Math.sqrt(
                Math.pow(x - p.x, 2) +
                        Math.pow(y - p.y, 2)
        );
    }

    public double distanciaAlOrigen() {
        return Math.sqrt(
                Math.pow(x, 2) +
                        Math.pow(y, 2)
        );
    }

    public void mostrar() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
