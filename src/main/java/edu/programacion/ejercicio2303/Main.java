package edu.programacion.ejercicio2303;

import edu.programacion.ejercicio2303.Punto;

public class Main {

    public static void main(String[] args) {

        // Crear primer punto
        Punto p1 = new Punto();
        p1.iniciar(3.0, 4.0);

        // Crear segundo punto
        Punto p2 = new Punto();
        p2.iniciar(6.0, 8.0);

        // Mostrar distancia al origen
        System.out.println("Distancia al origen: " + p1.distanciaAlOrigen());

        // Mostrar distancia entre puntos
        System.out.println("Distancia entre puntos: " + p1.distanciaDe(p2));

        // Sumar 2 a x e y
        p1.sumarValor(2.0);

        System.out.println(
                "P1 luego de sumarValor: (" +
                        p1.getValorX() + ", " +
                        p1.getValorY() + ")"
        );

        // Sumar las coordenadas de p2 a p1
        p1.sumarPunto(p2);

        System.out.println(
                "P1 luego de sumarPunto: (" +
                        p1.getValorX() + ", " +
                        p1.getValorY() + ")"
        );
    }
}