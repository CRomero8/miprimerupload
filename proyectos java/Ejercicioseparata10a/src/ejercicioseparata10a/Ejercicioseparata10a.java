/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata10a;

import java.util.Scanner;
public class Ejercicioseparata10a {

    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c,d,p4,p2,p3,cant,precio;
        Scanner teclado=new Scanner(System.in);
        System.out.print("INGRESE UN PRECIO EN SOLES: ");
        precio=teclado.nextDouble();
        System.out.print("INGRESE CANTIDAD DE ENTRADAS: ");
        cant=teclado.nextDouble();
        a=cant*precio;
        p2=a*10/100;
        p3=a*15/100;
        p4=a*20/100;
        b=(a-p2);
        c=(a-p3);
        d=(a-p4);
        if (cant==1)
        {
            System.out.print("Total a pagar es: "+a);
        }
        else{       
        }
        if (cant==2)
        {
            System.out.print("Total a pagar mas descuento es: "+b);
        }
        else{
        }
        if (cant==3)
         {
          System.out.print("Total a pagar mas decuento es: "+c);
         }
        else{
         }
        if (cant==4)
        {
        System.out.print("Total a pagar mas decuento es: "+d);
        }
        else{
        }
        if (cant>=5)
        {
        System.out.print("Total a pagar sin descuento es: "+a);
        }
    }
    
}
