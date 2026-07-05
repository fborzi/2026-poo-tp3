package edu.programacion.ejercicio2302;

public record PuntoYdiatancia() {public class Punto {

    // Atributos
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

    // 1. Suma un mismo valor a las coordenadas x e y
    public void sumarValor(double valor) {
        x += valor;
        y += valor;
    }

    // 2. Suma las coordenadas de otro punto
    public void sumarPunto(Punto p) {
        x += p.x;
        y += p.y;
    }

    // 3. Calcula la distancia entre este punto y otro
    public double distanciaDe(Punto p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    // 4. Calcula la distancia al origen (0,0)
    public double distanciaAlOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    // Mostrar el punto
    public void mostrar() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
}
