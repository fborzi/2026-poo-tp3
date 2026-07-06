package edu.programacion.ejercicio2307;

public class GuitarraAcustica extends Guitarras {
    private String cajaResonancia;
    private String roseta;
    private String puenteAcustico;
    private String selleta;
    private String tapaArmonica;
    private int aros;
    private Boolean refuerzosInternos;
    private String rosetaDecorativa;
    private String clavijeroTradicional;

    public GuitarraAcustica(String fabricante, String modelo, int precio) {
        super(fabricante, modelo, precio);
    }

    public String getCajaResonancia() {
        return cajaResonancia;
    }

    public void setCajaResonancia(String cajaResonancia) {
        this.cajaResonancia = cajaResonancia;
    }

    public String getRoseta() {
        return roseta;
    }

    public void setRoseta(String roseta) {
        this.roseta = roseta;
    }

    public String getPuenteAcustico() {
        return puenteAcustico;
    }

    public void setPuenteAcustico(String puenteAcustico) {
        this.puenteAcustico = puenteAcustico;
    }

    public String getSelleta() {
        return selleta;
    }

    public void setSelleta(String selleta) {
        this.selleta = selleta;
    }

    public String getTapaArmonica() {
        return tapaArmonica;
    }

    public void setTapaArmonica(String tapaArmonica) {
        this.tapaArmonica = tapaArmonica;
    }

    public int getAros() {
        return aros;
    }

    public void setAros(int aros) {
        this.aros = aros;
    }

    public Boolean getRefuerzosInternos() {
        return refuerzosInternos;
    }

    public void setRefuerzosInternos(Boolean refuerzosInternos) {
        this.refuerzosInternos = refuerzosInternos;
    }

    public String getRosetaDecorativa() {
        return rosetaDecorativa;
    }

    public void setRosetaDecorativa(String rosetaDecorativa) {
        this.rosetaDecorativa = rosetaDecorativa;
    }

    public String getClavijeroTradicional() {
        return clavijeroTradicional;
    }

    public void setClavijeroTradicional(String clavijeroTradicional) {
        this.clavijeroTradicional = clavijeroTradicional;
    }
}
