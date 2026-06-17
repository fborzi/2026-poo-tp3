package edu.programacion.ejercicio2302;

public class AireAcondicionado {

    private Integer temperatura;
    private Integer tempMaxima;
    private Integer tempMinima;
    private Boolean modoCalorActivo;
    private Boolean estaEncendido;


    public AireAcondicionado(Integer temperatura, Integer tempMaxima, Integer tempMinima, Boolean modoCalorActivo, Boolean estaEncendido) {
        this.temperatura = temperatura;
        this.tempMaxima = tempMaxima;
        this.tempMinima = tempMinima;
        this.modoCalorActivo = modoCalorActivo;
        this.estaEncendido = estaEncendido;
    }

    public Boolean encender() {
        if (getEstaEncendido() != true) {
            setEstaEncendido(true);
        }
        return getEstaEncendido();
    }
    public Boolean apagar() {
        if (getEstaEncendido() == true) {
            setEstaEncendido(false);
        }
        return getEstaEncendido();
    }

    public Boolean cambiarModo() {
        if (getModoCalorActivo() == true) {
            setModoCalorActivo(false);
        }
        else {
            setModoCalorActivo(true);
        }
        return modoCalorActivo;
    }

    public Integer subirTemp(){
        if (getTemperatura()<=getTempMaxima()) {
            setTemperatura(this.temperatura + 1);
        }
        else {
            System.out.println("No se puede sobrepasar la temperatura máxima");
        }
        return temperatura;
    }
    public Integer bajarTemp(){
        if (getTemperatura()>=getTempMinima()){
            setTemperatura(this.temperatura - 1);
        }
        else{
            System.out.println("No se puede bajar mas la temperatura");
        }
        return temperatura;
    }
    //getters y setters.
    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getTemperatura() {
        return this.temperatura;
    }

    public void setEstaEncendido(Boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public Boolean getEstaEncendido() {
        return this.estaEncendido;
    }

    public void setModoCalorActivo(Boolean modoCalorActivo) {
        this.modoCalorActivo = modoCalorActivo;
    }

    public Boolean getModoCalorActivo() {
        return this.modoCalorActivo;
    }
//Temperatura maxima y minima, no tienen metodo setter porque el valor no sera modificable.

    public Integer getTempMaxima() {
        return this.tempMaxima;
    }
    public Integer getTempMinima() {
        return this.tempMinima;
    }
}