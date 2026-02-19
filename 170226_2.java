package Pkt1;
/*
 *  tarea 10 y 11, 12 errores 
 * Marca error por que  tiene entero no estatico y los metodos piden staticos
 * 
 */
public class enterox {
	int x;
	public static int getx() { return x; }
	public static void setx(int newx) { x = newx;}
}
/*
 * 
 * Marca error por que tiene statico y los metodos piden no staticos
 * 
 */
public class enterox{
	static int x;
	public int getx() { return x; }
	public void setx(int newx) { x = newx;}
}
