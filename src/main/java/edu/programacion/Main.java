package edu.programacion;

import edu.programacion.ejercicio2301.Contador;

public class Main {
    static void main() {
        Contador contador = new Contador(0);
        System.out.println(contador.iniciar());
        System.out.println(contador.iniciar(5));
        System.out.println(contador.suma());
        System.out.println(contador.suma(3));
        System.out.println(contador.resta());
        System.out.println(contador.resta(3));
    }
}

