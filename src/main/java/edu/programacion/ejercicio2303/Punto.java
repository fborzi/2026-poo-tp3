package edu.programacion.ejercicio2303;

public class Punto {
    // Atributos
    private Double valorX;
    private Double valorY;
    /** constructor
     *
     * @param valorY
     * @param valorX
     */
    public Punto(Double valorY, Double valorX) {
        this.valorY = valorY;
        this.valorX = valorX;
    }

    /**
     *
     * @param unValor
     * @return
     */
    public Double sumarValor(Double unValor) {
        setValorY(getValorY() +unValor);
        setValorX(getValorX() +unValor);
        return getValorX() + getValorY();
    }
    /**
     *
     * @param unPunto
     * @return
     */
    public Punto sumarPunto(Punto unPunto) {
        Double unPuntoValorX = unPunto.getValorX();
        Double unPuntoValory = unPunto.getValorY();
        setValorX(getValorX()+unPuntoValorX);
        setValorY(getValorY()+unPuntoValory);
        return this;
    }

    /**
     *
     * @param unPunto
     * @return
     */
    public Punto dintanciaDe(Punto unPunto){
        Double unPuntoValorX = unPunto.getValorX();
        Double unPuntoValorY = unPunto.getValorY();
        Double d = Math.sqrt(Math.pow(getValorX()+unPuntoValorX,2)+Math.pow(getValorY()+unPuntoValorY,2));
        return this;
    }

    /**
     *
     * @return
     */
    public Punto distanciaAlOrigen(){
        Double d = Math.sqrt(Math.pow(getValorX(),2)+Math.pow(getValorY(),2));
        return this;
    }

    /**
     *
     * @return
     */
    public Double getValorX(){
        return valorX;
    }
    public void setValorX(Double valorX){
        this.valorX = valorX;
    }
    public Double getValorY(){
        return valorY;
    }
    public void setValorY(Double valorY){
        this.valorY = valorY;
    }
   }