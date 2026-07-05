package edu.programacion.ejercicio2304;

public class Circulo {

    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public void ampliar(double valor) {
        radio += valor;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public void trasladar(double x, double y) {
        centro.trasladar(x, y);
    }

    public void mostrar() {
        System.out.print("Centro: ");
        centro.mostrar();
        System.out.println("Radio: " + radio);
    }
}