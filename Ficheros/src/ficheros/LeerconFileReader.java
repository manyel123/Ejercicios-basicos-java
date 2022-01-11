/*Leer el contenido del fichero anterior y mostrarlo en pantalla*/

package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerconFileReader {
    
    public static void main(String[] args){
        
        String contenido = "";
        int c; /*Se usa (char)c para que ingrese como letra a contenido*/
        
        try {
            FileReader fr = new FileReader("C:\\test\\fichero.txt");
            
            while((c = fr.read())!=-1){/*c se inicializó y lee el fichero, en cada ciclo añade una letra a c*/
                contenido+=(char)c;     /*Al llegar al final del fichero read() devuelve -1 por eso el ciclo se detiene allí*/
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerconFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerconFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El contenido del fichero es: " + contenido);
    }
}
