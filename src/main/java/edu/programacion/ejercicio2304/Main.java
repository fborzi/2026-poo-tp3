package edu.programacion.ejercicio2304;

// Se importa Punto porque pertenece a otro paquete y Circulo
// necesita usarlo como tipo de dato para su atributo "centro" y su constructor.
import edu.programacion.ejercicio2303.Punto;

/**
 * Clase de prueba para verificar el funcionamiento de Circulo y su relación con Punto.
 */
public class Main {
    /**
     * Punto de entrada del programa. Crea un objeto Punto y un objeto Circulo para probar sus metodos
     * @param args en este caso no se les da uso a los argumentos
     */
    public static void main(String[] args){

        Punto centro = new Punto(12, 10);
        Circulo circulo = new Circulo(centro, 5);

        circulo.ampliar(12);
        System.out.println(circulo);
        Double area = circulo.area();
        System.out.println("Área del círculo: " + area);
        circulo.trasladar(12,13);
        System.out.println(circulo);
    }
}
