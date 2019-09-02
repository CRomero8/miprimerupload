/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseparata14;
import java.util.Scanner;
import java.text.SimpleDateFormat; 
import java.util.Date;
public class Ejercicioseparata14 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        double subtotal=0.0,total=0.0,precio,igv=0.0;
        int cproduc;
        Scanner tc = new Scanner(System.in);
        System.out.println("===========================");
        System.out.println("SUPERMERCADO METRO");
        System.out.println("***************************");
        System.out.println("RUC 104544006919");
        Date fechaActual = new Date();
        System.out.println("Fecha y Hora:"+fechaActual);
        System.out.print("Ingrese Código de Producto:");
        cproduc=tc.nextInt();
        System.out.print("Ingrese Precio:");
        precio=tc.nextDouble();
        while (cproduc!=0)
        {
        subtotal=subtotal+precio;
        System.out.print("Ingrese Código de Producto:");
        cproduc=tc.nextInt();
        System.out.print("Ingrese Precio:");
        precio=tc.nextDouble();        
        }
         igv=subtotal*0.15;
         total=subtotal+igv;
         System.out.println("        Sub total:"+subtotal);
         System.out.println("              IGV:"+igv);
         System.out.println("            Total:"+total);
         System.out.println("**************************");
         System.out.println("GRACIAS POR SU PREFENCIA");
         System.out.println("**************************");
         System.out.println("MULTISERVICIOS SISTEMAS");
         
        
    }
    
}
