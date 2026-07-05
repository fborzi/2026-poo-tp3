package edu.programacion.ejercicio2301;

        public class Main {
            public static void main(String[] args) {
                Contador contador = new Contador();

                System.out.println("Iniciar en 0: " + contador.iniciar());

                System.out.println("Sumar 1: " + contador.sumar());

                System.out.println("Sumar 5: " + contador.sumar(5));

                System.out.println("Restar 1: " + contador.restar());

                System.out.println("Restar 2: " + contador.restar(2));

                System.out.println("Iniciar en 10: " + contador.iniciar(10));
            }
        }



