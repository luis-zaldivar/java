/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Escuela
 */
public class clase1 {
     
    private int n2,n1;

    clase1(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    
    public void algo(){
        int suma;
        suma=n1+n2;
        System.out.print("le resultadoes "+suma+"\n");
        System.out.print("con el otro metodo es el resultadoes "+(this.n1+this.n2)+"\n");
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
    
    
    
}
