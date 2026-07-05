package edu.programacion.ejercicio2303;

public class Punto {

    // ATRIBUTOS
    private double x;
    private double y;

    // CONSTRUCTOR
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // METODOS

    // Mostramos cuanto vale el punto
    public String mostrar() {
        return "(" + x + ", " + y + ")";
    }

    // Sumamos un valor a X e Y
    public void sumarValor(double valor) {
        this.x += valor;
        this.y += valor;
    }

    // Sumamos otro punto
    public void sumarPunto(Punto p) {
        this.x += p.x;
        this.y += p.y;
    }

    // Distancia a otro punto
    public double distanciaDe(Punto p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    // Distancia al origen
    public double distanciaAlOrigen() {
        return Math.sqrt((x * x) + (y * y));
    }

    //

}
