package edu.programacion.ejercicio2307;

public class Guitarra {

    private Double precio;
    private String fabricante;
    private String modelo;
    private String tipo;
    private String tipoMadera;
    private Integer cantidadCuerdas;
    private String color;
    private Double peso;
    private String tamaño;
    private String tipoPastillas;
    private String tipoCuerpo;
    private String tipoPuente;
    private Integer cantidadTrastes;
    private String tipoClavijas;
    private String acabado;
    private Boolean disponibilidad;
    private String origen;
    private String orientacion;

    // Constructor
    public Guitarra(Double precio, String fabricante, String modelo,
                    String tipo, String tipoMadera, Integer cantidadCuerdas,
                    String color, Double peso, String tamaño,
                    String tipoPastillas, String tipoCuerpo,
                    String tipoPuente, Integer cantidadTrastes,
                    String tipoClavijas, String acabado,
                    Boolean disponibilidad, String origen,
                    String orientacion) {

        this.precio = precio;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipo = tipo;
        this.tipoMadera = tipoMadera;
        this.cantidadCuerdas = cantidadCuerdas;
        this.color = color;
        this.peso = peso;
        this.tamaño = tamaño;
        this.tipoPastillas = tipoPastillas;
        this.tipoCuerpo = tipoCuerpo;
        this.tipoPuente = tipoPuente;
        this.cantidadTrastes = cantidadTrastes;
        this.tipoClavijas = tipoClavijas;
        this.acabado = acabado;
        this.disponibilidad = disponibilidad;
        this.origen = origen;
        this.orientacion = orientacion;
    }
}