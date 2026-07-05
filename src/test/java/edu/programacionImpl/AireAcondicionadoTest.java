package edu.programacionImpl;

import edu.programacion.ejercicio2302.AireAcondicionado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AireAcondicionadoTest {


    @Test
    public void testAireAcondicionado(){
        AireAcondicionado aireAcondicionado = new AireAcondicionado();
        assertNotNull(aireAcondicionado, "El objeto se instanció correctamente");
    }
}
