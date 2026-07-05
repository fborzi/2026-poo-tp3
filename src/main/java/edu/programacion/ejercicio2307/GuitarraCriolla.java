package edu.programacion.ejercicio2307;

public class GuitarraCriolla extends Guitarra {

    private String tipoMadera;

    public GuitarraCriolla(String marca, String modelo, int cantidadCuerdas,
                            String color, double precio, String tipoMadera) {

        super(marca, modelo, cantidadCuerdas, color, precio);
        this.tipoMadera = tipoMadera;
    }
}
