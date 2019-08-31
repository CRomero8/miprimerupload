/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata8;

import java.util.Scanner;
public class Ejercicioseparata8 {

    public static void main(String[] args) {
        // TODO code application logic here
       int a,b;
        Scanner teclado=new Scanner(System.in);
        System.out.print("INGRESE NUMERO A: ");
        a=teclado.nextInt();
        System.out.print("INGRESE NUMERO B: ");
        b=teclado.nextInt();
        System.out.println("LOD NÚMEROS ESTAN ORDENADOS DE MENOR A MAYOR");
            if (a>b)
            {
            System.out.println("ORDEN= "+b+","+a);
           
            }
            else
            {
            System.out.println("ORDEN= "+a+","+b);
            
            
            }
        
    }
    
}
