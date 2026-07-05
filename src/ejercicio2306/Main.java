package edu.programacion.ejercicio2306;

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Juan Pérez", "1122334455");
        Lugar l1 = new Lugar("Oficina Central", "Av. Siempre Viva 123");

        Cita c1 = new Cita("2026-07-10 15:00", p1, l1, 5);

        System.out.println("=== CITA ===");
        c1.mostrar();

        Persona p2 = new Persona("María López", "99887766");
        Lugar l2 = new Lugar("Cafetería", "San Martín 456");

        Cita c2 = new Cita("2026-07-12 10:30", p2, l2, 3);

        System.out.println("\n=== OTRA CITA ===");
        c2.mostrar();
    }
}