package edu.programacion.ejercicio2302;

public class AireAcondicionado {

    private String marca;
    private int temperatura;
    private boolean encendido;

    public AireAcondicionado(String marca) {
        this.marca = marca;
        this.temperatura = 24;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public void subirTemperatura() {
        temperatura++;
    }

    public void bajarTemperatura() {
        temperatura--;
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Encendido: " + encendido);
    }
}

