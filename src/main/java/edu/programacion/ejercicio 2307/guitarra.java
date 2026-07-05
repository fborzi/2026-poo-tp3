package edu.programacion;

public abstract class Guitarra {

    // Atributos
    private Double precio;
    private String fabricante;
    private String modelo;
    private String tipo;
    private String material;
    private Integer cantidadCuerdas;
    private String color;
    private Double peso;

    // Constructor vacío
    public Guitarra() {

    }

    // Constructor
    public Guitarra(Double precio,
                    String fabricante,
                    String modelo,
                    String tipo,
                    String material,
                    Integer cantidadCuerdas,
                    String color,
                    Double peso) {

        setPrecio(precio);
        setFabricante(fabricante);
        setModelo(modelo);
        setTipo(tipo);
        setMaterial(material);
        setCantidadCuerdas(cantidadCuerdas);
        setColor(color);
        setPeso(peso);

    }

    // Getters y Setters
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getCantidadCuerdas() {
        return cantidadCuerdas;
    }

    public void setCantidadCuerdas(Integer cantidadCuerdas) {
        this.cantidadCuerdas = cantidadCuerdas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    // Métodos
    public void afinar() {
        System.out.println("La guitarra fue afinada.");
    }

    public void tocar() {
        System.out.println("La guitarra está sonando.");
    }

    public void cambiarCuerdas() {
        System.out.println("Se cambiaron las cuerdas.");
    }

    public String mostrarDatos() {

        return "Fabricante: " + getFabricante()
                + "\nModelo: " + getModelo()
                + "\nColor: " + getColor()
                + "\nPrecio: $" + getPrecio();

    }

}