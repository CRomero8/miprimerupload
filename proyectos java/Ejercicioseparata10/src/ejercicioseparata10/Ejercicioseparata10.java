/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata10;

import java.util.Scanner;
public class Ejercicioseparata10 {

    public static void main(String[] args) {
        // TODO code application logic here
        double he,hs,horarestante,horaestadia,pago;
        Scanner teclado=new Scanner(System.in);
        System.out.print(" INGRESE Horas de entrada: ");
        he=teclado.nextDouble();
        System.out.print(" INGRESE Horas de salida: ");
        hs=teclado.nextDouble();        
        pago=1000;
        horaestadia=hs-he;
        horarestante=1000+(horaestadia*600-600);
       if (horaestadia==1)
             { 
            System.out.println("Horas de Estadia es: "+horaestadia);    
            System.out.println("Tu primera hora cuesta: "+pago);
         }
        else{
        }
        if(horaestadia>1)
        {
            System.out.println("Horas de Estadia: "+horaestadia); 
            System.out.println("Tus horas de Estadia cuesta: "+horarestante);
        }
    }
    
}
