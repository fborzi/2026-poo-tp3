package edu.programacion.ejercicio2307;

public class GuitarraCriolla extends Guitarras {
    private Boolean cajaDeResonancia;
    private String bocaCentral;
    private String rosetaDecorativa;
    private String puenteCriollo;
    private String construccionArtesanal;
    private String decoracionSobria;
    private String tapaArmonicaDeMadera;
    private String diapasonAncho;

    public GuitarraCriolla(String fabricante, String modelo, int precio) {
        super(fabricante, modelo, precio);
    }

    public Boolean getCajaDeResonancia() {
        return cajaDeResonancia;
    }

    public void setCajaDeResonancia(Boolean cajaDeResonancia) {
        this.cajaDeResonancia = cajaDeResonancia;
    }

    public String getBocaCentral() {
        return bocaCentral;
    }

    public void setBocaCentral(String bocaCentral) {
        this.bocaCentral = bocaCentral;
    }

    public String getRosetaDecorativa() {
        return rosetaDecorativa;
    }

    public void setRosetaDecorativa(String rosetaDecorativa) {
        this.rosetaDecorativa = rosetaDecorativa;
    }

    public String getPuenteCriollo() {
        return puenteCriollo;
    }

    public void setPuenteCriollo(String puenteCriollo) {
        this.puenteCriollo = puenteCriollo;
    }

    public String getConstruccionArtesanal() {
        return construccionArtesanal;
    }

    public void setConstruccionArtesanal(String construccionArtesanal) {
        this.construccionArtesanal = construccionArtesanal;
    }

    public String getDecoracionSobria() {
        return decoracionSobria;
    }

    public void setDecoracionSobria(String decoracionSobria) {
        this.decoracionSobria = decoracionSobria;
    }

    public String getTapaArmonicaDeMadera() {
        return tapaArmonicaDeMadera;
    }

    public void setTapaArmonicaDeMadera(String tapaArmonicaDeMadera) {
        this.tapaArmonicaDeMadera = tapaArmonicaDeMadera;
    }

    public String getDiapasonAncho() {
        return diapasonAncho;
    }

    public void setDiapasonAncho(String diapasonAncho) {
        this.diapasonAncho = diapasonAncho;
    }
}
