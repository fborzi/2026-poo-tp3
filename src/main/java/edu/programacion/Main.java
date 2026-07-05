package edu.programacion;

import edu.programacion.ejercicio2303.Punto;
import edu.programacion.ejercicio2304.Circulo;
import edu.programacion.ejercicio2306.Cita;
import edu.programacion.ejercicio2306.Lugar;
import edu.programacion.ejercicio2306.Persona;
import edu.programacion.ejercicio2307.GuitarraAcustica;
import edu.programacion.ejercicio2307.GuitarraCriolla;
import edu.programacion.ejercicio2307.GuitarraElectrica;

import java.util.Calendar;
import java.util.Date;

public class Main {
    static void main() {

        Persona persona = new Persona(1, "gaston", "baldomir");
        Lugar lugar = new Lugar(1, "dentista");

        GuitarraAcustica acustica = new GuitarraAcustica("ebano","metalicas","plasticas","ebano","Gracia","Fishh","Fishman");
        GuitarraCriolla criolla = new GuitarraCriolla("ebano","nylon","plasticas","ebano","alpujarra");
        GuitarraElectrica electrica = new GuitarraElectrica("roble","acero","metal","ebano","Fender","Fishh","Fishman","collin");
        acustica.tocar("acustica");
        criolla.tocar("criolla");
        electrica.tocar("electrica");
    }
}

