package edu.programacion.ejercicio2301;

public class Contador {
    private Integer valor;

    public Contador() {
        this.valor = 0;
    }

    public Contador(Integer valorInitial) {
        this.valor = valorInitial;
    }

    public void reiniciar(){
        this.valor = 0;
    }
    public void incrementar(){
        this.valor++;
    }
    public void decrementar(){
        this.valor--;
    }
    public void sumar(Integer cantidad){
        this.valor += cantidad;
    }
    public void restar(Integer cantidad){
        this.valor -= cantidad;
    }
    public Integer getValor() {
        return valor;
    }
}

