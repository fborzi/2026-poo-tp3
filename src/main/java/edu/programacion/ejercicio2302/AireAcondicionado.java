package edu.programacion.ejercicio2302;

public class AireAcondicionado {

    //ATRIBUTOS

    private String marca;
    private String modelo;
    private int temperatura;
    private boolean encendido;
    private String modo;
    private int velocidad;

    //CONSTRUCTOR

    public AireAcondicionado(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.temperatura = 24;
        this.encendido = false;
        this.modo = "Frio";
        this.velocidad = 1;
    }

    // METODOS

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public void aumentarTemperatura() {
        temperatura++;
    }

    public void disminuirTemperatura() {
        temperatura--;
    }

    public void cambiarModo(String nuevoModo) {
        modo = nuevoModo;
    }

    public void cambiarVelocidad(int nuevaVelocidad) {
        velocidad = nuevaVelocidad;
    }

    public int obtenerTemperatura() {
        return temperatura;
    }

    public String mostrarEstado() {
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nEncendido: " + encendido +
                "\nTemperatura: " + temperatura +
                "\nModo: " + modo +
                "\nVelocidad: " + velocidad;
    }
}