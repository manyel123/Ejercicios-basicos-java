/*Eliminar los espacios de una frase dada por el usuario*/

package basic3vocalesyespacios;

import javax.swing.JOptionPane;

public class EliminarEspacios {
    
    public static void main(String[] args){
        
        String texto = JOptionPane.showInputDialog(null, "Escriba una cadena: ", "Insercion", JOptionPane.INFORMATION_MESSAGE);
        texto = texto.toLowerCase(); /*Convierte todos los caracteres de la cadena en minúsculas*/
               
        char caracterActual;
        String textoSinEspacios = "";

        for(int i=0;i<texto.length();i++){
            
            caracterActual=texto.charAt(i);/*charAt asigna el caracter en cada ciclo desde la cadena hacia la variable asignada*/
            
            if(caracterActual!=' '){
                textoSinEspacios += caracterActual;
            }
            
        }
        JOptionPane.showMessageDialog(null, textoSinEspacios, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }    
}
