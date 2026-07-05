package edu.programacion.ejercicio2304;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void trasladar(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void mostrar() {
        System.out.println("(" + x + ", " + y + ")");
    }
}