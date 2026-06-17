package edu.programacion.ejercicio2303;

public class Punto {

    // Atributos del punto
    private Double x;
    private Double y;

    // Getter de x
    public Double getX() {
        return this.x;
    }

    // Setter de x
    public void setX(Double x) {
        this.x = x;
    }

    // Getter de y
    public Double getY() {
        return this.y;
    }

    // Setter de y
    public void setY(Double y) {
        this.y = y;
    }

    // Inicializa el punto con los valores recibidos
    public void iniciar(Double x, Double y) {
        setX(x);
        setY(y);
    }

    // Suma el mismo valor a las coordenadas x e y
    public void sumarValor(Double unValor) {

        // x = x + unValor
        setX(getX() + unValor);

        // y = y + unValor
        setY(getY() + unValor);
    }

    // Suma las coordenadas de otro punto
    public void sumarPunto(Punto unPunto) {

        // x = x + x del otro punto
        setX(getX() + unPunto.getX());

        // y = y + y del otro punto
        setY(getY() + unPunto.getY());
    }

    // Calcula la distancia entre este punto y otro punto
    public Double distanciaDe(Punto unPunto) {

        // Diferencia entre las coordenadas x
        Double dx = getX() - unPunto.getX();

        // Diferencia entre las coordenadas y
        Double dy = getY() - unPunto.getY();

        // Fórmula de Pitágoras:
        // raíz cuadrada de (dx² + dy²)
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Calcula la distancia de este punto al origen (0,0)
    public Double distanciaAlOrigen() {

        // Fórmula:
        // raíz cuadrada de (x² + y²)
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

}