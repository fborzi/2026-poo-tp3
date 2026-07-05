package edu.programacion.ejercicio2301;

/**
 * Representa un contador que permite incrementar,
 * decrementar e inicializar su valor.
 */
public class Contador {

    /**
     * Valor actual del contador.
     */
    private int valor;

    /**
     * Crea un contador inicializado en 0.
     */
    public Contador() {
        valor = 0;
    }

    /**
     * Inicializa el contador en 0.
     */
    public void iniciar() {
        valor = 0;
    }

    /**
     * Inicializa el contador con el valor indicado.
     *
     * @param n Valor inicial.
     */
    public void iniciar(int n) {
        valor = n;
    }

    /**
     * Incrementa el contador en una unidad.
     */
    public void sumar() {
        valor++;
    }

    /**
     * Incrementa el contador en la cantidad indicada.
     *
     * @param n Cantidad a sumar.
     */
    public void sumar(int n) {
        valor += n;
    }

    /**
     * Decrementa el contador en una unidad.
     */
    public void restar() {
        valor--;
    }

    /**
     * Decrementa el contador en la cantidad indicada.
     *
     * @param n Cantidad a restar.
     */
    public void restar(int n) {
        valor -= n;
    }

    /**
     * Devuelve el valor actual del contador.
     *
     * @return Valor del contador.
     */
    public int getValor() {
        return valor;
    }
}
