package edu.programacion;

import edu.programacion.ejercicio2301.Contador;

public class Main {
    static void main() {

        Contador miContador = new Contador();

        miContador.iniciar(10);

        miContador.restar(15);
        miContador.sumar();

        System.out.println("El valor actual de mi contador es: " + miContador.getValor());

    }
}

