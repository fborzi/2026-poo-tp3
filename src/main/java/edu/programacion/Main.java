package edu.programacion;

import edu.programacion.ejercicio2301.Contador;

public class Main {
    static void main() {


        Contador contador = new Contador();

        contador.iniciar();
        contador.sumar(15);
        contador.restar(1);
        System.out.println(contador.getValor());

    }
}

