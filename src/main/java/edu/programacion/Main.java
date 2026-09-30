package edu.programacion;


import edu.programacion.ejercicio2403.Temperature;


public class Main {
    public static void main(String[] args) {
         // Constructor
        Temperature temperatura = new Temperature();
        // Le ponemos valor 30 grados Celsius
        temperatura.setCelsius(30);
        //Mostramos que valor tiene Celsius
        System.out.println("Celsius: " + temperatura.getCelsius());
        //Mostramos que valor tiene en kelvin
        System.out.println("kelvin: " + temperatura.getKelvin());
        //Mostramos que valor tiene en Fahrenheit
        System.out.println("Fahrenheit: " + temperatura.getFahrenheit());

        // Le ponemos valor 90 grados Fahrenheit
        temperatura.setFahrenheit(90);
        //Mostramos que valor tiene en kelvin
        System.out.println("kelvin: " + temperatura.getKelvin());




    }
}