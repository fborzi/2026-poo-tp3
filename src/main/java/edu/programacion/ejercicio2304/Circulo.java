package edu.programacion.ejercicio2304;

import edu.programacion.ejercicio2303.Punto;

public class Circulo {

    private Punto centro;
    private Integer radio;

    /**
     * Constructor crea un círculo a partir de un punto central y un radio dados.
     * @param centro punto que representa el centro del círculo
     * @param radio radio del círculo
     */
    public Circulo(Punto centro, Integer radio){
        this.centro = centro;
        this.radio = radio;
    }

    /**
     * Aumenta el radio del círculo sumándole el valor indicado.
     * @param unValor cantidad a sumar al radio actual
     */
    public void ampliar(Integer unValor){
        setRadio(getRadio() + unValor);
    }

    /**
     * Calcula el área del círculo en base a su radio actual.
     * Math.PI representa la constante pi y Math.pow eleva el radio al cuadrado
     * @return el área del círculo
     */
    public Double area(){
        return Math.PI * Math.pow(getRadio(), 2);
    }

    /**
     * Traslada el círculo desplazando su centro según los valores indicados en x e y.
     * Ingrese al Centro para poder Setear el nuevo Centro
     * @param x cantidad a desplazar en el eje x
     * @param y cantidad a desplazar en el eje y
     */
    public void trasladar( Integer x, Integer y ){
        getCentro().setX(getCentro().getX() + x);
        getCentro().setY(getCentro().getY() + y);
    }

    /**
     * Establece el centro del círculo.
     * @param centro nuevo punto central del círculo
     */
    public void setCentro(Punto centro ){
        this.centro = centro;
    }

    /**
     * Obtiene el centro del círculo.
     * @return el punto central del círculo
     */
    public Punto getCentro(){
        return centro;
    }

    /**
     * Establece el radio del círculo.
     * @param radio nuevo radio del círculo
     */
    public void setRadio(Integer radio){
        this.radio = radio;
    }

    /**
     * Obtiene el radio del círculo.
     * @return el radio del círculo
     */
    public Integer getRadio(){
        return radio;
    }

    /**
     * Para visualizar los datos en ese orden
     * @return datos del centro y el radio
     */
    @Override
    public String toString() {
        return "Círculo con centro en " + getCentro() + " y radio " + getRadio();
    }
}
