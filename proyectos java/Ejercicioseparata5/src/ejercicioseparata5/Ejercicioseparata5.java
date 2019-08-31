/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata5;
import java.util.Scanner;
public class Ejercicioseparata5 {

    public static void main(String[] args) {
        // TODO code application logic here
        double a,vol,h,r;
        Scanner teclado=new Scanner(System.in);
        System.out.print(" INGRESE RADIO DEL CILINDRO: ");
        r=teclado.nextDouble();
        System.out.print(" INGRESE ALTURA DEL CILINDRO: ");
        h=teclado.nextDouble();
        a= Math.PI * 2*r*h;
        vol= Math.PI*h*Math.pow(r,2);
        System.out.println("Area del cilindro:"+a);
        System.out.println("Volumen del cilindro:"+vol);
    }
    
}
