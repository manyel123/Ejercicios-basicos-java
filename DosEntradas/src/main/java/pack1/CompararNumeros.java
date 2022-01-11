package pack1;

import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("ingrese el primer numero");
        num1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = entrada.nextInt();
        if(num1>num2){
            System.out.println(num1 + " es mayor que " + num2);
        }
        else if(num1<num2){
            System.out.println(num1 + " es menor que " + num2);
        }
        else{
            System.out.println("los numeros son iguales");
        }
    }
}
