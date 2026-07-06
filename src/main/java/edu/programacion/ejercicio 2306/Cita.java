public class Cita {

    private String fecha;
    private Persona contacto;
    private Lugar lugar;
    private int importancia;

    public Cita(String fecha, Persona contacto, Lugar lugar, int importancia) {
        this.fecha = fecha;
        this.contacto = contacto;
        this.lugar = lugar;
        this.importancia = importancia;
    }

    public String getFecha() {
        return fecha;
    }

    public Persona getContacto() {
        return contacto;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public int getImportancia() {
        return importancia;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setContacto(Persona contacto) {
        this.contacto = contacto;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }
}