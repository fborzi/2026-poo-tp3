package edu.programacion.ejercicio2303;

/**
 * Representa un punto en el plano cartesiano, definido por sus
 * coordenadas X e Y.
 *
 * @author Kenya
 */
public class Punto {
    private Integer x;
    private Integer y;

    /**
     * Crea un punto inicializando sus coordenadas X e Y con los valores indicados.
     * @param x Valor inicial de la coordenada X
     * @param y Valor inicial de la coordenada Y
     */
    public Punto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Este metodo suma el mismo valor a ambos (X,Y). Lo que hice fue sumar el valor guardado
     * con el valor nuevo y lo guardo dentro de set
     * @param unValor unValor es el nuevo valor que se va a sumar por igual a x e y
     */
    public void sumarValor(Integer unValor) {
        setX(getX() + unValor);
        setY(getY() + unValor);
    }

    /**
     * utitlice unPunto para atraer el valor de afuera dentro del get y lo sume al valor que yo
     * tenia en mi punto guardado
     * @param unPunto el punto cuyos valores se suman
     */
    public void sumarPunto(Punto unPunto) {
        setX(getX() + unPunto.getX());
        setY(getY() + unPunto.getY());
    }

    /**
     * calcula la distancia entre este punto y otro punto recibido como parametro
     * utiliza el teorema de pitagoras: raiz cuadrada(math.sqrt) de (x2-x1)^2 + (y2-y1)^2
     * @param unPunto el punto desde el cual se calcula la distancia
     * @return la distancia entre los dos puntos como valor decimal
     */
    public Double distanciaDe(Punto unPunto){
        return Math.sqrt(Math.pow(getX() - unPunto.getX(), 2) + Math.pow(getY() - unPunto.getY(), 2));
    }

    /**
     * calcula la distancia al origen por pitagoras entre x e y
     *  utiliza la formula debida con math.sqrt para la raiz cuadrada y math.pow para elevar al exponente
     * @return la distancia desde este punto hasta el origen (0,0) como valor decimal
     */
    public Double distanciaAlOrigen(){
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    }

    /**
     * Retorna el valor de x
     * @return x
     */
    public Integer getX() {
        return x;
    }

    /**
     * setea el nuevo valor de x
     * @param x el nuevo valor de la coordenada X
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * Retorna el valor de y
     * @return punto y
     */
    public Integer getY(){
        return y;
    }

    /**
     * Setea el nuevo valor de y
     * @param y Nuevo valor de la coordenada Y
     */
    public void setY(Integer y){
        this.y = y;
    }

    /**
     * Genera una representación en texto del punto, mostrando sus
     * coordenadas X e Y.
     *
     * @return una cadena con las coordenadas del punto
     */
    @Override
    public String toString() {
        return "Punto: (" + getX() + ", " + getY() + ")";
    }
}