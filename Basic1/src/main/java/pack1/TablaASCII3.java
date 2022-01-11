//Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tebla ASCII
//Por ejemplo si introduzco un 97 me muestre una a
package pack1;

import java.util.Scanner;

public class TablaASCII3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = entrada.nextInt();
        
        char character = (char)num;
        
        System.out.println("El número " + num + " corresponde al caracter '" + character + "'");
    }
}
