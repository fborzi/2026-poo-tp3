package edu.programacion.ejercicio2307;

public class Main {
    public static void main(String[] args) {
        GuitarraElectrica guitarra1 = new GuitarraElectrica(
                "Fender",
                "Stratocaster",
                1500000
        );

        guitarra1.setTipoMadera("Aliso");
        guitarra1.setColor("Negro");
        guitarra1.setNumeroDeCuerdas(6);
        guitarra1.setCircuitoElectrico(true);
        guitarra1.setGolpeador("Blanco");

        GuitarraAcustica guitarra2 = new GuitarraAcustica(
                "Yamaha",
                "F310",
                350000
        );

        guitarra2.setTipoMadera("Abeto");
        guitarra2.setColor("Natural");
        guitarra2.setNumeroDeCuerdas(6);
        guitarra2.setCajaResonancia("Grande");

        GuitarraCriolla guitarra3 = new GuitarraCriolla(
                "Gracia",
                "M5",
                280000
        );

        guitarra3.setTipoMadera("Cedro");
        guitarra3.setColor("Marrón");
        guitarra3.setNumeroDeCuerdas(6);
        guitarra3.setBocaCentral("Redonda");

        GuitarraClasica guitarra4 = new GuitarraClasica(
                "Alhambra",
                "Z Nature",
                450000
        );

        guitarra4.setTipoMadera("Caoba");
        guitarra4.setColor("Natural");
        guitarra4.setNumeroDeCuerdas(6);
        guitarra4.setCuerdasNylon(6);

        System.out.println("Guitarra Eléctrica");
        System.out.println("Fabricante: " + guitarra1.getFabricante());
        System.out.println("Modelo: " + guitarra1.getModelo());
        System.out.println("Precio: $" + guitarra1.getPrecio());

        System.out.println();

        System.out.println("Guitarra Acústica");
        System.out.println("Fabricante: " + guitarra2.getFabricante());
        System.out.println("Modelo: " + guitarra2.getModelo());
        System.out.println("Precio: $" + guitarra2.getPrecio());

        System.out.println("=== Guitarra Criolla ===");
        System.out.println("Fabricante: " + guitarra3.getFabricante());
        System.out.println("Modelo: " + guitarra3.getModelo());
        System.out.println("Precio: $" + guitarra3.getPrecio());

        System.out.println();

        System.out.println("=== Guitarra Clásica ===");
        System.out.println("Fabricante: " + guitarra4.getFabricante());
        System.out.println("Modelo: " + guitarra4.getModelo());
        System.out.println("Precio: $" + guitarra4.getPrecio());
    }

}
