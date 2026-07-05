package edu.programacion.ejercicio23007;

public abstract class Guitarra {

    private String marca;
    private Integer cuerdas;

    public Guitarra() {
    }

    public Guitarra(String marca, Integer cuerdas) {
        this.marca = marca;
        this.cuerdas = cuerdas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCuerdas() {
        return cuerdas;
    }

    public void setCuerdas(Integer cuerdas) {
        this.cuerdas = cuerdas;
    }
}
