package edu.programacionImpl;

public class Circulo {
    private Punto centro;
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double ampliar(double valor) {
        radio = radio + valor;
        return radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public Punto trasladar(int x, int y) {
        centro.setValorX(centro.getValorX() + x);
        centro.setValorY(centro.getValorY() + y);
        return centro;
    }
}