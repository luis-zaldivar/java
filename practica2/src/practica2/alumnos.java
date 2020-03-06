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
public class alumnos {
    private int edad;
    private String nombre;

    public alumnos(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String toString() {
        return ("alumnos{" + "edad=" + edad + ", nombre=" + nombre + '}'+"\n");
    }


    public void datos(){
        System.out.print("el alumno: "+this.nombre+" tiene una edad de: "+this.edad+"\n");
    }
}
