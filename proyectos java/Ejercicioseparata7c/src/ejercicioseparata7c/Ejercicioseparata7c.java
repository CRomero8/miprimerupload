/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata7c;

import java.util.Scanner;
public class Ejercicioseparata7c {

    public static void main(String[] args) {
        // TODO code application logic her
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba un numero entero: ");
        n = teclado.nextInt();           
        int x = -1;
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
        x += 2;
        sum =n*n;
        System.out.println(x);
        }
     System.out.println("La sumatoria de los " + n + " Primeros números impares es: " + sum);
        
    }
    
}
