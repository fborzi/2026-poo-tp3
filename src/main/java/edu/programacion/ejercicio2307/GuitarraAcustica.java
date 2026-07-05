package edu.programacion.ejercicio2307;

public class GuitarraAcustica extends Guitarra{
    private String microfono;
    private String ecualizador;

    public GuitarraAcustica(String madera, String cuerdas, String clavijas, String maderaDiapason, String marca, String microfono, String ecualizador) {
        super(madera, cuerdas, clavijas, maderaDiapason, marca);
        this.microfono = microfono;
        this.ecualizador = ecualizador;
    }
    @Override
    public void tocar(String sonido) {
        System.out.println("La guitarra acústica " + getMarca() + " suena brillante y natural: " + sonido);
    }
    public String getMicrofono() { return microfono; }
    public void setMicrofono(String microfono) { this.microfono = microfono; }
    public String getEcualizador() { return ecualizador; }
    public void setEcualizador(String ecualizador) { this.ecualizador = ecualizador; }
}
