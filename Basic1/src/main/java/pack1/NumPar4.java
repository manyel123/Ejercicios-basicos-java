//Indicar si un número pasado por consola es par o no

package pack1;

import java.util.Scanner;

public class NumPar4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = entrada.nextInt();
        if(num%2==0){
            System.out.println("El número " + num + " es par");
        }
        else{
            System.out.println("El número " + num + " es impar");
        }
    }
}
