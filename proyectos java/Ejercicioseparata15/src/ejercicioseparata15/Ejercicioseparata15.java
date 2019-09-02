/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata15;

import java.util.Scanner;
public class Ejercicioseparata15 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int años=0,meses=0,semanas=0,dias=0,numdias=0;
        Scanner tc = new Scanner(System.in);
        System.out.print("Ingrese numero de dias:");
        numdias=tc.nextInt();
        dias=numdias;
        while (dias>365)
        {
        años++;
        dias=dias-365;       
        }      
        while (dias>30)
        {
        meses++;
        dias=dias-30;
        }       
        while (dias>7)
        {
        semanas++;
        dias=dias-7;
        }
        System.out.println("En: "+numdias+ ",Dias");
        System.out.println("Hay: "+años+ ",Años");
        System.out.println("Meses: "+meses);
        System.out.println("Semanas:"+semanas+ ",y");
        System.out.println("Dias: " +dias);
        
    }
    
}
