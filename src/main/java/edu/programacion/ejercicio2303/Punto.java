package edu.programacion.ejercicio2303;

public class Punto {

    // Atributos del punto
    private Double x;
    private Double y;

    // Getter de x
    public Double getValorX() {
        return this.x;
    }

    // Setter de x
    public void setValorX(Double x) {
        this.x = x;
    }

    // Getter de y
    public Double getValorY() {
        return this.y;
    }

    // Setter de y
    public void setValorY(Double y) {
        this.y = y;
    }

    // Inicializa el punto con los valores recibidos
    public void iniciar(Double x, Double y) {
        setValorX(x);
        setValorY(y);
    }

    // Suma el mismo valor a las coordenadas x e y
    public void sumarValor(Double unValor) {

        // x = x + unValor
        setValorX(getValorX() + unValor);

        // y = y + unValor
        setValorY(getValorY() + unValor);
    }

    // Suma las coordenadas de otro punto
    public void sumarPunto(Punto unPunto) {

        // x = x + x del otro punto
        setValorX(getValorX() + unPunto.getValorX());

        // y = y + y del otro punto
        setValorY(getValorY() + unPunto.getValorY());
    }

    // Calcula la distancia entre este punto y otro punto
    public Double distanciaDe(Punto unPunto) {

        // Diferencia entre las coordenadas x
        Double dx = getValorX() - unPunto.getValorX();

        // Diferencia entre las coordenadas y
        Double dy = getValorY() - unPunto.getValorY();

        // Fórmula de Pitágoras:
        // raíz cuadrada de (dx² + dy²)
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Calcula la distancia de este punto al origen (0,0)
    public Double distanciaAlOrigen() {

        // Fórmula:
        // raíz cuadrada de (x² + y²)
        return Math.sqrt(getValorX() * getValorX() + getValorY() * getValorY());
    }

}