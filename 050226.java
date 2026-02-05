/*

-totales semana por enfermwdades 
-cuantas enfermedades de cada 
-cual fue la enfermedad popular por dia

*/

import java.util.Scanner;
import java.util.Random;
public class Main{
    int[][] ans = new int [7][5];
    public static void main(String [] args){

        /*
        for(int i=0;i<7;i++){
            for(int j=0;j<5;j++){
                ans[i][j] = 67;
                System.out.print(ans[i][j] + " ");
            }System.out.println();
        }
        */
        Main temp = new Main();
        temp.llena();
        for(int i=0;i<7;i++){
            System.out.print("La enfermedad popular del dia "+ (i+1) + " es la ");
            temp.obten(i);
        }
    
        System.out.println("Si tienes queries pon el numero xd");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q > 0){
            q--;
            System.out.println("Da el dia de la semana, y enfermedad");
            int i = sc.nextInt(); int j = sc.nextInt();
            i--; j--;
            System.out.println("La frequencia de la enfermedad fue " + temp.res(i,j));
        }
        temp.resumen();
    }
    public int res(int i, int j){
        return ans[i][j+1];
    }
    public void resumen(){
        int[] freq = new int[5];
        for(int i=0;i<7;i++)
            for(int j=0;j<5;j++)
                freq[j] = freq[j] + ans[i][j];
        for(int i=0;i<5;i++)
            System.out.println("Hubo "+freq[i]+" casos en la semana de la enfermedad "+ i);
    }
    public void llena(){
        Random r = new Random();
        int res;
        
        for(int i=0;i<7;i++){
            for(int j=0;j<5;j++){
                res  = r.nextInt(5);
                ans[i][j] = res;
                System.out.print(ans[i][j]+ " ");
            } System.out.println();
        }
        
    }   
    
    public void obten(int dia){
    /*
        //que dia de la semana tuvo mas enfermedad x
        int []freq = new int [5]; for(int i=0;i<5;i++) freq[i] = 0;
        int mx = 0; int ind = 0;
        for(int j=0;j<5;j++){
          freq[ans[dia][j]]++;
        }
        //for(int j=0;j<5;j++) System.out.print(freq[j]+ " ");
        for(int j=0;j<5;j++){ 
            if(mx < freq[j]){ mx = freq[j]; ind = j;}
        }
        System.out.println( ind + " Con "+ freq[ind] +" casos");
    */
        int mx = 0; int ind = 0;
        for(int j=0;j<5;j++) if(ans[dia][j] > mx) { mx = ans[dia][j]; ind = j;}
        System.out.println(" Fue la " + ind + " con "+ mx   + " casos");
    }
}   
