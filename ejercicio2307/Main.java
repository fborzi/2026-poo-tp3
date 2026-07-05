public class Main {

    public static void main(String[] args) {

        Guitarra g1 = new GuitarraElectrica("Fender", 6);
        Guitarra g2 = new GuitarraAcustica("Yamaha", 6);

        System.out.println("Primera guitarra");
        System.out.println("Marca: " + g1.getMarca());
        System.out.println("Cantidad de cuerdas: " + g1.getCantidadCuerdas());
        g1.tocar();

        System.out.println();

        System.out.println("Segunda guitarra");
        System.out.println("Marca: " + g2.getMarca());
        System.out.println("Cantidad de cuerdas: " + g2.getCantidadCuerdas());
        g2.tocar();
    }
}