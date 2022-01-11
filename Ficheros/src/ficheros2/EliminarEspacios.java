/*Eliminar espacios de un fichero y convertir todo a mayúsculas*/

package ficheros2;

import ficheros.EscribirconFileWriter;
import ficheros.LeerconFileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EliminarEspacios {
    
    public static void main(String[] args){
        
        String contenido = "";
        String salida = "";
        int c; /*Se usa (char)c para que ingrese como letra a contenido*/
        
        try(FileReader fr = new FileReader("C:\\test\\fichero.txt")) {
            
            while(((c = fr.read())!=-1)){/*c se inicializó y lee el fichero, en cada ciclo añade una letra a c*/
                                 /*Al llegar al final del fichero read() devuelve -1 por eso el ciclo se detiene allí*/
                if((char)c!=' '){
                    contenido+=(char)c;
                }
            }
            salida = contenido.toUpperCase();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerconFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerconFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        try(FileWriter fw = new FileWriter("C:\\test\\fichero.txt");) {/*Al declarar en try() no es necesario cerrar el fichero*/             
            /*Sin True indica que sobreescribirá todo el contenido
            del fichero. Si no se usa TRUE, se reescribiré el fichero completo.*/
            
            fw.write(salida);/*"\r\n" hace un salto de linea  en el archivo donde se guarda el string*/ 
            
        } catch (IOException ex) {
            Logger.getLogger(EscribirconFileWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
