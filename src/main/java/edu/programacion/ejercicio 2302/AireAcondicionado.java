public class AireAcondicionado {

    private boolean controlRemoto;
    private boolean encendido;
    private int temperatura;
    private int temporizador;
    private boolean movimientoPaleta;
    private String marca;
    private String modelo;
    private String color;
    private double tamaño;

    public AireAcondicionado(boolean controlRemoto, boolean encendido,
                             int temperatura, int temporizador,
                             boolean movimientoPaleta,
                             String marca, String modelo,
                             String color, double tamaño) {

        this.controlRemoto = controlRemoto;
        this.encendido = encendido;
        this.temperatura = temperatura;
        this.temporizador = temporizador;
        this.movimientoPaleta = movimientoPaleta;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamaño = tamaño;
    }

    public boolean encender(boolean encenderAire) {
        encendido = encenderAire;
        return encendido;
    }

    public boolean apagar(boolean apagarAire) {
        encendido = !apagarAire;
        return !encendido;
    }

    public boolean grados(int regularTemperatura) {
        temperatura = regularTemperatura;
        return true;
    }

    public boolean configurar(int programarTemporizador) {
        temporizador = programarTemporizador;
        return true;
    }

    public boolean movimiento(boolean moverPaleta) {
        movimientoPaleta = moverPaleta;
        return true;
    }

    public boolean cambiarModo(String tipoTemperatura) {
        return true;
    }
}public class ControlRemoto {

    public boolean encenderAire() {
        return true;
    }

    public boolean apagarAire() {
        return true;
    }

    public boolean seleccionarTemperatura(int grados) {
        return true;
    }

    public boolean activarTemporizador(int minutos) {
        return true;
    }
}