//Crear una función que nos indique si un número es primo o no

package pack1;

import java.util.Scanner;

public class FuncionNumeroPrimo {
    public static void main(String[] args){
        System.out.println("Ingrese un número");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        if((esPrimo(num))==true){
            System.out.println(num + " es primo.");
        }else{
            System.out.println(num + " no es primo.");
        }
    }
    public static boolean esPrimo(int numero){
        if(numero<=1){
            return false;
        }
        for(int i=(int)Math.sqrt(numero); i>1; i++){
            if(numero%i==0){
                return false;
            }
        }
        return true;
    }
}
