//Crear una función que nos indique si un número es par o impar

package pack1;

import java.util.Scanner;

public class FuncionParImpar {
    public static void main(String[] args){
        System.out.println("Ingrese un número");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        boolean val = validarNumeroPar(num);
        if(val==true){
            System.out.println("El número ingresado es par");
        }else{
            System.out.println("El número ingresado es impar");
        }
        
    }
    public static boolean validarNumeroPar(int numero){
        if(numero%2==0){
            return true;
        }
        return false;
    }
}
