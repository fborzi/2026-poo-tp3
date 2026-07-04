package edu.programacionImpl;

public class AireAcondicionado {
    private boolean estaPrendido;
    private String tipo;
    private int temperaturaMax;
    private int temperaturaMin;
    private boolean tieneModoSpring;
    private boolean tieneModoFast;
    private boolean tieneModoLow;
    private int temperaturaActual;

    public AireAcondicionado() {
    }

    public AireAcondicionado(String tipo, int temperaturaMax, int temperaturaMin) {
        this.tipo = tipo;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.temperaturaActual = temperaturaMin;
    }

    public boolean encender(boolean estaPrendido) {
        this.estaPrendido = estaPrendido;
        return this.estaPrendido;
    }

    public boolean apagar(boolean estaPrendido) {
        this.estaPrendido = estaPrendido;
        return this.estaPrendido;
    }

    public int subirTemperatura(int n) {
        if (temperaturaActual + n <= temperaturaMax) {
            temperaturaActual = temperaturaActual + n;
        } else {
            temperaturaActual = temperaturaMax;
        }
        return temperaturaActual;
    }

    public int bajarTemperatura(int n) {
        if (temperaturaActual - n >= temperaturaMin) {
            temperaturaActual = temperaturaActual - n;
        } else {
            temperaturaActual = temperaturaMin;
        }
        return temperaturaActual;
    }

    public int consultarTemperaturaActual() {
        return this.temperaturaActual;
    }

    public boolean encenderApagarModFast(boolean tieneModoFast) {
        this.tieneModoFast = tieneModoFast;
        return this.tieneModoFast;
    }

    public boolean encenderApagarModLow(boolean tieneModoLow) {
        this.tieneModoLow = tieneModoLow;
        return this.tieneModoLow;
    }
}