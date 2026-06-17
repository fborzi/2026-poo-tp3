package edu.programacion.ejercicio2302;

public class Main {

    public static void main(String[] args) {

        AireAcondicionado aire = new AireAcondicionado();

        aire.setMarca("Samsung");
        aire.setModelo("AR24");

        aire.setTemperaturaMinima(16.0);
        aire.setTemperaturaMaxima(30.0);
        aire.setTemperaturaActual(24.0);

        aire.encender();

        aire.cambiarModo("Frío");
        aire.cambiarVelocidadVentilador("Alta");
        aire.activarTimer();

        System.out.println("Marca: " + aire.getMarca());
        System.out.println("Modelo: " + aire.getModelo());
        System.out.println("Modo: " + aire.getModo());
        System.out.println("Velocidad ventilador: " + aire.getVelocidadVentilador());
        System.out.println("Timer: " + aire.getTimer());

        aire.subirTemperatura();

        System.out.println("Temperatura actual: " + aire.getTemperaturaActual());

        aire.cambiarModo("Calor");

        System.out.println("Nuevo modo: " + aire.getModo());
    }
}