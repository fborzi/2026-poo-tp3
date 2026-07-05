package edu.programacion.ejercicio2301;

public class Contador {
    // ATRIBUTOS
    private Integer valor;

    //CONSTRUCTOR
    public Contador(Integer valor) {
        this.valor = valor;
    }

    // METODOS
    public void iniciar() {
        valor = 0;
    }

    public void iniciar(Integer n) {
        valor = n;
    }

    public void sumar() {
        valor++;
    }

    public void sumar(Integer n) {
        valor += n;
    }

    public void restar() {
        valor--;
    }

    public void restar(Integer n) {
        valor -= n;
    }
    //.

    public Integer obtenerValor() {
        return valor;
    }
}