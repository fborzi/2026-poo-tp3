package edu.programacion;

import edu.programacion.ejercicio2301.Contador;
import edu.programacion.ejercicio2302.AireAcondicionado;

public class Main {
    static void main() {
        AireAcondicionado Aire = new AireAcondicionado(10,15,5,false,false);
        System.out.println("El aire esta encendido: " + Aire.encender());
        System.out.println("El aire esta encendido: " + Aire.apagar());
        System.out.println("la temperatura es " + Aire.subirTemp());
        System.out.println("la temperatura es " + Aire.subirTemp());
        System.out.println("la temperatura es " + Aire.bajarTemp());
        System.out.println("modo calor: " + Aire.cambiarModo());
        System.out.println("modo calor: " + Aire.cambiarModo());
    }
}

