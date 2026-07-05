package edu.programacion;

public class Main {

    public static void main(String[] args) {

        // Crear el objeto
        AireAcondicionado aire = new AireAcondicionado(
                "Samsung",
                "WindFree",
                2
        );

        // Mostrar datos iniciales
        System.out.println("=== DATOS DEL AIRE ===");
        System.out.println("Marca: " + aire.getMarca());
        System.out.println("Modelo: " + aire.getModelo());
        System.out.println("Temperatura: " + aire.getTemperatura());
        System.out.println("Modo: " + aire.getModo());
        System.out.println("Velocidad: " + aire.getVelocidad());
        System.out.println("Estado: " + aire.getEstado());

        System.out.println();

        // Encender
        aire.encender();
        System.out.println("Estado: " + aire.getEstado());

        // Subir temperatura
        aire.subirTemperatura();
        System.out.println("Temperatura: " + aire.getTemperatura());

        // Cambiar modo
        aire.cambiarModo("Calor");
        System.out.println("Modo: " + aire.getModo());

        // Apagar
        aire.apagar();
        System.out.println("Estado: " + aire.getEstado());

    }

}