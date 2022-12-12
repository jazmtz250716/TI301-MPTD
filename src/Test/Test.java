
package Test;
import Lineas_De_Espera. *;
import java.util.*;


public class Test {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Stack <LineasDeEspera> cajas = new Stack<>();
        System.out.println("Numero de cajas que desea ingresar :");
        int nCajas = sc.nextInt();
       int i = 0;
        while (i < nCajas) {
            System.out.println("::::::::::::::::::::" + "Caja " + (i + 1) + "::::::::::::::::::::");
            cajas.add(new LineasDeEspera());
             System.out.println(cajas.get(i));
            System.out.println(" ");
            i++;
            
        }
            
       

    }
}
