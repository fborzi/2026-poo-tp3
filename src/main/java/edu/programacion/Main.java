package edu.programacion;

import edu.programacion.ejercicio2303.Punto;

public class Main {
    static void main() {
        Punto punto = new Punto(5,2);
        Punto puntoB = new Punto(4,3);
        System.out.println(punto.sumarValor(5));
        System.out.println(punto.sumarPunto(puntoB));
        System.out.println(punto.distanciaDe(puntoB));
        System.out.println(punto.distanciaAlOrigen());
    }
}

