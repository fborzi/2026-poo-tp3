package edu.programacion.ejercicio2303;

public class Punto {

    private Double valorX;
    private Double valorY;

    public Punto(Double valorX, Double valorY) {
        this.valorX = valorX;
        this.valorY = valorY;
    }

    public Double getValorX() {
        return valorX;
    }

    public Double getValorY() {
        return valorY;
    }

    public void setValorX(Double valorX) {
        this.valorX = valorX;
    }

    public void setValorY(Double valorY) {
        this.valorY = valorY;
    }

    public void sumarValor(Double unValor) {
        valorX = valorX + unValor;
        valorY = valorY + unValor;
    }

    public void sumarPunto(Punto unPunto) {
        valorX = valorX + unPunto.getValorX();
        valorY = valorY + unPunto.getValorY();
    }

    public Double distanciaDe(Punto unPunto) {
        return Math.sqrt(
                Math.pow(unPunto.getValorX() - valorX, 2)
                        + Math.pow(unPunto.getValorY() - valorY, 2)
        );
    }

    public Double distanciaAlOrigen() {
        return Math.sqrt(
                Math.pow(valorX, 2)
                        + Math.pow(valorY, 2)
        );
    }

}