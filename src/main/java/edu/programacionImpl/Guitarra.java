package edu.programacionImpl;

public abstract class Guitarra {
    private String modelo;
    private String tipo;
    private String fabricante;
    private String material;
    private Double precio;
    private String color;
    private Integer numeroDeCuerdas;
    private Double peso;
    private Boolean esDiestra;

    public void afinar() {}
    public void tocarNota() {}
    public void cambiarCuerdas() {}
    public void limpiar() {}
    public String describir() { return ""; }
}
