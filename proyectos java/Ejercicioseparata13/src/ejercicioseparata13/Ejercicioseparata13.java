/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata13;

import java.util.Scanner;
public class Ejercicioseparata13 {

    public static void main(String[] args) {
        // TODO code application logic here
        double i,h,hstr,salario;
        Scanner teclado=new Scanner(System.in);
        System.out.print(" INGRESE Horas trabajadas: ");
        hstr=teclado.nextDouble(); 
        salario=hstr*30; 
        for (i=1;i<=hstr;i++) 
        {
        System.out.println("HORAS TRABAJADAS: " + i);
        }
        System.out.println("TU SALARIO ES: "+salario);

       
        
        
    }
    
}
