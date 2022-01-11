//Crea un array de una longitud que determine el usuario y que le permita insertar números entre 0 y 10(incluyendo 0 y 10)

package Arrays1;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la longitud del array");
        int longitud = entrada.nextInt();
        int numeros[] = new int[longitud];
        int num;
        for(int i=0;i<numeros.length;i++){
            System.out.println("Inserte un número en la posición " + i);
            do{
                num = entrada.nextInt();
                if(!(num>=0 && num<=10)){
                    System.out.println("Error. Solo números entre 0 y 10. "
                    + "Inserte un número en la posición " + i);
                }
            }while(!(num>=0 && num<=10));
            numeros[i]=num;
        }
        System.out.println("Estos son los números ingresados por el usuario:");
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }   
    }
}