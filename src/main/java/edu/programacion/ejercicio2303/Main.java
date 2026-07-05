package edu.programacion.ejercicio2303;

/**
 * Clase de prueba para verificar el funcionamiento de Punto.
 */
public class Main {
    /**
     * Creo objetos Punto para probar
     * @param args Sigo sin utilizar argumentos pero la firma del main lo necesita.
     */
    public static void main(String[] args) {

        Punto punto = new Punto(10,12);
        Punto otroPunto = new Punto(5, 3);

        punto.sumarValor(10);
        System.out.println(punto);
        punto.sumarPunto(otroPunto);
        System.out.println(punto);
        Double distancia = punto.distanciaDe(otroPunto);
        System.out.println(distancia);
        Double distanciaOrigen = punto.distanciaAlOrigen();
        System.out.println(distanciaOrigen);
    }
}
