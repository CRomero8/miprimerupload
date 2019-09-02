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
        int numobre=5,tnomina=0,ht=0,salario=0;
        Scanner tc = new Scanner(System.in);
        while(numobre>0)
        {
        System.out.print("Ingrese horas trabajadas:");
        ht=tc.nextInt();
         salario=ht*30;
         tnomina=tnomina+salario;
         System.out.println("Numeros Obreros:"+numobre);
         System.out.println("Salario:"+salario);
         System.out.println("Nomina Salarial:"+tnomina);
         numobre=numobre-1;
        }
        
        
    
    
       
        
        
    }
    
}
