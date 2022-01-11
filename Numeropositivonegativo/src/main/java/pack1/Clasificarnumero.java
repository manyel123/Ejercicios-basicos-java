package pack1;

import java.util.Scanner;

public class Clasificarnumero {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num;
        int par = 0;
        int impar = 0;
        System.out.println("ingrese un número");
        num = entrada.nextInt();
        if(num>=0 && num%2==0){            
            System.out.println(num + " es positivo y par");
        }
        else if(num>=0 && num%2!=0){
            System.out.println(num + " es positivo e impar");
        }
        else if(num<0 && num%2==0){
            System.out.println(num + " es negativo y par");
        }
        else{
            System.out.println(num + " es negativo e impar");
        }
    }   
}
