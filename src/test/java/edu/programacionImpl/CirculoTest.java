package edu.programacionImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CirculoTest {

    private Circulo circulo;

    @BeforeEach
    void setUp() {
        circulo = new Circulo();
        circulo.setRadio(5.0);

        Punto centro = new Punto();
        centro.setValorX(0);
        centro.setValorY(0);
        circulo.setCentro(centro);
    }

    @Test
    void testGetSetRadio() {
        circulo.setRadio(10.0);
        assertEquals(10.0, circulo.getRadio(), 0.0001);
    }

    @Test
    void testGetSetCentro() {
        Punto nuevoCentro = new Punto();
        nuevoCentro.setValorX(3);
        nuevoCentro.setValorY(4);
        circulo.setCentro(nuevoCentro);
        assertEquals(3, circulo.getCentro().getValorX());
        assertEquals(4, circulo.getCentro().getValorY());
    }

    @Test
    void testAmpliarAumentaRadio() {
        assertEquals(8.0, circulo.ampliar(3.0), 0.0001);
    }

    @Test
    void testAmpliarConValorNegativoReduceRadio() {
        assertEquals(3.0, circulo.ampliar(-2.0), 0.0001);
    }

    @Test
    void testAreaConRadioCinco() {
        assertEquals(Math.PI * 25.0, circulo.area(), 0.0001);
    }

    @Test
    void testAreaConRadioUno() {
        circulo.setRadio(1.0);
        assertEquals(Math.PI, circulo.area(), 0.0001);
    }

    @Test
    void testTrasladarActualizaCentroX() {
        circulo.trasladar(3, 4);
        assertEquals(3, circulo.getCentro().getValorX());
    }

    @Test
    void testTrasladarActualizaCentroY() {
        circulo.trasladar(3, 4);
        assertEquals(4, circulo.getCentro().getValorY());
    }

    @Test
    void testTrasladarRetornaElCentro() {
        Punto resultado = circulo.trasladar(2, 5);
        assertEquals(circulo.getCentro(), resultado);
    }

    @Test
    void testTrasladarAcumula() {
        circulo.trasladar(2, 3);
        circulo.trasladar(1, 1);
        assertEquals(3, circulo.getCentro().getValorX());
        assertEquals(4, circulo.getCentro().getValorY());
    }
}
