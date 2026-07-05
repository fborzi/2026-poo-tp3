package edu.programacion.ejercicio2307;

/**
 * Representa una guitarra acústica.
 *
 * Hereda los atributos y comportamientos de la clase Guitarra
 * e incorpora características propias de una guitarra acústica.
 *
 */
public class GuitarraAcustica extends Guitarra {

    /**
     * Tipo de caja de resonancia.
     */
    private String cajaResonancia;

    /**
     * Tipo de cuerdas de la guitarra.
     */
    private String tipoCuerda;

    /**
     * Crea una guitarra acústica.
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
     * @param cajaResonancia Tipo de caja de resonancia.
     * @param tipoCuerda Tipo de cuerdas (Nylon o Acero).
     */
    public GuitarraAcustica(String modelo,
                            String fabricante,
                            String madera,
                            int cuerdas,
                            String color,
                            double peso,
                            double largo,
                            String estado,
                            int stock,
                            String cajaResonancia,
                            String tipoCuerda) {

        super(modelo, fabricante, "Acústica", madera,
                cuerdas, color, peso, largo, estado, stock);

        this.cajaResonancia = cajaResonancia;
        this.tipoCuerda = tipoCuerda;
    }

    /**
     * Produce el sonido de la guitarra acústica.
     */
    @Override
    public void tocar() {
        System.out.println("La guitarra acústica está sonando.");
    }

    /**
     * Proyecta el sonido utilizando la caja de resonancia.
     */
    public void proyectarSonido() {
        System.out.println("La caja de resonancia proyecta el sonido.");
    }

    /**
     * Devuelve el tipo de caja de resonancia.
     *
     * @return Caja de resonancia.
     */
    public String getCajaResonancia() {
        return cajaResonancia;
    }

    /**
     * Modifica el tipo de caja de resonancia.
     *
     * @param cajaResonancia Nueva caja de resonancia.
     */
    public void setCajaResonancia(String cajaResonancia) {
        this.cajaResonancia = cajaResonancia;
    }

    /**
     * Devuelve el tipo de cuerdas.
     *
     * @return Tipo de cuerdas.
     */
    public String getTipoCuerda() {
        return tipoCuerda;
    }

    /**
     * Modifica el tipo de cuerdas.
     *
     * @param tipoCuerda Nuevo tipo de cuerdas.
     */
    public void setTipoCuerda(String tipoCuerda) {
        this.tipoCuerda = tipoCuerda;
    }
}