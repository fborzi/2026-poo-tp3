package edu.programacion;

import edu.programacion.ejercicio2303.Punto;
import edu.programacion.ejercicio2304.Circulo;

public class Main {
    static void main() {
        Punto punto = new Punto(5,2);
        Punto puntoB = new Punto(4,3);
        Circulo circulo = new Circulo(punto, 10.0);
        System.out.println(circulo.ampliar(10.0));
        System.out.println(circulo.areaDelCirculo());
        System.out.println(circulo.moverPunto(3,5));
    }
}

