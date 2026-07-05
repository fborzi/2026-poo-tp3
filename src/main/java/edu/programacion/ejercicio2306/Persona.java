package edu.programacion.ejercicio2306;

/**
     * Representa una persona.
     */
    public class Persona {

        /**
         * Nombre de la persona.
         */
        private String nombre;

        /**
         * Edad de la persona.
         */
        private int edad;

        /**
         * Crea una persona.
         *
         * @param nombre Nombre.
         * @param edad Edad.
         */
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        /**
         * Devuelve el nombre.
         *
         * @return Nombre.
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Cambia el nombre.
         *
         * @param nombre Nuevo nombre.
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * Devuelve la edad.
         *
         * @return Edad.
         */
        public int getEdad() {
            return edad;
        }

        /**
         * Cambia la edad.
         *
         * @param edad Nueva edad.
         */
        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
