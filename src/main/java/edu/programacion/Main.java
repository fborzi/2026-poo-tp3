package edu.programacion;

import edu.programacion.ejercicio2303.Punto;
import edu.programacion.ejercicio2304.Circulo;
import edu.programacion.ejercicio2306.Cita;
import edu.programacion.ejercicio2306.Lugar;
import edu.programacion.ejercicio2306.Persona;
import java.util.Calendar;
import java.util.Date;

public class Main {
    static void main() {

        Persona persona = new Persona(1, "gaston", "baldomir");
        Lugar lugar = new Lugar(1, "dentista");

        Calendar calendario = Calendar.getInstance();
        calendario.set(2025, Calendar.MARCH, 22);
        Date fechaCita = calendario.getTime();

        Cita cita = new Cita(persona, lugar, fechaCita, 4);

        System.out.println("La fecha de la cita es "+ cita.getFecha());
        System.out.println("Su nivel de importancia es de "+cita.getImportancia());
        System.out.println("El lugar es: "+cita.getLugar());
        System.out.println("La persona es: "+cita.getPersona() +" "+ persona.getApellido());
    }
}

