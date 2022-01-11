//Dado una palabra que nos proporciona el usuario. Pasarla a un array de Char.

package Arrays2;

import java.util.Scanner;

public class ArrayChar {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba una frase");        
        String frase = entrada.next();
        char caracteres[] = new char[frase.length()];
        for(int i=0; i<frase.length();i++){
            caracteres[i] = frase.charAt(i);
            System.out.println(caracteres[i]);
        }
    } 
}
