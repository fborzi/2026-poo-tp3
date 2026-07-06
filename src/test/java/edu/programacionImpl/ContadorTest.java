package edu.programacionImpl;

import edu.programacion.ejercicio2301.Contador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorTest {

    private Contador contador;

    @BeforeEach
    void setUp() {
        contador = new Contador();
    }

    @Test
    void testIniciarEnCero() {
        assertEquals(0, contador.iniciar());
    }

    @Test
    void testIniciarEnValorPositivo() {
        assertEquals(5, contador.iniciar(5));
    }

    @Test
    void testIniciarEnValorNegativo() {
        assertEquals(-3, contador.iniciar(-3));
    }

    @Test
    void testSumarUno() {
        contador.iniciar();
        assertEquals(1, contador.sumar());
    }

    @Test
    void testRestarUno() {
        contador.iniciar();
        assertEquals(-1, contador.restar());
    }

    @Test
    void testSumarVariasVeces() {
        contador.iniciar();
        assertEquals(2, contador.sumar(2));
    }

    @Test
    void testRestarVariasVeces() {
        contador.iniciar();
        assertEquals(-2, contador.restar(2));
    }

    @Test
    void testSumarN() {
        contador.iniciar();
        assertEquals(3, contador.sumar(3));
    }

    @Test
    void testRestarN() {
        contador.iniciar(5);
        assertEquals(2, contador.restar(3));
    }

    @Test
    void testGetSetValor() {
        contador.setValor(42);
        assertEquals(42, contador.getValor());
    }

}
