package edu.programacion.ejercicio2307;

public abstract class Guitarra {

    // ATRIBUTOS
    // Los ponemos protegido asi las clases hijas conocen sus atributos
    protected String marca;
    protected String modelo;
    protected int cantidadCuerdas;
    protected String color;
    protected double precio;


    //CONSTRUCTOR
    public Guitarra(String marca, String modelo, int cantidadCuerdas,
                    String color, double precio) {

        this.marca = marca;
        this.modelo = modelo;
        this.cantidadCuerdas = cantidadCuerdas;
        this.color = color;
        this.precio = precio;
    }

    //METODOS
    public void afinar() {
        System.out.println("La guitarra se está afinando.");
    }
}
