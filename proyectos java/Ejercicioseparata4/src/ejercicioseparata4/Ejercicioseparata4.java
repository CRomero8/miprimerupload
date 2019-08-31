/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata4;

import java.util.Scanner;
public class Ejercicioseparata4 {

    public static void main(String[] args) {
        // TODO code application logic here
        double cata,catb;
        Scanner teclado=new Scanner(System.in);
        System.out.print("INGRESE el cateto a: ");
        cata=teclado.nextDouble();
        System.out.print("INGRESE el cateto b: ");
        catb=teclado.nextDouble();
        int hip1 = (int) Math.pow(cata, 2)+(int) Math.pow(catb, 2);
        float resultado = (float) Math.sqrt(hip1);
        
        if (cata==3&&catb==4)
        {
         System.out.println("El ángulo es de 53°y 37°");
        System.out.println("La hipotenusa es:" + resultado); 
        } 
        else{
         if (cata==1&&catb==1)
         {
         System.out.println("El ángulo es de 45°");
        System.out.println("La hipotenusa es:" + resultado); 
         }
         else{
             if (cata==7&&catb==24)
             {
              System.out.println("El ángulo es de 74°y 16°");
              System.out.println("La hipotenusa es:" + resultado);   
             }
             else{
                 if(cata==1&&catb==7)
                 {
                  System.out.println("El ángulo es de 8°y 82°");
                    System.out.println("La hipotenusa es:" + resultado);   
                 }
                 else{
                     System.out.println("catetos no conocidos");
                 }
             }
         }
        }
    }
    
}
