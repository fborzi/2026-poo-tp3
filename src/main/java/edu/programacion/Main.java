package edu.programacion;

import edu.programacion.ejercicio2301.Contador;
import edu.programacion.ejercicio2302.AireAcondicionado;
import edu.programacion.ejercicio2303.Punto;
import edu.programacion.ejercicio2304.Circulo;
import edu.programacion.ejercicio2306.Cita;
import edu.programacion.ejercicio2306.Lugar;
import edu.programacion.ejercicio2306.Persona;

import java.time.LocalDate;

public class Main {
    static void main() {
        Contador contador = new Contador();
        AireAcondicionado aireAcondicionado = new AireAcondicionado();
        Punto punto = new Punto(0.0, 0.0);
        Circulo circulo = new Circulo(punto, 10.0);
        Cita cita = new Cita(
                LocalDate.now(),
                Persona,
                Lugar,
                5);
        Persona persona = new Persona("Lautaro", "245777524", "klautaro@gmail.com");
        Lugar lugar = new Lugar(    "Cafetería",
                "Av. Siempre Viva 123",
                "Buenos Aires",
                1000);


    }
}

