package LeerArchivodeTexto;

import java.io.File;  
import java.io.FileNotFoundException; 
import java.lang.IllegalStateException; 
import java.util.NoSuchElementException; 
import java.util.Scanner; 






public class LeerArchivodeTexto {
    private Scanner entrada;

 // permite al usuario abrir el archivo
 public void abrirArchivo()
 {
 try
 {
 entrada = new Scanner( new File( "clientes.txt" ) );
 } // fin de try
 catch ( FileNotFoundException fileNotFoundException )
 {
 System.err.println( "Error al abrir el archivo." );
 System.exit( 1 );
 } // fin de catch
 } // fin del método abrirArchivo

 // lee registro del archivo
 public void leerRegistros()
 {
 // objeto que se va a escribir en la pantalla
    RegistroCuenta registro = new RegistroCuenta();

 System.out.printf( "%-9s%-15s%-18s%10s\n", "numero de productos",
 " producto", " marca del producto", " precio" );

 try // lee registros del archivo, usando el objeto Scanner
 {
 while ( entrada.hasNext() )
 {
 registro.establecerCuenta( entrada.nextInt() ); // lee el número de cuenta
 registro.establecerPrimerNombre( entrada.next() ); // lee el primer nombre
 registro.establecerApellidoPaterno( entrada.next() ); // lee el apellido

 registro.establecerSaldo( entrada.nextDouble() ); // lee el saldo

 // muestra el contenido del registro
 System.out.printf( "<%-9d\t\t%-15s%-18s%10.2f\n",
 registro.obtenerCuenta(), registro.obtenerPrimerNombre(),
 registro.obtenerApellidoPaterno(), registro.obtenerSaldo() );
 } // fin de while
 } // fin de try
catch ( NoSuchElementException elementException )
{
 System.err.println( "El archivo no esta bien formado." );
 entrada.close();
 System.exit( 1 );
 } // fin de catch
 catch ( IllegalStateException stateException )
 {
 System.err.println( "Error al leer del archivo." );
 System.exit( 1 );
 } // fin de catch
 } // fin del método leerRegistros

 // cierra el archivo y termina la aplicación
 public void cerrarArchivo()
 {
 if ( entrada != null )
 entrada.close(); // cierra el archivo
 } // fin del método cerrarArchivo
 } // fin de la clase LeerArchivoTexto
   
    

