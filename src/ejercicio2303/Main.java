package edu.programacion.ejercicio2303;

public class Main {

    public static void main(String[] args) {

        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto(1, 2);

        p1.mostrar();
        p2.mostrar();

        p1.sumarValor(2);
        p1.mostrar();

        p1.sumarPunto(p2);
        p1.mostrar();

        System.out.println("Distancia entre puntos: " + p1.distanciaDe(p2));
        System.out.println("Distancia al origen: " + p1.distanciaAlOrigen());
    }
}