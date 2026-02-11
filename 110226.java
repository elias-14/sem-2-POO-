package tamal;
//aprendiendo clases con barron :p
public class persona {
	private String name;
	private int age;
	private char gender;
	
	public persona(String nombre, int edad) {
		this.name = nombre;
		this.age = edad;
	}
	public void genderSet(char c) {
		this.gender = c;
	}
	public String toString() {
		return name + ", " + age + ", " + gender;
	}
	public static void main(String [] args) {
		// todo lo demas
		System.out.print("inic");
		persona elias = new persona("Elias", 18);
		elias.genderSet('M');
		System.out.println();
		System.out.println(elias);
		
	}
}


