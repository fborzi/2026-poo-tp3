package edu.programacionImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("AIRE ACONDICIONADO");
        AireAcondicionado aire = new AireAcondicionado("Split", 30, 16);
        System.out.println("Encendido: " + aire.encender(true));
        System.out.println("Temperatura inicial: " + aire.consultarTemperaturaActual());
        System.out.println("Subir 5: " + aire.subirTemperatura(5));
        System.out.println("Subir 20 (supera el maximo): " + aire.subirTemperatura(20));
        System.out.println("Bajar 3: " + aire.bajarTemperatura(3));
        System.out.println("Bajar 50 (supera el minimo): " + aire.bajarTemperatura(50));
        System.out.println("Modo fast: " + aire.encenderApagarModFast(true));
        System.out.println("Modo low: " + aire.encenderApagarModLow(false));
        System.out.println("Apagado: " + aire.apagar(false));

        System.out.println("PERSONA");
        Persona persona = new Persona();
        persona.saludar();
        persona.despedir();
        persona.preguntarEstadoCivil();

        System.out.println("CITA");
        Lugar lugar = new Lugar();
        Cita cita = new Cita();
        cita.setFecha(LocalDate.of(2026, 7, 10));
        cita.setContacto(persona);
        cita.setLugar(lugar);
        cita.setImportancia(4);
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Importancia: " + cita.getImportancia());
        System.out.println("Tiene contacto: " + (cita.getContacto() != null));
        System.out.println("Tiene lugar: " + (cita.getLugar() != null));

        System.out.println("GUITARRAS");

        GuitarraCriolla criolla = new GuitarraCriolla();
        System.out.println("Criolla es Guitarra: " + (criolla instanceof Guitarra));
        criolla.afinar();
        criolla.tocarChamame();
        criolla.tocarFolklore();
        criolla.cambiarCuerdasNylon();
        criolla.regularTension();

        GuitarraElectrica electrica = new GuitarraElectrica();
        System.out.println("Electrica es Guitarra: " + (electrica instanceof Guitarra));
        electrica.afinar();
        electrica.conectarAmplificador();
        electrica.ajustarDistorsion();
        electrica.cambiarMaster();

        GuitarraAcustica acustica = new GuitarraAcustica();
        System.out.println("Acustica es Guitarra: " + (acustica instanceof Guitarra));
        acustica.afinar();
        acustica.ajustarCejilla();
        acustica.regularAlturaCuerda();
        acustica.ajustarVolumenNatural();
    }
}