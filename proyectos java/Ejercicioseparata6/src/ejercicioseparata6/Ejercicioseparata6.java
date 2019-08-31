/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata6;

import java.util.Scanner;
public class Ejercicioseparata6 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner teclado=new Scanner(System.in);
        System.out.print(" INGRESE NÚMERO: ");
        n=teclado.nextInt();
        if (n%2==0)
        {
            System.out.println("EL VALOR INGRGESADO ES PAR");
        }
        else{
    
            {
           System.out.println("EL VALOR INGRESADO ES IMPAR");
            }
        }
    }
    
}
