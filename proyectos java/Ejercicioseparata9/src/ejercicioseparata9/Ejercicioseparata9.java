/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata9;

import java.util.Scanner;

public class Ejercicioseparata9 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obtenerNumero = new Scanner(System.in);
        int contador,i,n;
        System.out.print("Ingresa un numero: ");
        n = obtenerNumero.nextInt();
        contador = 0;
        for(i = 1; i <= n; i++)
        {
            if((n % i) == 0)
            {
              contador++;
            }
        }
        if(contador == 2)
        {
            System.out.println("El numero es primo");

        }else{

            System.out.println("El numero no es primo");

        }
    }
    
}
