package edu.programacion.ejercicio2307;

public class GuitarraElectrica extends Guitarra{
    private String microfono;
    private String ecualizador;
    private String pastillas;

    public GuitarraElectrica(String madera, String cuerdas, String clavijas, String maderaDiapason, String marca, String microfono, String ecualizador,String pastillas) {
        super(madera, cuerdas, clavijas, maderaDiapason, marca);
        this.microfono = microfono;
        this.ecualizador = ecualizador;
        this.pastillas=pastillas;
    }
    @Override
    public void tocar(String sonido) {
        System.out.println("La guitarra electrica " + getMarca() + " suena con mucha distorsion : " + sonido);
    }
    public String getMicrofono() { return microfono; }
    public void setMicrofono(String microfono) { this.microfono = microfono; }
    public String getEcualizador() { return ecualizador; }
    public void setEcualizador(String ecualizador) { this.ecualizador = ecualizador; }
    public String getPastillas() { return pastillas; }
    public void setPastillas(String pastillas) { this.pastillas = pastillas; }
}
