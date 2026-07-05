package edu.programacion.ejercicio2306;

public class Lugar {
    private Integer id;
    private String nombre;

    public Lugar (Integer id,String nombre){
        this.id= id;
        this.nombre=nombre;
    }
    public void setNombre(String nombre) {
        this.nombre =nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    // Agrega esto dentro de la clase Lugar
    @Override
    public String toString() {
        return this.nombre; // O el campo que quieras mostrar en consola
    }

}
