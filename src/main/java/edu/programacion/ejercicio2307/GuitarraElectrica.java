package edu.programacion.ejercicio2307;

public class GuitarraElectrica extends Guitarras {
    private Boolean circuitoElectrico;
    private Boolean potenciaVolumen;
    private int jackSalida;
    private String golpeador;
    private String platoGiratorio;

    public GuitarraElectrica(String fabricante, String modelo, int precio) {
        super(fabricante, modelo, precio);
    }

    public Boolean getCircuitoElectrico() {
        return circuitoElectrico;
    }

    public void setCircuitoElectrico(Boolean circuitoElectrico) {
        this.circuitoElectrico = circuitoElectrico;
    }

    public Boolean getPotenciaVolumen() {
        return potenciaVolumen;
    }

    public void setPotenciaVolumen(Boolean potenciaVolumen) {
        this.potenciaVolumen = potenciaVolumen;
    }

    public int getJackSalida() {
        return jackSalida;
    }

    public void setJackSalida(int jackSalida) {
        this.jackSalida = jackSalida;
    }

    public String getGolpeador() {
        return golpeador;
    }

    public void setGolpeador(String golpeador) {
        this.golpeador = golpeador;
    }

    public String getPlatoGiratorio() {
        return platoGiratorio;
    }

    public void setPlatoGiratorio(String platoGiratorio) {
        this.platoGiratorio = platoGiratorio;
    }
}
