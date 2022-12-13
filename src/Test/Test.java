
package Test;
import lineasdeespera. *;
import java.util.*;


public class Test {
  static   int i = 0;
  static int nCajas; 
  static Stack <LineasDeEspera> cajas = new Stack<>();
 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Numero de cajas que desea ingresar :");
         nCajas = sc.nextInt();
       
        while (i < nCajas) {
            System.out.println("::::::::::::::::::::" + "Caja " + (i + 1) + "::::::::::::::::::::");
            cajas.add(new LineasDeEspera());
             System.out.println(cajas.get(i));
            System.out.println(" ");
            i++;
            
        }
            
       

    }
}
