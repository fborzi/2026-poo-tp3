package edu.programacion.ejercicio2307;

public class Electrica extends Guitarra {

    private String tipoMicrofonos;
    private Integer cantidadMicrofonos;
    private String selectorPastillas;
    private Integer controlesVolumen;
    private Integer controlesTono;
    private String tipoPuente;
    private String tipoSalida;
    private String materialPartesMetalicas;

    public Electrica() {
    }

    public String getTipoMicrofonos() {
        return this.tipoMicrofonos;
    }

    public void setTipoMicrofonos(String tipoMicrofonos) {
        this.tipoMicrofonos = tipoMicrofonos;
    }

    public Integer getCantidadMicrofonos() {
        return this.cantidadMicrofonos;
    }

    public void setCantidadMicrofonos(Integer cantidadMicrofonos) {
        this.cantidadMicrofonos = cantidadMicrofonos;
    }

    public String getSelectorPastillas() {
        return this.selectorPastillas;
    }

    public void setSelectorPastillas(String selectorPastillas) {
        this.selectorPastillas = selectorPastillas;
    }

    public Integer getControlesVolumen() {
        return this.controlesVolumen;
    }

    public void setControlesVolumen(Integer controlesVolumen) {
        this.controlesVolumen = controlesVolumen;
    }

    public Integer getControlesTono() {
        return this.controlesTono;
    }

    public void setControlesTono(Integer controlesTono) {
        this.controlesTono = controlesTono;
    }

    public String getTipoPuente() {
        return this.tipoPuente;
    }

    public void setTipoPuente(String tipoPuente) {
        this.tipoPuente = tipoPuente;
    }

    public String getTipoSalida() {
        return this.tipoSalida;
    }

    public void setTipoSalida(String tipoSalida) {
        this.tipoSalida = tipoSalida;
    }

    public String getMaterialPartesMetalicas() {
        return this.materialPartesMetalicas;
    }

    public void setMaterialPartesMetalicas(String materialPartesMetalicas) {
        this.materialPartesMetalicas = materialPartesMetalicas;
    }

}
