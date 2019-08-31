/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata5a;

import java.util.Scanner;
public class Ejercicioseparata5a {

   
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,h;
        Scanner teclado=new Scanner(System.in);
        System.out.print(" INGRESE BASE DEL RECTANGULO: ");
        b=teclado.nextDouble();
        System.out.print(" INGRESE ALTURA DEL RECTANGULO: ");
        h=teclado.nextDouble();
        a= b*h;
        System.out.println("Area del cilindro:"+a);
     
    }
    
}
