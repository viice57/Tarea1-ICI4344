package common;

import java.io.Serializable;

public class Persona implements Serializable {
	private int id;
	private String nombre;
	private int edad;
	
	public Persona(int id, String nombre, int edad) {
		this.setId(id);
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	//buscar como deben ir setters y getters
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
}