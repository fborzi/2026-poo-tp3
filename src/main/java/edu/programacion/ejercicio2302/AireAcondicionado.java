package edu.programacion.ejercicio2302;

public class AireAcondicionado {
    // atributos
    private String marca;
    private String modelo;
    private String color;
    private String modo;
    private Integer temperatura;
    private Integer temperaturaMaxima;
    private Integer temperaturaMinima;
    private Double potencia;
    private Integer modoFan;
    private Boolean tieneDisplay;
    private Boolean estaEncendido;

    /**
     *
     */
    public AireAcondicionado() {
        this.estaEncendido = false;
        this.temperaturaMaxima = 31;
        this.temperaturaMinima = 16;
    }

    /**
     *
     * @return
     */
    public Boolean prender(){
        setEstaEncendido(true);
        return getEstaEncendido();
    }

    /**
     *
     * @return
     */
    public Boolean apagar(){
        setEstaEncendido(false);
        return getEstaEncendido();
    }

    /**
     *
     * @param temperatura
     * @return
     */
    public Integer subirTemperatura(Integer temperatura) {
        if (getEstaEncendido() == true) {
            if (getTemperatura() < getTemperaturaMaxima() && getTemperatura() > getTemperaturaMinima()) {
                setTemperatura(getTemperatura()+1);
            }
        }
        return getTemperatura();
    }

    /**
     *
     * @param temperatura
     * @return
     */
    public Integer bajarTemperatura(Integer temperatura) {
        if (getEstaEncendido() == true) {
            if (getTemperatura() < getTemperaturaMaxima() && getTemperatura() > getTemperaturaMinima()) {
                setTemperatura(getTemperatura()-1);
            }
        }
        return getTemperatura();
    }

    /**
     * Obtengo estado del dispositivo a controlar
     * @return
     */
    public Boolean getEstaEncendido(){
        return estaEncendido;
    }
    /**
     *
     *   Modifico estado del dispositivo a controlar
     * @param estaEncendido
     */
    public void setEstaEncendido(Boolean estaEncendido){
        this.estaEncendido = estaEncendido;
    }

    /**
     *
     * @return
     */

    public Integer getmodoFan(){
        return modoFan;
    }

    /**
     *
     * @param modoFan
     */
    public void setModoFan(Integer modoFan){
        this.modoFan = modoFan;
    }

    /**
     *
     * @return
     */
    public Integer getTemperatura(){
        return temperatura;
    }

    /**
     *
     * @param temperatura
     */
    public void setTemperatura(Integer temperatura){
        this.temperatura = temperatura;
    }

    /**
     *
     * @return
     */
    public Integer getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    /**
     *
     * @return
     */
    public Integer getTemperaturaMinima() {
        return temperaturaMinima;
    }
}
