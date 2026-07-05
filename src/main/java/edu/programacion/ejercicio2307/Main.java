package edu.programacion.ejercicio2307;

/**
 * Clase de prueba para instanciar las guitarras hijas y probar su salida.
 * confirmando que Guitarra, al ser abstracta, no puede instanciarse
 * directamente, y que sus hijas heredan y utilizan correctamente sus
 * atributos y métodos.
 */
public class Main {

    public static void main(String[] args) {

        GuitarraCriolla criolla1 = new GuitarraCriolla(10000f, "Yamaha", "FG800",
                "ABETO MACIZO", "Acero", "1010101", 6,
                85, 8f, "Fijo", "Dreadnought");

        GuitarraAcustica acustica1 = new GuitarraAcustica(85000f, "Takamine", "GD30CE",
                "Caoba", "Bronce", "2020202", 6,
                40, 12f, true, true, "Acero");

        GuitarraElectroAcustica electroacustica1 = new GuitarraElectroAcustica(120000f, "Ovation",
                "Celebrity", "Arce", "Bronce Fosforado", "3030303",
                6, 20, 15f, "Jack 1/4\"", true);

        System.out.println(criolla1);
        System.out.println(acustica1);
        System.out.println(electroacustica1);
    }
}
