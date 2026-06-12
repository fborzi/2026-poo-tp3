package edu.programacion.ejercicio2301;

/**
 * Clase que modela un contador simple.
 * Permite iniciar, incrementar y decrementar
 * un valor mediante sobrecarga de métodos.
 */
public class Contador {

    private Integer valor;

    /**
     * Inicializa el contador en 0.
     *
     * @return valor actual del contador
     */
    public Integer iniciar(){
        setValor(0);
        return getValor();
    }

    /**
     * Inicializa el contador con un valor dado.
     * @param n valor inicial del contador.
     * @return valor actual del contador.
     */
    public Integer iniciar(Integer n){
        setValor(n);
        return getValor();
    }

    /**
     * Incrementa el contador en una unidad.
     *
     * @return valor actualizado del contador.
     */
    public Integer sumar(){
        setValor(getValor()+ 1);
        return getValor();
    }

    /**
     * Incrementa el contador en la cantidad indicada.
     *
     * @param n cantidad a sumar.
     * @return valor actualizado del contador.
     */
    public Integer sumar(Integer n){
        setValor(getValor () + n);
        return getValor();
    }

    /**
     * Decrementa el contador en una unidad.
     *
     * @return valor actualizado del contados.
     */
    public Integer restar(){
        setValor(getValor()- 1);
        return getValor();
    }

    /**
     * Decrementa el contador en la cantidad indicada.
     *
     * @param n cantidad a restar.
     * @return valor actualizado del contador.
     */
    public Integer restar(Integer n){
        setValor(getValor() - n);
        return getValor();
    }

    /**
     * Obtiene el valor actual del contador.
     *
     * @return valor almacenado en el contador
     */
    public Integer getValor() {
        return this.valor;
    }

    /**
     * Modifica el valor del contador.
     *
     * @param valor nuevo valor a asignar.
     */
    public void setValor(Integer valor){
        this.valor = valor;
    }
}
