package edu.programacion.ejercicio2307;

public class GuitarraClasica extends Guitarras{
    private String bocaCentral;
    private String clavijeroAbierto;
    private String diapasonAncho;
    private int cuerdasNylon;

    public GuitarraClasica(String fabricante, String modelo, int precio) {

        super(fabricante, modelo, precio);
    }

    public String getBocaCentral() {
        return bocaCentral;
    }

    public void setBocaCentral(String bocaCentral) {

        this.bocaCentral = bocaCentral;
    }

    public String getClavijeroAbierto() {
        return clavijeroAbierto;
    }

    public void setClavijeroAbierto(String clavijeroAbierto) {
        this.clavijeroAbierto = clavijeroAbierto;
    }

    public String getDiapasonAncho() {
        return diapasonAncho;
    }

    public void setDiapasonAncho(String diapasonAncho) {
        this.diapasonAncho = diapasonAncho;
    }

    public int getCuerdasNylon() {
        return cuerdasNylon;
    }

    public void setCuerdasNylon(int cuerdasNylon) {
        this.cuerdasNylon = cuerdasNylon;
    }
}
