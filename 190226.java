package Pkt1;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * clase contacto
 * tarea 6
 * elias rojo
 * 
 */
public class Contacto {
	private String name;
	private String gender;
	private String alias;
	private String number;
	public static int culeros = 0;
	public Contacto(String nombre, String sexo, String sur) {
			this.name = nombre;
			this.gender = sexo;
			this.alias = sur;
	}
	public void numberset(String numero) {
		this.number = numero;
	}
	public String toString() {
		return name+" "+gender+" "+alias;
	}
	public static void main(String [] args) {
		String []nombres = {"Alejandro", "Beatriz", "Carlos", "Diana", "Eduardo", "Fernanda", "Gabriel", "Helena", "Ignacio", "Julia", "Kevin", "Laura", "Mateo", "Natalia", "Oscar", "Patricia", "Ricardo", "Sofía", "Tomás", "Valeria"};
		String []alias = {"Alex", "Bea", "Charly", "Di", "Edu", "Fer", "Gabi", "Helen", "Nacho", "Jules", "Kev", "Lau", "Teo", "Naty", "Osky", "Paty", "Richi", "Sofi", "Tom", "Vale"};
		String []sexo = {"M", "F", "M", "F", "M", "F", "M", "F", "M", "F", "M", "F", "M", "F", "M", "F", "M", "F", "M", "F"};
		String []telefono = {"667123456", "612987654", "667456789", "654321098", "667789123", "600112233", "667334455", "677556677", "667990011", "688223344", "667554433", "699667788", "667112299", "633445566", "667889900", "622112233", "667665544", "611778899", "667001122", "644332211"};
		
		ArrayList<Contacto>dir = new ArrayList();
		for(int i=0;i<nombres.length;i++) {
			Contacto trolex = new Contacto(nombres[i], sexo[i], alias[i]);
			trolex.numberset(telefono[i]);
			dir.add(trolex);
			String sub = telefono[i];
			if(sub.startsWith("667")) culeros++;
		}	
		
		System.out.println("El numero de culiacanenses es de " + culeros);
	}
}
