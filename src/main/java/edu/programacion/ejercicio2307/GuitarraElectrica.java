package edu.programacion.ejercicio2307;

public class GuitarraElectrica extends Guitarra {
    // Con el extends hacemos referencia al famoso "ES UN"

    // ATRIBUTOS
    private int potencia;

    // CONSTRUCTOR
    public GuitarraElectrica(String marca, String modelo, int cantidadCuerdas,
                             String color, double precio, int potencia) {

        super(marca, modelo, cantidadCuerdas, color, precio);
        this.potencia = potencia;
    }
}
