public class GuitarraElectrica extends Guitarra {

    private String tipoCuerda;
    private boolean controlVolumen;
    private String tipoAmplificacion;

    public GuitarraElectrica(double precio, String modelo, String color,
                             String fabricante, String madera, int cuerdas,
                             String diseño, double tamaño,
                             String afinacion, double peso,
                             String tipoCuerda,
                             boolean controlVolumen,
                             String tipoAmplificacion) {

        super(precio, modelo, color, fabricante, madera,
                cuerdas, diseño, tamaño, afinacion, peso);

        this.tipoCuerda = tipoCuerda;
        this.controlVolumen = controlVolumen;
        this.tipoAmplificacion = tipoAmplificacion;
    }
}