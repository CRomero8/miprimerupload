/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata11;
import java.util.Scanner;
public class Ejercicioseparata11 {

    public static void main(String[] args) {
        // TODO code application logic here
        double Kmxh,mxs,vel;
        Scanner teclado=new Scanner(System.in);//agregamos new e in 
        System.out.print(" Ingrese Velocidad en Km/h: ");
        vel=teclado.nextDouble();
        mxs=(vel*5)/18;
        System.out.println("Tu velocidad es:"+mxs + ",m/s");
    }
    
}
