package edu.programacion.ejercicio2306;

import java.time.LocalDate;

/**
 * Representa una cita agendada, compuesta por una fecha, un nivel de importancia,
 * una persona de contacto y un lugar de encuentro. Agrega objetos de tipo
 * Persona y  Lugar como parte de su estado.
 *
 * @author Kenya
 */
public class Cita {

    private Persona contacto;
    private LocalDate fecha;
    private Lugar lugar;
    private Integer importancia;

    /**
     * Constructor
     * Crea una cita con la fecha, importancia, contacto y lugar indicados.
     *
     * @param fecha fecha en la que se realizará la cita
     * @param importancia nivel de importancia de la cita, debe estar entre 1 y 5
     * @param contacto persona con la que se realiza la cita
     * @param lugar lugar donde se llevará a cabo la cita
     */
    public Cita(LocalDate fecha, Integer importancia, Persona contacto, Lugar lugar) {
        this.fecha = fecha;
        this.importancia = importancia;
        this.contacto = contacto;
        this.lugar = lugar;
    }

    /**
     * Reprograma la cita asignando una nueva fecha y un nuevo lugar.
     *
     * @param nuevaFecha nueva fecha para la cita
     * @param nuevoLugar nuevo lugar donde se realizará la cita
     */
    public void reprogramarCita(LocalDate nuevaFecha, Lugar nuevoLugar) {
        setFecha(nuevaFecha);
        setLugar(nuevoLugar);
    }

    /**
     * Aumenta la importancia actual de la cita sumándole el valor indicado.
     * El nuevo valor solo se aplica si queda dentro del rango permitido (1 a 5),
     * ya que internamente utiliza {@code setImportancia} para validarlo.
     * pero si no pertenece al rango no se modifica el valor y nada mas
     *
     * @param num cantidad a sumar a la importancia actual
     */
    public void aumentarImportancia(Integer num){
        setImportancia(getImportancia() + num);
    }

    /**
     * Obtiene la persona de contacto de la cita.
     *
     * @return la persona asociada a la cita
     */
    public Persona getContacto() {
        return contacto;
    }

    /**
     * Establece la persona de contacto de la cita.
     *
     * @param contacto nueva persona asociada a la cita
     */
    public void setContacto(Persona contacto) {
        this.contacto = contacto;
    }

    /**
     * Obtiene la fecha de la cita.
     *
     * @return la fecha en la que se realizará la cita
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la cita.
     *
     * @param fecha nueva fecha para la cita
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el lugar donde se realizará la cita.
     *
     * @return el lugar asociado a la cita
     */
    public Lugar getLugar() {
        return lugar;
    }

    /**
     * Establece el lugar donde se realizará la cita.
     *
     * @param lugar nuevo lugar para la cita
     */
    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    /**
     * Obtiene el nivel de importancia de la cita.
     *
     * @return la importancia de la cita, un valor entre 1 y 5
     */
    public Integer getImportancia() {
        return importancia;
    }

    /**
     * Establece el nivel de importancia de la cita. El valor solo se asigna
     * si está comprendido entre 1 y 5 (inclusive); en caso contrario, la
     * importancia actual no se modifica.
     *
     * @param num nuevo valor de importancia, debe estar entre 1 y 5
     */
    public void setImportancia(Integer num) {
        if (num >= 1 && num <= 5)
            this.importancia = num;
    }

    /**
     * Genera una representación en texto de la cita, incluyendo su fecha,
     * importancia, lugar y contacto asociado.
     *
     * @return una cadena con los datos principales de la cita
     */
    @Override
    public String toString() {
        return "Cita: " + getFecha() + ", " + getImportancia() + ", " + getLugar() + ", " + getContacto();
    }
}