package edu.programacion;

public class Main {
    public static void main(String[] args) {

        Contador contador = new Contador();
        System.out.println("Iniciar: " + contador.iniciar());
        System.out.println("Sumar: " + contador.sumar(5));
        System.out.println("Restar: " + contador.restar(2));

        AireAcondicionado aire = new AireAcondicionado("Split", 30, 16);
        System.out.println("Subir temp: " + aire.subirTemperatura(5));
        System.out.println("Bajar temp: " + aire.bajarTemperatura(2));

        Punto centro = new Punto();
        centro.setValorX(0);
        centro.setValorY(0);

        Circulo circulo = new Circulo();
        circulo.setRadio(5.0);
        circulo.setCentro(centro);

        System.out.println("Área: " + circulo.area());            // ~78.54
        System.out.println("Ampliar: " + circulo.ampliar(3.0));    // 8.0
        System.out.println("Área nueva: " + circulo.area());       // ~201.06

        Punto nuevoCentro = circulo.trasladar(3, 4);
        System.out.println("Centro trasladado: (" + nuevoCentro.getValorX() + ", " + nuevoCentro.getValorY() + ")");
    }
}