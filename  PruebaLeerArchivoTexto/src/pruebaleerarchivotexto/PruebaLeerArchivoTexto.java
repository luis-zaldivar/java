/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaleerarchivotexto;

/**
 *
 * @author Escuela
 */
public class PruebaLeerArchivoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LeerArchivoTexto aplicacion = new LeerArchivoTexto();
        aplicacion.abrirArchivo();
        aplicacion.leerRegistros();
        aplicacion.cerrarArchivo();
    }
    
}
