public class GuitarraCriolla extends Guitarra {

    private String tipoMadera;
    private String decoracion;

    public GuitarraCriolla(double precio, String modelo, String color,
                           String fabricante, String madera, int cuerdas,
                           String diseño, double tamaño,
                           String afinacion, double peso,
                           String tipoMadera, String decoracion) {

        super(precio, modelo, color, fabricante, madera,
                cuerdas, diseño, tamaño, afinacion, peso);

        this.tipoMadera = tipoMadera;
        this.decoracion = decoracion;
    }
}