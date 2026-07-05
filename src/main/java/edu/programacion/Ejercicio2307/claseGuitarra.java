package edu.programacion.Ejercicio2307;

public class claseGuitarra {public abstract class Guitarra {

    protected double precio;
    protected String fabricante;
    protected String modelo;
    protected String madera;

    public Guitarra(double precio, String fabricante, String modelo, String madera) {
        this.precio = precio;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.madera = madera;
    }

    public void mostrarDatos() {
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Madera: " + madera);
        System.out.println("Precio: $" + precio);
    }
}
}
