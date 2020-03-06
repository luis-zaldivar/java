package pruebacreararchivotexto;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
//import com.deitel.cap17.RegistroCuenta;

public class CrearArchivoTexto
{
    private Formatter salida; // objeto usado para enviar texto al archivo

// permite al usuario abrir el archivo
    public void abrirArchivo()
    {
        try
        {
            salida = new Formatter( "clientes.txt" ); // abre el archivo
        } // fin de try
        catch ( SecurityException securityException )
        {
            System.err.println(
            "No tiene acceso de escritura a este archivo." );
            System.exit( 1 ); // termina el programa
        } // fin de catch
        catch ( FileNotFoundException fileNotFoundException )
        {
            System.err.println( "Error al abrir o crear el archivo." );
            System.exit( 1 ); // termina el programa
        } // fin de catch
    } // fin del método abrirArchivo

    // agrega registros al archivo
    public void agregarRegistros()
    {
        // objeto que se va a escribir en el archivo
        RegistroCuenta registro = new RegistroCuenta();
        Scanner entrada = new Scanner( System.in );
        

        System.out.printf( "inserte el nunmero de producto,inserte el nombre del producto, marca, precio, descuento\n " );

        while ( entrada.hasNext() ) // itera hasta encontrar el indicador de fin de
        {
            try // envía valores al archivo
            {
                // obtiene los datos que se van a enviar
                registro.establecerCuenta( entrada.nextInt() ); // lee el número de cuenta
                if(registro.obtenerCuenta()==-1) break;
                registro.establecerPrimerNombre( entrada.next() ); // lee el primer nombre
                registro.establecerApellidoPaterno( entrada.next() ); // lee el apellido
                registro.establecerSaldo( entrada.nextDouble() ); // lee el saldo
                registro.setDescuento(entrada.nextInt());
                System.out.print("para salir ponga -1");
                if ( registro.obtenerCuenta() > 0 )
                {
                    // escribe el nuevo registro
                    salida.format( "%d %s %s %.2f %d\n", registro.obtenerCuenta(),
                    registro.obtenerPrimerNombre(), registro.obtenerApellidoPaterno(),
                    registro.obtenerSaldo(),registro.obtenerDescuento() );
                } // fin de if
                else
                {
                    
                    System.out.println(
                    "}El numero del producto debe ser mayor que 0." );
                } // fin de else
            } // fin de try
            catch ( FormatterClosedException formatterClosedException )
            {
                System.err.println( "}Error al escribir en el archivo." );
                return;
            } // fin de catch
            catch ( NoSuchElementException elementException )
            {
                System.err.println( "}Entrada invalida. Intente de nuevo." );
                entrada.nextLine(); // descarta la entrada para que el usuario intente
            } // fin de catch

            System.out.printf( "}%s %s\n%s", "}Escriba el numero del producto (> 0),",
            "}nombre del producto, marca, precio y descuento.", "? " );
        } // fin de while
    } // fin del método agregarRegistros

    // cierra el file
    public void cerrarArchivo()
    {
        if ( salida != null )
        salida.close();
    } // fin del método cerrarArchivo
} // fin de la clase CrearArchivoTexto