package edu.programacionImpl;

public class Punto {
    private int valorX;
    private int valorY;

    public int getValorX() {
        return valorX;
    }

    public void setValorX(int valorX) {
        this.valorX = valorX;
    }

    public int getValorY() {
        return valorY;
    }

    public void setValorY(int valorY) {
        this.valorY = valorY;
    }

    public Punto sumarValor(int unValor) {
        valorX = valorX + unValor;
        valorY = valorY + unValor;
        return this;
    }

    public Punto sumarPunto(Punto otro) {
        valorX = valorX + otro.getValorX();
        valorY = valorY + otro.getValorY();
        return this;
    }

    public double distanciaAlOrigen() {
        return Math.sqrt(valorX * valorX + valorY * valorY);
    }

    public double dintanciaDe(Punto otro) {
        int dx = otro.getValorX() - valorX;
        int dy = otro.getValorY() - valorY;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
