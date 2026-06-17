package edu.programacion.ejercicio2307;

public class Main {

    public static void main(String[] args) {
        // Guitarra guitarra = new Guitarra();
        GuitarraCriolla criolla = new GuitarraCriolla();
        criolla.setFabricante("Yamaha");
        criolla.setModelo("C40");
        criolla.setPrecio(150000);

        GuitarraAcustica acustica = new GuitarraAcustica();
        acustica.setFabricante("Fender");
        acustica.setModelo("CD-60");
        acustica.setPrecio(250000);

        GuitarraElectrica electrica = new GuitarraElectrica();
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