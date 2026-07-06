package edu.programacion.ejercicio2302;

import com.sun.source.doctree.SeeTree;

public class AireAcondicionado {
    private Integer temperaturaActual;
    private String marca;
    private String modelo;
    private Integer potenciaBTU;
    private Integer voltaje;
    private Boolean estado;
    private Integer temperaturaAmbiente;
    private Integer velocidadVentilador;
    private String funcionamiento;
    private String filtroAire;
    private Integer consumoEnergetico;

    public AireAcondicionado(Integer temperaturaActual, String modelo, String marca, Integer potenciaBTU,
                             Integer voltaje, Boolean estado, Integer temperaturaAmbiente, Integer consumoEnergetico,
                             Integer velocidadVentilador, String funcionamiento, String filtroAire){

        this.temperaturaActual = temperaturaActual;
        this.modelo = modelo;
        this.marca = marca;
        this.potenciaBTU = potenciaBTU;
        this.voltaje = voltaje;
        this.estado = estado;
        this.temperaturaAmbiente = temperaturaAmbiente;
        this.velocidadVentilador = velocidadVentilador;
        this.funcionamiento = funcionamiento;
        this.filtroAire = filtroAire;
        this.consumoEnergetico = consumoEnergetico;
    }

    public Boolean encender(Boolean estado) {
        this.estado = true;
        return this.estado;
    }

    public Boolean apagar(Boolean estado) {
        this.estado = false;
        return this.estado;
    }

    public void bajarTemperatura(Integer temperaturaActual) {
        this.temperaturaActual--;
    }

    public void subirTemperatura(Integer temperaturaActual) {
        this.temperaturaActual++;
    }

    public void ajustarVentilador(Integer velocidadVentilador) {
        this.velocidadVentilador = velocidadVentilador;
    }

    public Boolean consultarEstado(Boolean estado) {
        return this.estado;
    }

    public void limpiarFiltro(String filtroAire) {
        this.filtroAire = "Limpio";
    }

    public void mostratDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia BTU: " + potenciaBTU);
        System.out.println("Voltaje: " + voltaje);
        System.out.println("Estado: " + estado);
        System.out.println("Temperatura actual: " + temperaturaActual);
        System.out.println("Temperatura ambiente: " + temperaturaAmbiente);
        System.out.println("Funcionamiento: " + funcionamiento);
        System.out.println("Velocidad del ventilador: " + velocidadVentilador);
        System.out.println("Filtro de aire: " + filtroAire);
        System.out.println("Consumo energético: " + consumoEnergetico);
    }

    public Integer getTemperaturaActual() {
        return temperaturaActual;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getPotenciaBTU() {
        return potenciaBTU;
    }

    public Integer getVoltaje() {
        return voltaje;
    }

    public Boolean getEstado() {
        return estado;
    }

    public  Integer getTemperaturaAmbiente() {
        return temperaturaAmbiente;
    }

    public Integer getVelocidadVentilador() {
        return velocidadVentilador;
    }

    public String getFuncionamiento() {
        return funcionamiento;
    }

    public String getFiltroAire() {
        return filtroAire;
    }

    public Integer getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setTemperaturaActual(Integer temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotenciaBTU(Integer potenciaBTU) {
        this.potenciaBTU = potenciaBTU;
    }

    public void setVoltaje(Integer voltaje) {
        this.voltaje = voltaje;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setTemperaturaAmbiente(Integer temperaturaAmbiente) {
        this.temperaturaAmbiente = temperaturaAmbiente;
    }

    public void setVelocidadVentilador(Integer velocidadVentilador) {
        this.velocidadVentilador = velocidadVentilador;
    }

    public void setFuncionamiento(String funcionamiento) {
        this.funcionamiento = funcionamiento;
    }

    public void setFiltroAire(String filtroAire) {
        this.filtroAire = filtroAire;
    }

    public void setConsumoEnergetico(Integer consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
}
