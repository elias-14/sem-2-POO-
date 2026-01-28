/*

autor ps saile azul

cosas que busque:
-como hacer un array en java
-como generar un numero random en java
-como usar rand en java
-como leer un dato en java se me olvido jeje

*/
import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		/* Parte 1 generacion */
		int[][] ans = new int[4][4];
		char[][] g = new char[4][4];
		// N random int mines = (int)(Math.random()*10);
		int lo = 4, hi = 10;
		//int n = rand.nextInt((hi-lo)+1)+lo;
		int n = (int)Math.floor(Math.random()*(hi-lo+1)+lo);
		hi = 3; lo = 0;
		for(int i=0;i<n;i++){
		    int x = (int)Math.floor(Math.random()*(hi-lo+1)+lo);
		    int y = (int)Math.floor(Math.random()*(hi-lo+1)+lo);
		    while(g[x][y] == '*'){
		        x = (int)Math.floor(Math.random()*(hi-lo+1)+lo);
		        y = (int)Math.floor(Math.random()*(hi-lo+1)+lo);
		    }
		    g[x][y] = '*';
		}
		/* Parte 2 queries offline */
		//verificar que si se hizo el grid de manera correcta
		int []dx = {1,-1,0,0,1,-1,1,-1};
		int []dy = {0,0,1,-1,1,-1,-1,1};
		for(int i=0;i<4;i++){
		    for(int j=0;j<4;j++){
		        for(int k=0;k<8;k++){
		            int nx = i + dx[k];
		            int ny = j + dy[k];
		               if(nx <= 3 && nx >= 0 && ny >= 0 && ny <= 3 && g[nx][ny] == '*')
		                    ans[i][j]++;
		        }
		        System.out.print(g[i][j] +" ");
		    }System.out.println();
		}
		/* Parte 3 supongo  */
	    System.out.println("Cuantas queries tienes? ");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q>0){
            q--;
	        System.out.println("Coord X");
            int a = sc.nextInt();
            System.out.println("Coord Y");
            int b = sc.nextInt();
            System.out.println("En el coso que diste hay "+ ans[a-1][b-1] + " minas alrededor mira: ");
            for(int i=0;i<4;i++){ for(int j=0;j<4;j++) System.out.print(g[i][j]+" ");  System.out.println();}
        }
	}
}
