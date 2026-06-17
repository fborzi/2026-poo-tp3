package edu.programacion.ejercicio2307;

import edu.programacion.ejercicio2307.Criolla;
import edu.programacion.ejercicio2307.Acustica;
import edu.programacion.ejercicio2307.Electrica;

public class Main {

    public static void main(String[] args) {
        // Guitarra guitarra = new Guitarra();
        Criolla criolla = new Criolla();
        criolla.setFabricante("Yamaha");
        criolla.setModelo("C40");
        criolla.setPrecio(150000);

        Acustica acustica = new Acustica();
        acustica.setFabricante("Fender");
        acustica.setModelo("CD-60");
        acustica.setPrecio(250000);

        Electrica electrica = new Electrica();
        electrica.setFabricante("Gibson");
        electrica.setModelo("Les Paul");
        electrica.setPrecio(1200000);

        System.out.println("CRIOLLA");
        System.out.println("Fabricante: " + criolla.getFabricante());
        System.out.println("Modelo: " + criolla.getModelo());
        System.out.println("Precio: " + criolla.getPrecio());

        System.out.println();

        System.out.println("ACUSTICA");
        System.out.println("Fabricante: " + acustica.getFabricante());
        System.out.println("Modelo: " + acustica.getModelo());
        System.out.println("Precio: " + acustica.getPrecio());

        System.out.println();

        System.out.println("ELECTRICA");
        System.out.println("Fabricante: " + electrica.getFabricante());
        System.out.println("Modelo: " + electrica.getModelo());
        System.out.println("Precio: " + electrica.getPrecio());
    }
}