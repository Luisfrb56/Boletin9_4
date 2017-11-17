
package boletin9_4;

import java.util.Scanner;


public class Metodos4 {
    public void calcularTabla(){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un dato entero: ");
        num=sc.nextInt();
        System.out.println("Tabla del "+num);
        for(int cont=1;cont<=10;cont++){
         System.out.println(num + " * " + cont + " = " + num*cont);   
        }
    }
}
