package edu.programacionImpl;

import edu.programacion.ejercicio2307.Guitarra;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuitarraTest {

    // --- Guitarra (abstract) ---

    @Test
    void testGuitarraEsAbstracta() {
        assertTrue(Modifier.isAbstract(Guitarra.class.getModifiers()));
    }

    // --- GuitarraElectrica ---

    @Test
    void testGuitarraElectricaExiste() {
        assertNotNull(new GuitarraElectrica());
    }

    @Test
    void testGuitarraElectricaEsUnaGuitarra() {
        assertInstanceOf(Guitarra.class, new GuitarraElectrica());
    }

    // --- GuitarraCriolla ---

    @Test
    void testGuitarraCriollaExiste() {
        assertNotNull(new GuitarraCriolla());
    }

    @Test
    void testGuitarraCriollaEsUnaGuitarra() {
        assertInstanceOf(Guitarra.class, new GuitarraCriolla());
    }

    // --- GuitarraAcustica ---

    @Test
    void testGuitarraAcusticaExiste() {
        assertNotNull(new GuitarraAcustica());
    }

    @Test
    void testGuitarraAcusticaEsUnaGuitarra() {
        assertInstanceOf(Guitarra.class, new GuitarraAcustica());
    }
}
