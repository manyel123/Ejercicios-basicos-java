/*Contar el número de vocales, consonantes y números que hay en un fichero pasado por teclado(su ruta) */

package ficheros2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LeerFicheroFileReader {
    
    public static void main(String[] args){
        
        String ruta = JOptionPane.showInputDialog(null, "Ingrese la ruta del fichero ", "Inserción", JOptionPane.INFORMATION_MESSAGE);
        
        int contadorVocales=0;
        int contadorConsonantes=0;
        int contadorNumeros=0;
        
        try(FileReader fr = new FileReader(ruta)) {
            
            int caracter;
            
            int vocales[]={65,69,73,79,85,97,101,105,111,117};/*Valores en ASCII de las vocales(Mayúsculas y minúsculas)*/
            boolean esVocal;                                  /*NO TOMA LETRAS CON ACENTO PORQUE NO LAS HEMOS INCLUIDO*/
                                                              
            while((caracter = fr.read())!=-1){
                if(caracter>=48 && caracter <=57){
                    contadorNumeros++;
                }else if((caracter>=65 && caracter<=90) || 
                                (caracter>=97 && caracter<=122)){
                                        
                    esVocal = false;
                    for(int i=0;i<vocales.length && !esVocal;i++){
                        if(caracter==vocales[i]){
                            esVocal = true;
                        }     
                    } 
                    if(esVocal){
                        contadorVocales++;
                    }else{
                        contadorConsonantes++;
                    }
                }
            }         
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        } catch (IOException ex) {
            Logger.getLogger(LeerFicheroFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hay " + contadorVocales + " vocales");
        System.out.println("Hay " + contadorConsonantes + " consonantes");
        System.out.println("Hay " + contadorNumeros + " números");
        
    }
}
