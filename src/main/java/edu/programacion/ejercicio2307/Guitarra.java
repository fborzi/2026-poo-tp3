package edu.programacion.ejercicio2307;
/**
 * Representa una guitarra.
 */
public abstract class Guitarra {

    /**
     * Modelo de la guitarra.
     */
    private String modelo;

    /**
     * Fabricante o marca de la guitarra.
     */
    private String fabricante;

    /**
     * Tipo de guitarra.
     */
    private String tipo;

    /**
     * Tipo de madera utilizada.
     */
    private String madera;

    /**
     * Cantidad de cuerdas.
     */
    private int cuerdas;

    /**
     * Color de la guitarra.
     */
    private String color;

    /**
     * Peso de la guitarra.
     */
    private double peso;

    /**
     * Largo de la guitarra.
     */
    private double largo;

    /**
     * Estado de la guitarra.
     */
    private String estado;

    /**
     * Cantidad de guitarras disponibles en stock.
     */
    private int stock;

    /**
     * Crea una guitarra con todas sus características.
     *
     * @param modelo Modelo de la guitarra.
     * @param fabricante Fabricante o marca.
     * @param tipo Tipo de guitarra.
     * @param madera Tipo de madera.
     * @param cuerdas Cantidad de cuerdas.
     * @param color Color de la guitarra.
     * @param peso Peso de la guitarra.
     * @param largo Largo de la guitarra.
     * @param estado Estado de la guitarra.
     * @param stock Cantidad disponible en stock.
     */
    public Guitarra(String modelo, String fabricante, String tipo,
                    String madera, int cuerdas, String color,
                    double peso, double largo,
                    String estado, int stock) {

        this.modelo = modelo;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.madera = madera;
        this.cuerdas = cuerdas;
        this.color = color;
        this.peso = peso;
        this.largo = largo;
        this.estado = estado;
        this.stock = stock;
    }

    /**
     * Afina la guitarra.
     */
    public void afinar() {
        System.out.println("La guitarra ha sido afinada.");
    }

    /**
     * Permite tocar la guitarra.
     *
     */
    public abstract void tocar();

    /**
     * Muestra toda la información de la guitarra.
     */
    public void mostrarInformacion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Tipo: " + tipo);
        System.out.println("Madera: " + madera);
        System.out.println("Cuerdas: " + cuerdas);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso);
        System.out.println("Largo: " + largo);
        System.out.println("Estado: " + estado);
        System.out.println("Stock: " + stock);
    }

    /**
     * Devuelve el modelo.
     *
     * @return Modelo de la guitarra.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Devuelve el fabricante.
     *
     * @return Fabricante.
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Devuelve el tipo de guitarra.
     *
     * @return Tipo.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Devuelve la madera.
     *
     * @return Tipo de madera.
     */
    public String getMadera() {
        return madera;
    }

    /**
     * Devuelve la cantidad de cuerdas.
     *
     * @return Cantidad de cuerdas.
     */
    public int getCuerdas() {
        return cuerdas;
    }

    /**
     * Devuelve el color.
     *
     * @return Color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Devuelve el peso.
     *
     * @return Peso.
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Devuelve el largo.
     *
     * @return Largo.
     */
    public double getLargo() {
        return largo;
    }

    /**
     * Devuelve el estado.
     *
     * @return Estado.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Devuelve el stock disponible.
     *
     * @return Stock.
     */
    public int getStock() {
        return stock;
    }
}