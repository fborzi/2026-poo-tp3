package edu.programacion.ejercicio2307;

public abstract class Guitarra {
    private String madera;
    private String cuerdas;
    private String clavijas;
    private String maderaDiapason;
    private String marca;

    public Guitarra(String madera,String cuerdas,String clavijas,String maderaDiapason,String marca){
        this.madera=madera;
        this.cuerdas=cuerdas;
        this.clavijas=clavijas;
        this.maderaDiapason=maderaDiapason;
        this.marca=marca;
    }
    public void setMadera(String madera) {
        this.madera = madera;
    }

    public void setClavijas(String clavijas) {
        this.clavijas =clavijas;
    }
    public void setCuerdas(String cuerdas) {
        this.cuerdas =cuerdas;
    }
    public void setMaderaDiapason(String maderaDiapason) {
        this.maderaDiapason =maderaDiapason;
    }
    public void setMarca(String marca) {
        this.marca =marca;
    }
    public String getMadera() {
        return this.madera;
    }
    public String getClavijas() {
        return this.clavijas;
    }
    public String getMarca() {
        return this.marca;
    }
    public String getCuerdas() {
        return this.cuerdas;
    }
    public String getMaderaDiapason() {
        return this.maderaDiapason;
    }

    public abstract void tocar(String sonido);
}
