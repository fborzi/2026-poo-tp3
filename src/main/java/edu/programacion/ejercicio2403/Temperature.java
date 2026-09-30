package edu.programacion.ejercicio2403;

public class Temperature {


    //Si queremos cambiar la representacion interna de la clase cambiamos celsius por Rankine y habria que cambiar todas las formulas
    private double celsius;

    public Temperature() {
        this.celsius = 0;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double value) {
        this.celsius = value;
    }

    public double getFahrenheit() {
        return (celsius * 1.8) + 32;
    }

    public double getKelvin() {
        double fahrenheit = celsius * 1.8 + 32;
        return (fahrenheit - 32) / 1.8 + 273.15;
    }

    //Aca cuando nos pasan los datos en fahrenheit o kelvin no importa, los convertimos a celsius y seguimos trabajando igual
    public void setFahrenheit(double value) {
        this.celsius = (value - 32) / 1.8;
    }
    public void setKelvin(double value) {
        double fahrenheit = (value - 273.15) * 1.8 + 32;
        this.celsius = (fahrenheit - 32) / 1.8;
    }
}
