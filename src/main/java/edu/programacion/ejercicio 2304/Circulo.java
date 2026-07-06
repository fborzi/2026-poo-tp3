public class Circulo {

    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    // Amplía el radio
    public void ampliar(double unValor) {
        radio += unValor;
    }

    // Calcula el área
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Traslada el círculo
    public void trasladar(double x, double y) {
        centro.trasladar(x, y);
    }

    public Punto getCentro() {
        return centro;
    }

    public double getRadio() {
        return radio;
    }
}