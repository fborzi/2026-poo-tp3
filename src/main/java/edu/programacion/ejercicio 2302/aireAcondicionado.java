package edu.programacion;

public class AireAcondicionado {

    private Integer temperatura;
    private String modo;
    private String marca;
    private String modelo;
    private Integer velocidad;
    private Boolean estado;

    public AireAcondicionado() {

    }

    public AireAcondicionado(String marca, String modelo, Integer velocidad) {
        setMarca(marca);
        setModelo(modelo);
        setVelocidad(velocidad);
        setTemperatura(24);
        setModo("Frío");
        setEstado(false);
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getModo() {
        return modo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Boolean encender() {
        setEstado(true);
        return getEstado();
    }

    public Boolean apagar() {
        setEstado(false);
        return getEstado();
    }

    public Integer subirTemperatura() {
        setTemperatura(getTemperatura() + 1);
        return getTemperatura();
    }

    public Integer bajarTemperatura() {
        setTemperatura(getTemperatura() - 1);
        return getTemperatura();
    }

    public String cambiarModo(String modo) {
        setModo(modo);
        return getModo();
    }
}