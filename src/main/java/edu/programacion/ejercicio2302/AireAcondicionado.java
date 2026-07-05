package edu.programacion.ejercicio2302;

public class AireAcondicionado {

    // Atributos
    private String marca;
    private int temperatura;
    private boolean encendido;
    private String modo;

    // Constructor
    public AireAcondicionado(String marca, int temperatura) {
        this.marca = marca;
        this.temperatura = temperatura;
        this.encendido = false;
        this.modo = "Frío";
    }

    // Métodos
    public void encender() {
        encendido = true;
        System.out.println("Aire acondicionado encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Aire acondicionado apagado.");
    }

    public void aumentarTemperatura() {
        temperatura++;
        System.out.println("Temperatura: " + temperatura + "°C");
    }

    public void disminuirTemperatura() {
        temperatura--;
        System.out.println("Temperatura: " + temperatura + "°C");
    }

    public void cambiarModo(String nuevoModo) {
        modo = nuevoModo;
        System.out.println("Modo cambiado a: " + modo);
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Modo: " + modo);
        System.out.println("Encendido: " + encendido);
    }
}
    //Atributos
    private string marca;
    private double temperatura

