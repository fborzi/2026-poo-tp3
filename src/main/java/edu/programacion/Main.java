package edu.programacion;

//import edu.programacion.ejercicio2302.AireAcondicionado;
//import edu.programacion.ejercicio2303.Punto;
import edu.programacion.ejercicio2304.Circulo;
import edu.programacion.ejercicio2304.Punto;

public class Main {
    public static void main(String[] args) {

        /** ejercicio 2302
        AireAcondicionado aire = new AireAcondicionado("Samsung", "AR12");

        aire.apagar();
        aire.aumentarTemperatura();
        aire.cambiarVelocidad(3);

        System.out.println(aire.mostrarEstado());
        */

        /** ejercicio 2303
        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto(6, 8);

        //Mostramos cuanto vale el punto
        System.out.println("P1: " + p1.mostrar());

        //Llamamos a la primer funcion y le damos valor = 2
        p1.sumarValor(2);

        //Mostramos cuanto vale el punto despues de sumarle el valor
        System.out.println("P1 después de sumar valor: " + p1.mostrar());

        //Llamamos a la segunda funcion y le pasamos el punto declarado arriba
        p1.sumarPunto(p2);

        //Mostramos cuanto vale el punto despues de sumar los dos puntos
        System.out.println("P1 después de sumar punto: " + p1.mostrar());

        //Mostramos la distancia entre los dos puntos
        System.out.println("Distancia entre p1 y p2: " + p1.distanciaDe(p2));

        //Mostramos la distancia del primer punto al origen
        System.out.println("Distancia al origen: " + p1.distanciaAlOrigen());

        //Si queremos que solo muestre dos decimales escribimos %.2f%n en el print
        //System.out.printf("Distancia entre p1 y p2: %.2f%n", p1.distanciaDe(p2));
        //System.out.printf("Distancia al origen: %.2f%n", p1.distanciaAlOrigen());
         */

        // Crear un punto
        Punto centro = new Punto(1, 1);

        // Crear un círculo
        Circulo circulo = new Circulo(centro, 5);

        System.out.println("Círculo inicial");
        System.out.println(circulo.mostrar());

        // Ampliar el radio
        circulo.ampliar(3);

        // Mostrar el área
        System.out.printf("\nÁrea: %.2f%n", circulo.area());

        // Trasladar el círculo
        circulo.trasladar(4, 2);

        System.out.println("\nDespués de trasladarlo:");
        System.out.println(circulo.mostrar());
    }
}