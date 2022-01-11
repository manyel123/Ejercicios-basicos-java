/*Contar cuantas vocales tiene una palabra dada por el usuario*/

package basic3vocalesyespacios;

import javax.swing.JOptionPane;

public class Basic3VocalesyEspacios {

    public static void main(String[] args) {
        
        String texto = JOptionPane.showInputDialog(null, "Escriba una cadena: ", "Insercion", JOptionPane.INFORMATION_MESSAGE);
        texto = texto.toLowerCase(); /*Convierte todos los caracteres de la cadena en minúsculas*/
        
        char vocales[] = {'a','e','i','o','u'};
        
        char caracterActual;
        int contadorVocales = 0;
        boolean esVocal;
        
        for(int i=0;i<texto.length();i++){
            
            caracterActual=texto.charAt(i);/*charAt asigna el caracter en cada ciclo desde la cadena hacia la variable asignada*/
            esVocal = false;
            
            for(int j=0;j<vocales.length && !esVocal;j++){
                
                if(vocales[j]==caracterActual){
                    contadorVocales++;
                    esVocal=true;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La frase tiene " + contadorVocales + " vocal/es", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
