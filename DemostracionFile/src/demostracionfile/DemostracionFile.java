/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracionfile;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Escuela
 */
public class DemostracionFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        System.out.print("escribe aqui el nombre del archivo o directorio: ");
        anilizarRuta(entrada.nextLine());
        
    }

    private static void anilizarRuta(String ruta) {
    
    File nombre=new File(ruta);
    if (nombre.exists()){
        System.out.printf(
        "%s%s\n%s\nh%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
        nombre.getName(),"existe",
        (nombre.isFile()?"es un archivo":"no es un archivo"),
        (nombre.isDirectory()?"es un directorio":
        "no es un directorio"),
        (nombre.isAbsolute()?"es una ruta absoluta":
         "no es una ruta absoluta"),"Ultima modificacion",
         nombre.lastModified(),"tamaño: ",nombre.length(),
         "ruta: ",nombre.getParent(),"ruta absoluta: ",
         nombre.getAbsolutePath(),"padre ,",nombre.getParent());
  
    if (nombre.isDirectory())
    {
        String[] directorio=nombre.list();
        System.out.println("\n\ncontenido del directorio:\n");
        for(String nombreDirectorio:directorio)
            System.out.printf("%s\n",nombreDirectorio);
    }
        
    }
    else
    {
        System.out.printf("%s%s",ruta," no existe");
    }
    }
    
}
