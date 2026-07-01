package edu.programacion.ejercicio2301;

/**
 * Se modela un contador que permite iniciar, incrementar y decrementar
 * su valor mediante métodos sobrecargados.
 *
 * Los métodos iniciar, sumar y restar poseen versiones con y sin
 * parámetros, favoreciendo el reuso de código al permitir realizar
 * operaciones similares con una cantidad específica o con valores
 * predeterminados.
 */

public class Contador {

    private Integer valor;

    public Integer getValor() {
        return this.valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer iniciar() {
        setValor(0);
        return getValor();
    }

    public Integer iniciar(Integer n) {
        setValor(n);
        return getValor();
    }

    public Integer sumar() {
        setValor(getValor() + 1);
        return getValor();
    }

    public Integer sumar(Integer n) {
        setValor(getValor() + n);
        return getValor();
    }

    public Integer restar() {
        setValor(getValor() - 1);
        return getValor();
    }

    public Integer restar(Integer n) {
        setValor(getValor() - n);
        return getValor();
    }
}
