package edu.programacion.ejercicio2302;

public class Main {
    public static void main(String[] args) {
        AireAcondicionado aire = new AireAcondicionado(
                24,
                "Samsung",
                "AR12",
                12000,
                220,
                false,
                30,
                1500,
                2,
                "Frio",
                "Sucio"
        );

        aire.mostratDatos();
        aire.encender(true);
        aire.bajarTemperatura(24);
        aire.ajustarVentilador(3);
        aire.limpiarFiltro("Sucio");
        System.out.println("Estado: " + aire.consultarEstado(true));
    }
}
