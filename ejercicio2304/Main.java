package edu.programacion.ejercicio2304;

public class Main {
    public static void main(String[] args) {

        Punto p = new Punto(2, 3);
        Circulo c = new Circulo(p, 5);

        c.mostrar();
        System.out.println("Área: " + c.area());

        c.ampliar(2);
        c.trasladar(1, 1);

        c.mostrar();
    }
}