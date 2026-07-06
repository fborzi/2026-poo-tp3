package edu.programacion.ejercicio2304;
import edu.programacion.ejercicio2303.Punto;

public class Circulo {
    //atributo
   private Punto centro;
   private double radio;
    /**
     *Constructor
     * @param centro
     * @param radio
     */
   public Circulo(Punto centro, double radio) {
       this.centro = centro;
       this.radio = radio;
   }
    /**
     *
     * @param unValor
     */
   public void ampliar(Integer unValor){
       getCentro().setValorY(getCentro().getValorY() + unValor);
       getCentro().setValorX(getCentro().getValorX() + unValor);
       return;
   }
    /**
     *
     * @return
     */
   public double area(){
       return Math.PI + Math.pow(getRadio(), 2);
   }
    /**
     *
     * @param unPunto
     */
   public void trasladar(Punto unPunto) {
       getCentro().setValorX(getCentro().getValorX()+unPunto.getValorX());
       getCentro().setValorY(getCentro().getValorY()+unPunto.getValorY());
       return;
   }
    /**
     *
     * @return
     */
   public Punto getCentro() {
       return centro;
   }
    /**
     *
     * @param centro
     */
   public void setCentro(Punto centro) {
       this.centro = centro;
   }
    /**
     *
     * @return
     */
   public Double getRadio() {
       return radio;
   }
    /**
     *
     * @param radio
     */
   public void setRadio(double radio) {
      this.radio = radio;
   }
}