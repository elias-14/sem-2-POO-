package Pkt1;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * 
 *  10 datos de persona a teclad en array list
 *  
 *  despues tot de mujeres, numero de menores de edad
 *  average
 *  nombre de la persona mas joven
 *  tot de adultos mayores
 */


public class temp {
	public class persona{
		private String name;
		private int age;
		public persona(String nombre, int edad) {
			this.name = nombre;
			this.age = edad;
		}
	}
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<persona>arr = new ArrayList();
		for(int i=0;i<10;i++) {
			String nombre = sc.nextLine();
			int edad = sc.nextInt();
			String genstr = sc.nextLine();
			char ge[] = genstr.toCharArray();
			char gen = ge[0];
			arr.add(persona(nombre, edad));
			
		}
	}
	//quickfix 
	private static persona persona(String nombre, int edad) {
		// TODO Auto-generated method stub
		return null;
	}

}
