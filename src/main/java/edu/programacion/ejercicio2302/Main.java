package edu.programacion.ejercicio2302;

/**
 * Clase de prueba para verificar el funcionamiento de AireAcondicionado y Modo.
 */
public class Main {
    public static void main(String[] args){

        Modo modo = new Modo("Frio" , "Enfria continuamente");
        Modo modoCalor = new Modo("Calor", "Calienta el ambiente");
        AireAcondicionado aireAcondicionado = new AireAcondicionado();

        System.out.println(aireAcondicionado.getEstaEncendido());
        aireAcondicionado.presionarBotonEncender();
        System.out.println(aireAcondicionado.getEstaEncendido());
        aireAcondicionado.setModo(modo);
        System.out.println(aireAcondicionado.getModo());
        aireAcondicionado.setDireccionPaleta("arriba");
        System.out.println(aireAcondicionado.getDireccionPaleta());
        aireAcondicionado.movimientoPaleta();
        System.out.println(aireAcondicionado.getDireccionPaleta());
        aireAcondicionado.setTemperaturaSeteada(20);
        System.out.println(aireAcondicionado.getTemperaturaSeteada());
        aireAcondicionado.subirTemperatura();
        System.out.println(aireAcondicionado.getTemperaturaSeteada());
        aireAcondicionado.bajarTemperatura();
        System.out.println(aireAcondicionado.getTemperaturaSeteada());
        aireAcondicionado.cambiarModo(modoCalor);
        System.out.println(aireAcondicionado.getModo());
    }
}
