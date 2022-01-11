/*Escribir en un fichero "Hola mundo"*/

package ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscribirconFileWriter {

    public static void main(String[] args) {
        
        try(FileWriter fw = new FileWriter("C:\\test\\fichero.txt", true);) {/*Al declarar en try() no es necesario cerrar el fichero*/ 
             
            FileWriter fw1 = new FileWriter("C:\\test\\fichero.txt", true);/*True indica que escribirá al final del contenido 
            del fichero. Si no se usa TRUE, se reescribiré el fichero completo.
            */
            
            fw.write("\r\nHola Mundo");/*"\r\n" hace un salto de linea  en el archivo donde se guarda el string*/ 
            
            fw1.close();/*En este caso se usa fw1.close para cerrar el que no está dentro del try()*/
                        /*Dentro del try() pueden ir varios objetos, aquí se usó uno fuera y otro dentro pero ambos o más
                            pueden ir dentro del try()  */
            
        } catch (IOException ex) {
            Logger.getLogger(EscribirconFileWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
