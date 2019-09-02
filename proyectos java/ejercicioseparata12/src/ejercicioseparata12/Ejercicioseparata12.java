/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata12;

import java.util.Scanner;
public class Ejercicioseparata12 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        double n=1,acu=0,notas=0,prom=0;
        while (n!=0)
          {
           System.out.print("Ingrese nota:");
           n=tc.nextDouble();
           acu++;
           notas=notas+n;
           
          }  
        acu=acu -1;
        prom=notas/acu;
        System.out.println("Promedio general:"+prom);
         
    }
    
}
