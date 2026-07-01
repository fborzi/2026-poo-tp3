package edu.programacion;

import edu.programacion.ejercicio2301.Contador;
import edu.programacion.ejercicio2302.AireAcondicionado;

public class Main {
    static void main() {

        Contador tuContador = new Contador();

        tuContador.iniciar(5);
        System.out.println(tuContador.sumar(5));
        System.out.println(tuContador.restar(2));
        System.out.println(tuContador.sumar());
        System.out.println(tuContador.restar());

        AireAcondicionado miAireAcondicionado = new AireAcondicionado();
        System.out.println(miAireAcondicionado);

    }
}

