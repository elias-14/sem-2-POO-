package Pkt1;
/*
 * classe perro 
 * tarea 7
 * get y set para todos los atributos y to string
 * elias rojo
 * 
 */
public class Perro {
	private String nombre,gender,breed,color;
	private int edad,peso;
	
	public Perro(String name, String genero, String raza) {
		this.nombre = name;
		this.gender = genero;
		this.breed = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return nombre + " " + gender + " " + breed + " " + color; 
	}
	
}
