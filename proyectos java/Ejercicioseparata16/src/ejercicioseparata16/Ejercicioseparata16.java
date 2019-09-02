/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata16;

import java.util.Scanner;
public class Ejercicioseparata16 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int bc=0,bv=0,bd=0,bc2=0,bm=0,n=0,c=0,resto;
        Scanner tc = new Scanner(System.in);
        System.out.print("Ingrese datos n:");
        n=tc.nextInt();
        c=n;
        {
        while (c>=50000)
        {
        bc++;
        c=c-50000;       
        }      
        while (c>=20000)
        {
        bv++;
        c=c-20000;
        }       
        while (c>=10000)
        {
        bd++;
        c=c-10000;
        }
        while (c>=5000)
        {
        bc2++;
        c=c-5000;                
        }
        while (c>=1000)
        {
        bm++;
        c=c-1000;
        }
        resto=c;
        }
        System.out.println(+n);
        System.out.println(+bc);
        System.out.println(+bv);
        System.out.println(+bd);
        System.out.println(+bc2);
        System.out.println(+bm);
        System.out.println(+resto);
        
       
    }
    
}
