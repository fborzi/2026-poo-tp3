abstract class Guitarra {

    protected String marca;
    protected int cantidadCuerdas;

    public Guitarra(String marca, int cantidadCuerdas) {
        this.marca = marca;
        this.cantidadCuerdas = cantidadCuerdas;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidadCuerdas() {
        return cantidadCuerdas;
    }

    public abstract void tocar();
}

class GuitarraElectrica extends Guitarra {

    public GuitarraElectrica(String marca, int cantidadCuerdas) {
        super(marca, cantidadCuerdas);
    }

    @Override
    public void tocar() {
        System.out.println("Sonido eléctrico");
    }
}

class GuitarraAcustica extends Guitarra {

    public GuitarraAcustica(String marca, int cantidadCuerdas) {
        super(marca, cantidadCuerdas);
    }

    @Override
    public void tocar() {
        System.out.println("Sonido acústico");
    }
}

