package edu.programacion.ejercicio2303;

public class Punto {
    private Integer valorx;
    private Integer valory;

    public Punto(Integer valorx, Integer valory){
        this.valorx = valorx;
        this.valory = valory;
    }

    public Punto(){}

    public Punto sumarValor(Integer valor){
        Punto nuevoPunto = new Punto();
        nuevoPunto.setValorx(this.getValorx() + valor);
        nuevoPunto.setValory(this.getValory() + valor);
        return nuevoPunto;
    }

    public Punto sumarPunto(Punto punto){
        Punto nuevoPunto = new Punto();
        nuevoPunto.setValorx(punto.getValorx() + this.getValorx());
        nuevoPunto.setValory(punto.getValory() + this.getValory());
        return nuevoPunto;
    }
    public Integer distanciaDe(Punto punto){
        Integer restax= punto.getValorx() - this.getValorx();
        Integer restay= punto.getValory() - this.getValory();
        Integer cuadradoA = Math.powExact(restax,2);
        Integer cuadradoB = Math.powExact(restay,2);
        Integer sumaCuadrados = cuadradoB + cuadradoA;
        Integer distancia =(int) Math.sqrt(sumaCuadrados);
        return distancia;
    }
    public Integer distanciaAlOrigen(){
        Integer cuadradoX = getValorx() * getValorx();
        Integer cuadradoY = getValory() * getValory();
        Integer suma = cuadradoX + cuadradoY;
        Integer distanciaO = (int) Math.sqrt(suma);
        return distanciaO;
    }
    public void setValorx(Integer valorx) {
        this.valorx = valorx;
    }

    public Integer getValorx() {
        return this.valorx;
    }
    public void setValory(Integer valory) {
        this.valory = valory;
    }

    public Integer getValory() {
        return this.valory;
    }

    @Override
    public String toString() {
        return "(" + valorx + ", " + valory + ")";
    }

}


