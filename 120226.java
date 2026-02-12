package Pkt1;
//aprendiendo clases con barron :p
public class Triangle {
	private int b;
	private int h;
	public Triangle(int base, int altura) {
		this.b = base;
		this.h = altura;
	}
	public void setBase(int b) {
		this.b = b;
	}
	public void setAltura(int h) {
		this.h = h;
	}	
	int queryBase() {
		return this.b;
	}
	int queryAltura() {
		return this.h;
	}
	
	public String toString() {
		return "El triangulo tiene de base "+ b + " y altura "+ h + " y de area "+ (b*h/2);
	}
	public static void main(String [] args) {
		Triangle t1 = new Triangle(5,6);
		
		System.out.println(t1);
	}
}

