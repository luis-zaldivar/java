/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import java.util.Scanner;
import java.util.Scanner;

/**
 *
 * @author Escuela
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*clase1 obj=new clase1(5,7);
        
        obj.algo();
        obj.setN1(2);
        obj.algo();
     */
        
        alumnos obja1=new alumnos(15,"juan");
        System.out.print(obja1.toString());
        alumnos obja2=new alumnos(18,"luis");
        System.out.print(obja2.toString());
        alumnos obja3=new alumnos(21,"guerra");
        System.out.print(obja3.toString());
        alumnos obja4=new alumnos(24,"y 4,40");
        System.out.print( obja4.toString());
        
    }
    
}
