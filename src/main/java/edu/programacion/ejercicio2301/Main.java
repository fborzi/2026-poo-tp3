package edu.programacion.ejercicio2301;

public class Main {
    /**
     * Lo utilice para ver como funcionaba cada linea, por eso tantas impresiones
     * @param args en este caso no le doy uso al argumento de la firma del Main
     */
    public static void main(String[] args) {

        Contador contador = new Contador();
        System.out.println(contador.getValor());
        contador.sumar(10);
        System.out.println(contador.getValor());
        contador.sumar(14);
        System.out.println(contador.getValor());
        contador.restar(8);
        System.out.println(contador.getValor());
        contador.iniciar();
        System.out.println(contador.getValor());
        contador.sumar();
        System.out.println(contador.getValor());
        contador.restar();
        System.out.println(contador.getValor());
    }
}
