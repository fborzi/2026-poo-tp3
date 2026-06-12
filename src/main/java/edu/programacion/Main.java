package edu.programacion;

import edu.programacion.ejercicio2301.Contador;

public class Main {

    public static void main(String[] args) {

        Contador contador = new Contador();

        System.out.println(contador.iniciar());
        System.out.println(contador.iniciar(10));

        System.out.println(contador.sumar());
        System.out.println(contador.sumar(5));

        System.out.println(contador.restar());
        System.out.println(contador.restar(2));
        System.out.println(contador.getValor());
    }
}