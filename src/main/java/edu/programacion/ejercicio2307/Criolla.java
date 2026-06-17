package edu.programacion.ejercicio2307;

public class Criolla extends Guitarra {

    private Boolean cajaDeResonancia;
    private Double anchoDeMastil;
    private Boolean sonidoSuave;

    public Criolla() {
    }

    public Boolean getCajaDeResonancia() {
        return this.cajaDeResonancia;
    }

    public void setCajaDeResonancia(Boolean cajaDeResonancia) {
        this.cajaDeResonancia = cajaDeResonancia;
    }

    public Double getAnchoDeMastil() {
        return this.anchoDeMastil;
    }

    public void setAnchoDeMastil(Double anchoDeMastil) {
        this.anchoDeMastil = anchoDeMastil;
    }

    public Boolean getSonidoSuave() {
        return this.sonidoSuave;
    }

    public void setSonidoSuave(Boolean sonidoSuave) {
        this.sonidoSuave = sonidoSuave;
    }

}