package edu.programacion.ejercicio2301;

/**
 * Representa un contador simple que permite iniciar, sumar y restar
 * un valor entero. Los métodos sin parámetro reutilizan la lógica de
 * los métodos sobrecargados con parámetro N, evitando repetir código.
 *
 * @author Kenya
 */
public class Contador {

    private int valor;

    /**
     * Crea un contador, inicializando su valor en 0 por defecto
     */
    public Contador() {
        this.valor = 0;
    }

    /**
     * Obtiene el valor actual del contador.
     *
     * @return el valor actual del contador
     */
    public int getValor() {
        return this.valor;
    }

    /**
     * Establece el valor del contador.
     *
     * @param valor nuevo valor del contador
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Pone en 0 el contador, reutilizando iniciar(int) con el valor 0.
     *
     * @return el valor del contador luego de iniciarlo, siempre 0
     */
    public int iniciar() {
        return iniciar(0);
    }

    /**
     * Inicia el contador en el número N indicado.
     *
     * @param n valor en el que se inicia el contador
     * @return el valor del contador luego de iniciarlo
     */
    public int iniciar(int n) {
        setValor(n);
        return getValor();
    }

    /**
     * Suma uno al valor actual del contador, reutilizando sumar(int) con el valor 1.
     *
     * @return el valor del contador luego de sumar uno
     */
    public int sumar() {
        return sumar(1);
    }

    /**
     * Suma N al valor actual del contador.
     *
     * @param n cantidad a sumar al valor actual
     * @return el valor del contador luego de sumar N
     */
    public int sumar(int n) {
        setValor(getValor() + n);
        return getValor();
    }

    /**
     * Resta uno al valor actual del contador, reutilizando restar(int) con el valor 1.
     *
     * @return el valor del contador luego de restar uno
     */
    public int restar() {
        return restar(1);
    }

    /**
     * Resta N al valor actual del contador.
     *
     * @param n cantidad a restar al valor actual
     * @return el valor del contador luego de restar N
     */
    public int restar(int n) {
        setValor(getValor() - n);
        return getValor();
    }

    /**
     * Genera una representación en texto del contador, mostrando su valor actual.
     *
     * @return una cadena con el valor actual del contador
     */
    @Override
    public String toString() {
        return "Contador: " + getValor();
    }
}