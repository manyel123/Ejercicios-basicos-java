/*Escribir un fichero con BufferedWriter*/

package ficheros3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirconBufferedWriter {

    public static void main(String[] args){
        
        String texto1 = "Ingrese aquí el texto";
        String texto2 = "O no";
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\test\\prueba_buffered.txt"))){/*Para usar BW se necesita FW*/
            
            bw.write("\r\n" + texto1);/*\r\n es un salto de linea*/
            bw.newLine(); /*NewLine() es un salto de linea*/
            bw.write(texto2);
            
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
