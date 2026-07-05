package edu.programacion.ejercicio2302;

/**
 * Representa un aire acondicionado.
 */
public class AireAcondicionado {

    /**
     * Temperatura configurada.
     */
    private int temperatura;

    /**
     * Indica si el aire está encendido.
     */
    private boolean encendido;

    /**
     * Modo de funcionamiento.
     */
    private String modo;

    /**
     * Velocidad del ventilador.
     */
    private int velocidad;

    /**
     * Crea un aire acondicionado apagado.
     */
    public AireAcondicionado() {
        temperatura = 24;
        encendido = false;
        modo = "Frío";
        velocidad = 1;
    }

    /**
     * Enciende el aire acondicionado.
     */
    public void encender() {
        encendido = true;
    }

    /**
     * Apaga el aire acondicionado.
     */
    public void apagar() {
        encendido = false;
    }

    /**
     * Aumenta la temperatura en un grado.
     */
    public void subirTemperatura() {
        temperatura++;
    }

    /**
     * Disminuye la temperatura en un grado.
     */
    public void bajarTemperatura() {
        temperatura--;
    }

    /**
     * Cambia el modo de funcionamiento.
     *
     * @param modo Nuevo modo.
     */
    public void cambiarModo(String modo) {
        this.modo = modo;
    }

    /**
     * Cambia la velocidad del ventilador.
     *
     * @param velocidad Nueva velocidad.
     */
    public void cambiarVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Devuelve la temperatura configurada.
     *
     * @return temperatura.
     */
    public int getTemperatura() {
        return temperatura;
    }

    /**
     * Devuelve si el aire está encendido.
     *
     * @return true si está encendido.
     */
    public boolean isEncendido() {
        return encendido;
    }

    /**
     * Devuelve el modo de funcionamiento.
     *
     * @return modo.
     */
    public String getModo() {
        return modo;
    }

    /**
     * Devuelve la velocidad del ventilador.
     *
     * @return velocidad.
     */
    public int getVelocidad() {
        return velocidad;
    }
}
