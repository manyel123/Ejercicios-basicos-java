package pack1;

import java.util.Scanner;


public class CalcularFactorial {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int factorial = 1;
        int numero = 0;
        System.out.println("Ingrese el número factorial a calcular");
        numero = entrada.nextInt();
        for(int i = 1; i <= numero; i++){
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}    
