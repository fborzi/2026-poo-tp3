package edu.programacion.ejercicio2307;

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