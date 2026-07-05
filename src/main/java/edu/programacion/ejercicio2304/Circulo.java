package edu.programacion.ejercicio2304;

public class Circulo {

    // ATRIBUTOS
    private Punto centro;
    private double radio;

    // Constructor
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    // METODOS
    // Amplía el radio
    public void ampliar(double valor) {
        radio += valor;
    }

    // Calcula el área
    public double area() {
        return Math.PI * (radio * radio);
    }

    // Traslada el círculo
    public void trasladar(double x, double y) {
        centro.trasladar(x, y);
    }

    // Muestra los datos
    public String mostrar() {
        return "Centro: " + centro.mostrar() + ", y Radio: " + radio;
    }
}
