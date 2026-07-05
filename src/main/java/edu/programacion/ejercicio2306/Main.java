package edu.programacion.ejercicio2306;

import java.time.LocalDate;

/**
 * Clase de prueba para inicializar y verificar el funcionamiento de
 * objetos {@code Cita}, junto con sus objetos {@code Persona} y {@code Lugar} asociados.
 *
 * @author Kenya
 */
public class Main {

    /**
     * Punto de entrada del programa. Crea objetos Persona y  Lugar,
     * los utiliza para inicializar objetos Cita, y muestra sus datos por consola.
     *
     * @param args argumentos de línea de comandos, en este caso no le doy uso pero es necesario
     *              porque forma parte de la firma de Main
     */
    public static void main(String[] args){
        // Datos necesarios para la primera cita
        Persona persona1 = new Persona("Kenya", "Contreras", "En terapia por culpa de los test", 25, 1234567);
        Lugar lugar1 = new Lugar("Pto Madero", "Aire Libre", "Puente de la mujer");
        Cita cita1 = new Cita(LocalDate.of(2026, 9, 17), 5, persona1, lugar1);

        // Datos necesarios para la segunda cita
        Persona persona2 = new Persona("Franco", "Borzi", "no te perdona ni tu paz mental", 40, 7654321);
        Lugar lugar2 = new Lugar("Av. Corrientes 1234", "Café", "Café Tortoni");
        Cita cita2 = new Cita(LocalDate.of(2026, 8, 10), 3, persona2, lugar2);

        // Se muestran los objetos Cita ya inicializados
        System.out.println(cita1);
        System.out.println(cita2);
    }
}