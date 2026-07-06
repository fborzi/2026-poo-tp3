public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void sumarValor(double unValor) {
        x += unValor;
        y += unValor;
    }

    public void sumarPunto(Punto unPunto) {
        x += unPunto.x;
        y += unPunto.y;
    }

    public double distanciaDe(Punto unPunto) {
        double dx = unPunto.x - x;
        double dy = unPunto.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distanciaAlOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    public double getX() {
        return x;
    }