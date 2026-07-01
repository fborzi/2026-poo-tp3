package edu.programacion.ejercicio2303;

public class Punto {
    private Double  valorx;
    private Double  valory;

    public Punto sumarPunto (Punto unPunto){
        Double unPuntovalorx = unPunto.getvalorx();
        Double unPuntovalory = unPunto.getvalory();

        setvalorx(getvalorx() + unPuntovalorx);
        setvalory(getvalory() +  unPuntovalory);

    }


}
