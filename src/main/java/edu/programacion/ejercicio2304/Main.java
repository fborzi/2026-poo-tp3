package edu.programacion.ejercicio2304;

import edu.programacion.ejercicio2303.Punto;
import edu.programacion.ejercicio2304.Circulo;

public class Main {

    public static void main(String[] args) {

        Punto centro = new Punto();
        centro.iniciar(3.0, 4.0);

        Circulo circulo = new Circulo();
        circulo.iniciar(centro, 5.0);

        System.out.println("Radio: " + circulo.getRadio());

        System.out.println("Area: " + circulo.area());

        circulo.ampliar(2.0);

        System.out.println("Nuevo radio: " + circulo.getRadio());

        circulo.trasladar(1.0, 2.0);

        System.out.println(
                "Nuevo centro: (" +
                        circulo.getCentro().getValorX() +
                        ", " +
                        circulo.getCentro().getValorY() +
                        ")"
        );
    }
}