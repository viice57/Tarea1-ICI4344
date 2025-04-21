package common;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private int edad;

    // Constructor para la tarea (solo nombre y edad)
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = -1; // ID por defecto (no necesario para la tarea)
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Para imprimir fácilmente por consola
    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + "', edad=" + edad + "}";
    }
}
