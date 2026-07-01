package edu.programacion.ejercicio2307;

/**
 * Clase que representa una guitarra acústica.
 * Hereda de la clase abstracta Guitarra.
 * 
 * Este tipo de guitarra no requiere amplificador para sonar,
 * ya que utiliza caja de resonancia.
 * Esta clase hereda de la clase abstracta Guitarra, reutilizando atributos comunes como
 * precio, fabricante, modelo y materiales, y agrega características propias del instrumento
 * acústico.
 * 
 * Es una especialización concreta dentro de la jerarquía de guitarras.
 */

public class GuitarraAcustica extends Guitarra {

    private Boolean cajaResonancia;
    private Double tamanoCaja;
    private String formaCuerpo;

    public GuitarraAcustica() {
    }

    public Boolean getCajaResonancia() {
        return this.cajaResonancia;
    }

    public void setCajaResonancia(Boolean cajaResonancia) {
        this.cajaResonancia = cajaResonancia;
    }

    public Double getTamanoCaja() {
        return this.tamanoCaja;
    }

    public void setTamanoCaja(Double tamanoCaja) {
        this.tamanoCaja = tamanoCaja;
    }

    public String getFormaCuerpo() {
        return this.formaCuerpo;
    }

    public void setFormaCuerpo(String formaCuerpo) {
        this.formaCuerpo = formaCuerpo;
    }

}
