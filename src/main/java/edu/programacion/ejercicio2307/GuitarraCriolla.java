package edu.programacion.ejercicio2307;

/**
 * Representa una guitarra criolla.
 *
 * Hereda los atributos y comportamientos de la clase Guitarra
 * e incorpora características propias de una guitarra criolla.
 *
 * @author Tu Nombre
 * @version 1.0
 */
public class GuitarraCriolla extends Guitarra {

    /**
     * Indica si la guitarra posee cuerdas de nylon.
     */
    private boolean cuerdasNylon;

    /**
     * Indica si la guitarra está destinada al uso clásico.
     */
    private boolean usoClasico;

    /**
     * Crea una guitarra criolla con todas sus características.
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
     * @param cuerdasNylon Indica si posee cuerdas de nylon.
     * @param usoClasico Indica si está destinada al uso clásico.
     */
    public GuitarraCriolla(String modelo,
                           String fabricante,
                           String madera,
                           int cuerdas,
                           String color,
                           double peso,
                           double largo,
                           String estado,
                           int stock,
                           boolean cuerdasNylon,
                           boolean usoClasico) {

        super(modelo, fabricante, "Criolla", madera,
                cuerdas, color, peso, largo, estado, stock);

        this.cuerdasNylon = cuerdasNylon;
        this.usoClasico = usoClasico;
    }

    /**
     * Produce el sonido característico de una guitarra criolla.
     */
    @Override
    public void tocar() {
        System.out.println("La guitarra criolla está sonando.");
    }

    /**
     * Permite interpretar música clásica.
     */
    public void tocarClasico() {
        System.out.println("Interpretando una pieza de música clásica.");
    }

    /**
     * Indica si la guitarra posee cuerdas de nylon.
     *
     * @return {@code true} si posee cuerdas de nylon, {@code false} en caso contrario.
     */
    public boolean isCuerdasNylon() {
        return cuerdasNylon;
    }

    /**
     * Modifica si la guitarra posee cuerdas de nylon.
     *
     * @param cuerdasNylon Nuevo estado de las cuerdas de nylon.
     */
    public void setCuerdasNylon(boolean cuerdasNylon) {
        this.cuerdasNylon = cuerdasNylon;
    }

    /**
     * Indica si la guitarra está destinada al uso clásico.
     *
     * @return {@code true} si es para uso clásico, {@code false} en caso contrario.
     */
    public boolean isUsoClasico() {
        return usoClasico;
    }

    /**
     * Modifica si la guitarra está destinada al uso clásico.
     *
     * @param usoClasico Nuevo estado de uso clásico.
     */
    public void setUsoClasico(boolean usoClasico) {
        this.usoClasico = usoClasico;
    }
}