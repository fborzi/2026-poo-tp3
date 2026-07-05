package edu.programacion.ejercicio2304;

public class Punto {

    // ATRIBUTOS
    private double x;
    private double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // METODOS
    // Traslada el punto
    public void trasladar(double dx, double dy) {
        x += dx;
        y += dy;
    }

    // Muestra el punto
    public String mostrar() {
        return "(" + x + ", " + y + ")";
    }
}

