package edu.programacion.ejercicio2304;

import edu.programacion.ejercicio2303.Punto;

public class Circulo {
    private Punto punto;
    private Double radio;

    public Circulo(Punto punto, Double radio){
        this.punto= punto;
        this.radio= radio;
    }
    public double ampliar(double valor){
        setRadio(getRadio()+valor);
        return getRadio();
    }
    public double areaDelCirculo(){
        double pi = 3.14;
        double radioAlcuadrado= this.radio * this.radio;
        double area= pi * radioAlcuadrado;
        return area;
    }
    public Punto moverPunto(Integer valorX, Integer valorY){
        Punto nuevoPunto = new Punto();
        nuevoPunto.setValorx(valorX + this.punto.getValorx());
        nuevoPunto.setValory(valorY + this.punto.getValory());
        return nuevoPunto;
    }
    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public Punto getPunto() {
        return this.punto;
    }
    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return this.radio;
    }
}
