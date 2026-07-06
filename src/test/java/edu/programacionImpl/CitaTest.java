package edu.programacionImpl;

import edu.programacion.ejercicio2306.Cita;
import edu.programacion.ejercicio2306.Lugar;
import edu.programacion.ejercicio2306.Persona;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CitaTest {

    private Cita cita;
    private Persona persona;
    private Lugar lugar;

    @BeforeEach
    void setUp() {
        persona = new Persona();
        lugar = new Lugar();
        cita = new Cita();
    }

    // --- Persona ---

    @Test
    void testPersonaExiste() {
        assertNotNull(persona);
    }

    // --- Lugar ---

    @Test
    void testLugarExiste() {
        assertNotNull(lugar);
    }

    // --- Cita ---

    @Test
    void testCitaExiste() {
        assertNotNull(cita);
    }

    @Test
    void testCitaTieneFecha() {
        LocalDate fecha = LocalDate.of(2026, 6, 1);
        cita.setFecha(fecha);
        assertEquals(fecha, cita.getFecha());
    }

    @Test
    void testCitaTieneContacto() {
        cita.setContacto(persona);
        assertEquals(persona, cita.getContacto());
    }

    @Test
    void testCitaTieneLugar() {
        cita.setLugar(lugar);
        assertEquals(lugar, cita.getLugar());
    }

    @Test
    void testCitaTieneImportancia() {
        cita.setImportancia(3);
        assertEquals(3, cita.getImportancia());
    }

    @Test
    void testImportanciaMinima() {
        cita.setImportancia(1);
        assertEquals(1, cita.getImportancia());
    }

    @Test
    void testImportanciaMaxima() {
        cita.setImportancia(5);
        assertEquals(5, cita.getImportancia());
    }
}
