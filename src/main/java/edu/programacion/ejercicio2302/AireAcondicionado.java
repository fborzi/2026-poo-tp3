package edu.programacion.ejercicio2302;

public class AireAcondicionado {
    private Integer tamanio;
    private Integer consumoDeEnergia;
    private Integer largoDelCable;
    private Integer temperaturaActual;
    private Integer temperaturaMax;
    private Integer temperaturaMin;
    private String modo;
    private String tipoDeEnchufe;
    private Boolean estado;
    private Boolean sensorDeTemperatura;

    public AireAcondicionado(){
        this.estado = false;
    }
    public void encender(){
        this.estado = true;
        this.temperaturaActual = 24;
    }
    public void apagar(){
        this.estado = false;
    }
    public void temperatura(Integer temperatura){
        this.temperaturaActual = temperatura;
    }
    public void subirTemperatura(Integer temperatura){
        this.temperaturaActual ++ ;
    }
    public void bajarTemperatura(Integer temperatura){
        this.temperaturaActual -- ;
    }
    public void setModo(String modo){
        this.modo = modo;
    }
}
