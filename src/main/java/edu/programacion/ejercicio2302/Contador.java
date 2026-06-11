package edu.programacion.ejercicio2302;

public class Contador {
    private Integer valor;

    public Integer iniciar(){
        setValor(0);
        return getValor();
    }
    public Integer iniciar(Integer n){
        setValor(n);
        return getValor();
    }

    public Integer sumar(){
        setValor(getValor()+1);
        return getValor();
    }

    public Integer restar(){
        setValor(getValor() - 1);
        return getValor();
    }
    public Integer sumar(Integer n){
        setValor(getValor()+n);
        return getValor();
    }
    public Integer restar(Integer n) {
        setValor(getValor() - n);
        return getValor();
    }
    public Integer getValor(){
        return valor;
    }
    public void setValor(Integer valor){
        this.valor = valor;
    }
}
