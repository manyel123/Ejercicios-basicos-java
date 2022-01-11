/*Leer el anterior fichero con BufferedWriter*/

package ficheros3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LeerconBufferedWriter {
    
    public static void main(String[] args){
        
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\test\\prueba_buffered.txt"))){
            
            String linea;
            
            while((linea = br.readLine()) != null){/*readLine lee e imprime cada linea en cada iteración
                                                    hasta que no encuentre más lineas (null)
                                                    BR retorna null al terminar el contenido. FR retorna -1*/
                System.out.println(linea);
            }
            
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
