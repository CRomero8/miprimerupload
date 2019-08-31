/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioseparata3;

import java.util.Scanner;
public class Ejercicioseparata3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        Scanner teclado=new Scanner(System.in);
        System.out.print(" Ingrese una nota: ");
        nota=teclado.nextInt();
        if (nota>=19&& nota <=20)
         {  
            System.out.println("Nota A");
         }
        else{
        }
         if (nota>=16&&nota<=18)
         {
            System.out.println("Nota B");
         }
         else{
        }
         if (nota>=13&&nota<=15)
         {
            System.out.println("Nota C");
         }
         else{
        }
         if (nota>=10&&nota<=12)
         {
            System.out.println("Nota D");
         }
         else{
        }
         if (nota>=1&&nota<=9)
         {
            System.out.println("Nota E");
         }
         else{
          }
         if (nota>20)
         {
            System.out.println("Ingrese Nota entre 1 Al 20");
          }
    }
    
}
