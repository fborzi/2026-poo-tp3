package edu.programacion.ejercicio2307;

public class GuitarraCriolla extends Guitarra {

    public GuitarraCriolla(String madera, String cuerdas, String clavijas, String maderaDiapason, String marca) {
        super(madera, cuerdas, clavijas, maderaDiapason, marca);
    }
    @Override
    public void tocar(String sonido) {
        System.out.println("La guitarra criolla " + getMarca() + " suena en armonia: " + sonido);
    }
}
