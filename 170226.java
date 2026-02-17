//termine persona
package Pkt1;

import java.util.ArrayList;
import java.util.Scanner;
//18/50
public class persona {
	private String name;
	private int age;
	private String gender;
	public static int mujeres = 0, menores= 0, mayores = 0;
	public static int sum = 0; public static String menor_name; 
	public static int men_edad = 100000;
	
	public persona(String nombre, int edad) {
		this.name = nombre;
		this.age = edad;
	}
	public String toString() { return name + ", " + age + ", " + gender;}
	public void genderS(String c) { this.gender = c;}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<persona>arr = new ArrayList();
		for(int i=0;i<10;i++) {
			System.out.println("Dame nombre, edad y genero (M o F)");
			String nombre = sc.nextLine();
			int edad = sc.nextInt(); sc.nextLine(); //limpiar el buffer
			String genstr = sc.nextLine();
			persona p = new persona(nombre,edad);
			p.genderS(genstr);
			arr.add(p);	
			//System.out.println(arr.get(i));
			if(edad < 18) menores++; if(edad > 59) mayores++;
			
			//if(genstr == "F") mujeres++; 
			if(genstr.equals("F")) mujeres++; 
			
			sum += edad;
			if(edad < men_edad) {
				men_edad = edad;
				menor_name = nombre;
			}
		}
		double promedio = sum/10;
		
		System.out.println("El numero de " + "menores" + " es de " + menores);
		System.out.println("El numero de " + "mayores" + " es de " + mayores);
		System.out.println("El numero de " + "mujeres" + " es de " + mujeres);
		System.out.println("El promedio de " + "edades" + " es de " + promedio);
		System.out.println("El menor de " + "todos" + " es " + menor_name + " con " + men_edad + " años");
	}
}
