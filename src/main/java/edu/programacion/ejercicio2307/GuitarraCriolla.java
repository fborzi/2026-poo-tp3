package edu.programacion.ejercicio2307;

/**
 * Clase que representa una guitarra criolla dentro del modelo de instrumentos musicales.
 * 
 * Hereda de la clase abstracta Guitarra, reutilizando atributos comunes como fabricante,
 * modelo, materiales y precio, y agrega características específicas del instrumento criollo.
 * 
 * Es una especialización dentro de la jerarquía de guitarras orientada a sonidos más suaves
 * y sin necesidad de amplificación eléctrica.
 */

public class GuitarraCriolla extends Guitarra {

    private Boolean cajaDeResonancia;
    private Double anchoDeMastil;
    private Boolean sonidoSuave;

    public GuitarraCriolla() {
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
