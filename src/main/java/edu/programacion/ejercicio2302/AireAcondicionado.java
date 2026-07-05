package edu.programacion.ejercicio2302;

/**
 * Representa un aire acondicionado con temperatura seteada, temperatura
 * ambiente, modo de funcionamiento y dirección de paleta, dentro de un
 * rango de temperatura mínima y máxima predeterminado.
 *
 * @author Kenya
 */
public class AireAcondicionado {

    private Boolean estaEncendido ;
    private Integer temperaturaSeteada ;
    private Integer temperaturaAmbiente ;
    private Modo modo ;
    private String direccionPaleta ;
    private Integer temperaturaMinima ;
    private Integer temperaturaMaxima ;

    /**
     * Crea un aire acondicionado apagado por defecto, con la temperatura
     * mínima y máxima predeterminadas (16 y 30 grados respectivamente).
     * No se utilizan setters para estos límites porque son valores fijos
     * de fábrica.
     */
    public AireAcondicionado() {
        this.estaEncendido = false;
        this.temperaturaMaxima = 30;
        this.temperaturaMinima = 16;
    }

    /**
     * Alterna el estado de encendido del aire acondicionado: si está
     * encendido lo apaga, y si está apagado lo enciende, invirtiendo
     * el valor actual mediante el operador de negación (!).
     */
    public void presionarBotonEncender() {
        setEstaEncendido(!getEstaEncendido());
    }

    /**
     * Sube en un grado la temperatura seteada, siempre y cuando el
     * valor resultante no supere la temperatura máxima permitida.
     */
    public void subirTemperatura() {
        if (getTemperaturaSeteada() < getTemperaturaMaxima()) {
            setTemperaturaSeteada(getTemperaturaSeteada() + 1 );
        }
    }

    /**
     * verifica que la temperatura seteada sea mayor a la minima
     * si se cumple la condicion baja un grado la temperatura seteada
     */
    public void bajarTemperatura() {
        if (getTemperaturaSeteada() > getTemperaturaMinima()) {
            setTemperaturaSeteada(getTemperaturaSeteada() - 1 );
        }
    }

    /**
     * retorna el estado de encendido del aire acondicionado
     * @return true si esta encendido y false si esta apagado
     */
    public Boolean getEstaEncendido() {
        return estaEncendido;
    }

    /**
     * verifica si la direccion de la paleta es arriba o abajo
     * dependiendo del valor actual setea la direccion inversa
     */
    public void movimientoPaleta() {
        if (getDireccionPaleta().equals("arriba"))
            setDireccionPaleta("abajo");
        else
            setDireccionPaleta("arriba");
    }

    /**
     * este metodo recibe un parametro de tipo Modo que representa el nuevo modo a aplicar
     * setea el modo actual del aire acondicionado con el nuevo modo recibido
     * @param nuevoModo el nuevo modo a setear, puede ser frio, calor, automatico o ventilador
     */
    public void cambiarModo(Modo nuevoModo) {
        setModo(nuevoModo);
    }

    /**
     * modifica el estado de encendido del aire acondicionado
     * @param estaEncendido nuevo estado
     */
    public void setEstaEncendido(Boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    /**
     * retorna el valor actual de la temperatura del aire acondicionado
     * @return valor en grados
     */
    public Integer getTemperaturaSeteada() {
        return temperaturaSeteada;
    }

    /**
     * modifica la temperatura seteada del aire acondicionado
     * @param temperaturaSeteada
     */
    public void setTemperaturaSeteada(Integer temperaturaSeteada) {
        this.temperaturaSeteada = temperaturaSeteada;
    }

    /**
     * retorna el valor del sensor actualizado a la temperatura ambiente actual
     * @return valor del sensor
     */
    public Integer getTemperaturaAmbiente() {
        return temperaturaAmbiente;
    }

    /**
     * actualiza la temperatura ambiente que marca el sensor en el momento
     * @param temperaturaAmbiente guarda la nueva temperatura
     */
    public void setTemperaturaAmbiente(Integer temperaturaAmbiente) {
        this.temperaturaAmbiente = temperaturaAmbiente;
    }

    /**
     * Retorna el modo seleccionado por el usuario
     * @return el modo sea frio, calor, automatico, ventilador
     */
    public Modo getModo() {
        return modo;
    }

    /**
     * Actualiza el modo seteado
     * @param modo aqui se guarda el nuevo modo a setear, frio calor, automatico, ventilzador
     */
    public void setModo(Modo modo) {
        this.modo = modo;
    }

    /**
     * Retorna el nuevo valor de la direccion de la paleta del aire
     * @return el valor retornado puede ser arriba, abajo
     */
    public String getDireccionPaleta() {
        return direccionPaleta;
    }

    /**
     * Actualiza la direccion de la paleta
     * @param direccionPaleta
     */
    public void setDireccionPaleta(String direccionPaleta) {
        this.direccionPaleta = direccionPaleta;
    }

    /**
     *  Solo posee getter porque es un valor ya establecido por defecto
     * @return retorna el valor minimo que es 16
     */
    public Integer getTemperaturaMinima() {
        return temperaturaMinima;
    }

    /**
     * Solo posee getter porque es un valor ya establecido por defecto
     * @return retorna el valor maximo que es 30
     */
    public Integer getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    /**
     * Genera una representación en texto del aire acondicionado, incluyendo
     * su estado de encendido, temperatura seteada, temperatura ambiente y modo.
     * @return una cadena con los datos principales del aire acondicionado
     */
    @Override
    public String toString() {
        return "AireAcondicionado: encendido=" + getEstaEncendido()
                + ", temperaturaSeteada=" + getTemperaturaSeteada()
                + ", temperaturaAmbiente=" + getTemperaturaAmbiente()
                + ", modo=" + getModo();
    }
}
