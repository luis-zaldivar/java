/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Escuela
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a=5,b=4;
        int c=a+b;
        System.out.println(c);
        Pablo pablito =new Pablo();
        pablito.imprimir();
        pablito.setA(12);
        pablito.imprimir();
        
        //para la practica
        suma obj=new suma();
             System.out.print("\t\tpara la suma\ninserte el primer numero: ");
        Scanner LEER = new Scanner(System.in);
        int s1,s2;
        suma sumita=new suma();
        s1= LEER.nextInt();
        System.out.print("\ninserte el segundo numero: ");
        s2= LEER.nextInt();
       System.out.print("la suma es "+obj.suma(s1, s2)+"\n");
        
       
        
        
        
    }
    
}
