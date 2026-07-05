package edu.programacion;

public class Circulo {

    private Punto centro;
    private Double radio;

    public Circulo(){}

    public Circulo(Punto centro, Double radio){

        setCentro(centro);
        setRadio(radio);

    }

    public void setCentro(Punto centro){
        this.centro = centro;
    }

    public Punto getCentro(){
        return this.centro;
    }

    public void setRadio(Double radio){
        this.radio = radio;
    }

    public Double getRadio(){
        return this.radio;
    }

    public Double ampliar(Double unValor){

        setRadio(getRadio() + unValor);

        return getRadio();

    }

    public Double area(){

        return Math.PI * getRadio() * getRadio();

    }

    public Punto trasladar(Double x, Double y){

        getCentro().setX(getCentro().getX() + x);
        getCentro().setY(getCentro().getY() + y);

        return getCentro();

    }

}