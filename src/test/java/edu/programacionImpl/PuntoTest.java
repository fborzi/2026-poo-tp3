package edu.programacionImpl;

import edu.programacion.ejercicio2303.Punto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PuntoTest {

    private Punto punto;

    @BeforeEach
    void setUp() {
        punto = new Punto();
        punto.setValorX(1);
        punto.setValorY(2);
    }

    @Test
    void testGetSetValorX() {
        punto.setValorX(10);
        assertEquals(10, punto.getValorX());
    }

    @Test
    void testGetSetValorY() {
        punto.setValorY(20);
        assertEquals(20, punto.getValorY());
    }

    @Test
    void testSumarValorSumaAX() {
        punto.sumarValor(3);
        assertEquals(4, punto.getValorX());
    }

    @Test
    void testSumarValorSumaAY() {
        punto.sumarValor(3);
        assertEquals(5, punto.getValorY());
    }

    @Test
    void testSumarValorRetornaElMismoPunto() {
        assertSame(punto, punto.sumarValor(3));
    }

    @Test
    void testSumarPuntoSumaCoordenadasX() {
        Punto otro = new Punto();
        otro.setValorX(3);
        otro.setValorY(4);
        punto.sumarPunto(otro);
        assertEquals(4, punto.getValorX());
    }

    @Test
    void testSumarPuntoSumaCoordenadasY() {
        Punto otro = new Punto();
        otro.setValorX(3);
        otro.setValorY(4);
        punto.sumarPunto(otro);
        assertEquals(6, punto.getValorY());
    }

    @Test
    void testSumarPuntoRetornaElMismoPunto() {
        Punto otro = new Punto();
        otro.setValorX(0);
        otro.setValorY(0);
        assertSame(punto, punto.sumarPunto(otro));
    }

    @Test
    void testDistanciaAlOrigen() {
        punto.setValorX(3);
        punto.setValorY(4);
        assertEquals(5.0, punto.distanciaAlOrigen(), 0.0001);
    }

    @Test
    void testDistanciaAlOrigenDesdeElOrigen() {
        punto.setValorX(0);
        punto.setValorY(0);
        assertEquals(0.0, punto.distanciaAlOrigen(), 0.0001);
    }

    @Test
    void testDintanciaDeOtroPunto() {
        Punto otro = new Punto();
        otro.setValorX(4);
        otro.setValorY(6);
        assertEquals(5.0, punto.dintanciaDe(otro), 0.0001);
    }

    @Test
    void testDintanciaDeUnPuntoIgual() {
        Punto otro = new Punto();
        otro.setValorX(1);
        otro.setValorY(2);
        assertEquals(0.0, punto.dintanciaDe(otro), 0.0001);
    }
}
