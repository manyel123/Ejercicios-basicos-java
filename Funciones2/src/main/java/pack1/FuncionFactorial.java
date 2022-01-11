//Crear una función que nos devuelva el factorial de un número entero

package pack1;

import java.util.Scanner;

public class FuncionFactorial {
    public static void main(String[] args){
        int num;
        System.out.println("Ingrese el número factorial a calcular");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();   
        if(calcularFactorial(num)!=-1){
            System.out.println("El factorial de " + num + " es " + calcularFactorial(num));
        }else{
        System.out.println("Error, no se puede calcular el factorial de " + num);
        }
    }
    public static int calcularFactorial(int numero){ //Esta función se desborda después de 30 porque el resultado es muy grande
        int factorial = 1;
        if(numero<0){
            System.out.println("No se puede calcular el factorial "
                    + "de un número negativo");
            return -1;
        }
        for(int i = 1; i <= numero; i++){
            factorial = factorial * i;
        }
        return factorial;
    }   
}
