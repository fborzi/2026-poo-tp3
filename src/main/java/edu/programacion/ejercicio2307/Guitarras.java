package edu.programacion.ejercicio2307;

public  abstract class Guitarras {
    protected String fabricante;
    protected String modelo;
    protected int precio;
    protected String tipoMadera;
    protected String color;
    protected int dimension;
    protected int numeroDeCuerdas;
    protected String maderaDelMastil;
    protected String acabado;
    protected String accesorios;

    public Guitarras(String fabricante, String modelo, int precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;

    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getNumeroDeCuerdas() {
        return numeroDeCuerdas;
    }

    public void setNumeroDeCuerdas(int numeroDeCuerdas) {
        this.numeroDeCuerdas = numeroDeCuerdas;
    }

    public String getMaderaDelMastil() {
        return maderaDelMastil;
    }

    public void setMaderaDelMastil(String maderaDelMastil) {
        this.maderaDelMastil = maderaDelMastil;
    }

    public String getAcabado() {
        return acabado;
    }

    public void setAcabado(String acabado) {
        this.acabado = acabado;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
