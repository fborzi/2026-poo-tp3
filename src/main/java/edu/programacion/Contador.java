package edu.programacion;

public class Contador {

    private int valor;

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int iniciar() {
        return iniciar(0);

    }
    public int iniciar(int n) {
        setValor(n);
        return getValor();
    }

    public int sumar() {
        return sumar(1);

    }

    public int sumar(int n){
        setValor(getValor() + n);
        return getValor();
    }

    public int restar() {
        return restar(1);

    }

    public int restar(int n){
        setValor(getValor() - n);
        return getValor();
    }
}
