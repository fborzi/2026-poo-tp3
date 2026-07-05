package edu.programacion.ejercicio2301;

public class Contador {

    private Integer valor;

    public Integer getValor() {
        return valor;
    }
    public void setValor(Integer valor) {
        this.valor = valor;
    }
    public void iniciar() {
        setValor(0);
    }
    public void iniciar(Integer n) {
        setValor(n);
    }
    public void sumar() {
        sumar(1);
    }
    public void sumar(Integer n) {
        setValor(getValor() + n);

    }
    public void restar() {
        restar(1);
    }
    public void restar(Integer n){
        setValor(getValor() - n);
    }
}
