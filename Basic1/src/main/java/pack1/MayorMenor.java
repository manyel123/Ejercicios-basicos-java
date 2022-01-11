//Pedir 2 números por teclado e indicar si uno es mayor que el otro o si son iguales

package pack1;

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = entrada.nextInt();
        if(num1<=num2){
            if(num1==num2){
                System.out.println(num1 + " y " + num2 + " son iguales.");
            }else{
                System.out.println(num1 + " es menor que " + num2);
            }
        }else{
            System.out.println(num1 + " es mayor que " + num2);
        }
    }   
}
