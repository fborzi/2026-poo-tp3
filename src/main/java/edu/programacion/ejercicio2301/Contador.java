package edu.programacion.ejercicio2301;

public class Contador {
    private Integer valor;

    public Contador (Integer valor){
        this.valor=valor;
    }
    public Integer iniciar() {
        setValor(0);
       return getValor();
    }
    public Integer iniciar(Integer valor){
        setValor(valor);
        return getValor();
    }
    public Integer suma(){
        setValor(valor + 1);

        return getValor();
    }
    public Integer suma(Integer suma){
        setValor(valor + suma);
        return getValor();
    }

    public Integer resta(){
        setValor(valor - 1);
        return getValor();
    }
    public Integer resta(Integer resta){
        setValor(valor - resta);
        return getValor();
    }

    public void setValor(Integer valor){
        this.valor=valor;

    }
    public Integer getValor(){
        return this.valor;
    }
}
