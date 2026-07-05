package edu.programacion.ejercicio2302;

public class Main {
    public static void main(String[] args) {

        AireAcondicionado aire = new AireAcondicionado("Samsung");


        System.out.println("Estado inicial:");
        aire.mostrarEstado();


        aire.encender();

        aire.bajarTemperatura();
        aire.bajarTemperatura();
        aire.subirTemperatura();

        System.out.println("\nEstado después de los cambios:");
        aire.mostrarEstado();


        aire.apagar();


        System.out.println("\nEstado final:");
        aire.mostrarEstado();
    }
}