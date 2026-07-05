package edu.programacion.ejercicio2307;

/**
 * Representa una guitarra eléctrica.
 *
 * Hereda los atributos y comportamientos de la clase Guitarra
 * y agrega características propias de una guitarra eléctrica.
 **/
public class GuitarraElectrica extends Guitarra {

    /**
     * Tipo de pastilla de la guitarra.
     */
    private String tipoPastilla;

    /**
     * Indica si posee un amplificador conectado.
     */
    private boolean amplificador;

    /**
     * Nivel de volumen.
     */
    private int volumen;

    /**
     * Crea una guitarra eléctrica con todas sus características.
     *
     * @param modelo Modelo de la guitarra.
     * @param fabricante Fabricante o marca.
     * @param madera Tipo de madera.
     * @param cuerdas Cantidad de cuerdas.
     * @param color Color de la guitarra.
     * @param peso Peso de la guitarra.
     * @param largo Largo de la guitarra.
     * @param estado Estado de la guitarra.
     * @param stock Cantidad disponible en stock.
     * @param tipoPastilla Tipo de pastilla.
     * @param amplificador Indica si posee amplificador.
     * @param volumen Nivel de volumen.
     */
    public GuitarraElectrica(String modelo,
                             String fabricante,
                             String madera,
                             int cuerdas,
                             String color,
                             double peso,
                             double largo,
                             String estado,
                             int stock,
                             String tipoPastilla,
                             boolean amplificador,
                             int volumen) {

        super(modelo, fabricante, "Eléctrica", madera,
                cuerdas, color, peso, largo, estado, stock);

        this.tipoPastilla = tipoPastilla;
        this.amplificador = amplificador;
        this.volumen = volumen;
    }

    /**
     * Produce el sonido de una guitarra eléctrica.
     */
    @Override
    public void tocar() {
        System.out.println("La guitarra eléctrica está sonando.");
    }

    /**
     * Conecta el amplificador de la guitarra.
     */
    public void conectarAmplificador() {
        amplificador = true;
        System.out.println("Amplificador conectado.");
    }

    /**
     * Modifica el volumen de la guitarra.
     *
     * @param volumen Nuevo nivel de volumen.
     */
    public void regularVolumen(int volumen) {
        this.volumen = volumen;
        System.out.println("Volumen regulado a: " + volumen);
    }

    /**
     * Devuelve el tipo de pastilla.
     *
     * @return Tipo de pastilla.
     */
    public String getTipoPastilla() {
        return tipoPastilla;
    }

    /**
     * Indica si el amplificador está conectado.
     *
     * @return true si está conectado.
     */
    public boolean isAmplificador() {
        return amplificador;
    }

    /**
     * Devuelve el volumen.
     *
     * @return Nivel de volumen.
     */
    public int getVolumen() {
        return volumen;
    }

    /**
     * Modifica el tipo de pastilla.
     *
     * @param tipoPastilla Nuevo tipo de pastilla.
     */
    public void setTipoPastilla(String tipoPastilla) {
        this.tipoPastilla = tipoPastilla;
    }

    /**
     * Modifica el estado del amplificador.
     *
     * @param amplificador Estado del amplificador.
     */
    public void setAmplificador(boolean amplificador) {
        this.amplificador = amplificador;
    }

    /**
     * Modifica el volumen.
     *
     * @param volumen Nuevo volumen.
     */
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}