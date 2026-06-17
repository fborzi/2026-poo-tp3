package edu.programacion.ejercicio2301;

import edu.programacion.ejercicio2302.AireAcondicionado;
import edu.programacion.ejercicio2303.Punto;
import edu.programacion.ejercicio2304.Circulo;
import edu.programacion.ejercicio2306.Cita;
import edu.programacion.ejercicio2306.Lugar;
import edu.programacion.ejercicio2306.Persona;
import edu.programacion.ejercicio2307.GuitarraAcustica;
import edu.programacion.ejercicio2307.GuitarraCriolla;
import edu.programacion.ejercicio2307.GuitarraElectrica;

public class Main {

    public static void main(String[] args) {

        Contador contador = new Contador();

        System.out.println("Iniciar en 0: " + contador.iniciar());

        System.out.println("Sumar 1: " + contador.sumar());

        System.out.println("Sumar 5: " + contador.sumar(5));

        System.out.println("Restar 1: " + contador.restar());

        System.out.println("Restar 2: " + contador.restar(2));

        System.out.println("Iniciar en 10: " + contador.iniciar(10));

        System.out.println("Valor actual: " + contador.getValor());

        System.out.println("============================================");

        AireAcondicionado aire = new AireAcondicionado();

        aire.setMarca("Samsung");
        aire.setModelo("AR24");

        aire.setTemperaturaMinima(16.0);
        aire.setTemperaturaMaxima(30.0);
        aire.setTemperaturaActual(24.0);

        aire.encender();

        aire.cambiarModo("Frío");
        aire.cambiarVelocidadVentilador("Alta");
        aire.activarTimer();

        System.out.println("Marca: " + aire.getMarca());
        System.out.println("Modelo: " + aire.getModelo());
        System.out.println("Modo: " + aire.getModo());
        System.out.println("Velocidad ventilador: " + aire.getVelocidadVentilador());
        System.out.println("Timer: " + aire.getTimer());

        aire.subirTemperatura();

        System.out.println("Temperatura actual: " + aire.getTemperaturaActual());

        aire.cambiarModo("Calor");

        System.out.println("Nuevo modo: " + aire.getModo());

        System.out.println("============================================");

    Punto p1 = new Punto();
        p1.iniciar(3.0, 4.0);

    // Crear segundo punto
    Punto p2 = new Punto();
        p2.iniciar(6.0, 8.0);

    // Mostrar distancia al origen
        System.out.println("Distancia al origen: " + p1.distanciaAlOrigen());

    // Mostrar distancia entre puntos
        System.out.println("Distancia entre puntos: " + p1.distanciaDe(p2));

    // Sumar 2 a x e y
        p1.sumarValor(2.0);

        System.out.println(
                "P1 luego de sumarValor: (" +
                p1.getValorX() + ", " +
                p1.getValorY() + ")"
                );

    // Sumar las coordenadas de p2 a p1
        p1.sumarPunto(p2);

        System.out.println(
                "P1 luego de sumarPunto: (" +
                p1.getValorX() + ", " +
                p1.getValorY() + ")"
                );
        System.out.println("============================================");

        Punto centro = new Punto();
        centro.iniciar(3.0, 4.0);

        Circulo circulo = new Circulo();
        circulo.iniciar(centro, 5.0);

        System.out.println("Radio: " + circulo.getRadio());

        System.out.println("Area: " + circulo.area());

        circulo.ampliar(2.0);

        System.out.println("Nuevo radio: " + circulo.getRadio());

        circulo.trasladar(1.0, 2.0);

        System.out.println(
                "Nuevo centro: (" +
                        circulo.getCentro().getValorX() +
                        ", " +
                        circulo.getCentro().getValorY() +
                        ")"
        );
        System.out.println("============================================");

        Persona persona = new Persona();
        persona.setNombre("Sofia Bolmeni");
        persona.setTelefono("02475-414016");

        Lugar lugar = new Lugar();
        lugar.setNombre("Cafeteria Centro");
        lugar.setDireccion("Av. Principal 123");

        Cita cita = new Cita();
        cita.setFecha("15/06/2026");
        cita.setImportancia(4);
        cita.setContacto(persona);
        cita.setLugar(lugar);

        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Importancia: " + cita.getImportancia());
        System.out.println("Contacto: " + cita.getContacto().getNombre());
        System.out.println("Telefono: " + cita.getContacto().getTelefono());
        System.out.println("Lugar: " + cita.getLugar().getNombre());
        System.out.println("Direccion: " + cita.getLugar().getDireccion());
        System.out.println("============================================");

        // Guitarra guitarra = new Guitarra();
        GuitarraCriolla criolla = new GuitarraCriolla();
        criolla.setFabricante("Yamaha");
        criolla.setModelo("C40");
        criolla.setPrecio(150000);

        GuitarraAcustica acustica = new GuitarraAcustica();
        acustica.setFabricante("Fender");
        acustica.setModelo("CD-60");
        acustica.setPrecio(250000);

        GuitarraElectrica electrica = new GuitarraElectrica();
        electrica.setFabricante("Gibson");
        electrica.setModelo("Les Paul");
        electrica.setPrecio(1200000);

        System.out.println("CRIOLLA");
        System.out.println("Fabricante: " + criolla.getFabricante());
        System.out.println("Modelo: " + criolla.getModelo());
        System.out.println("Precio: " + criolla.getPrecio());

        System.out.println();

        System.out.println("ACUSTICA");
        System.out.println("Fabricante: " + acustica.getFabricante());
        System.out.println("Modelo: " + acustica.getModelo());
        System.out.println("Precio: " + acustica.getPrecio());

        System.out.println();

        System.out.println("ELECTRICA");
        System.out.println("Fabricante: " + electrica.getFabricante());
        System.out.println("Modelo: " + electrica.getModelo());
        System.out.println("Precio: " + electrica.getPrecio());
    }
}



