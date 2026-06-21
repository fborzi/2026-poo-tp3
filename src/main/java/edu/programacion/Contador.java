package edu.programacion;

public class Contador {
    private int contador;

    public int iniciar() {
        contador = 0;
        return contador;
    }

    public int iniciar(int n) {
        contador = n;
        return contador;
    }

    public int sumar() {
        return sumar(1);
    }

    public int sumar(int n) {
        contador = contador + n;
        return contador;
    }

    public int restar() {
        return restar(1);
    }

    public int restar(int n) {
        contador = contador - n;
        return contador;
    }

    public int getValor() {
        return contador;
    }

    public void setValor(int valor) {
        contador = valor;
    }
}
