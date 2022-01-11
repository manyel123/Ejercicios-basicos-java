

import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int par=0;
        int impar=0; 
        System.out.println ("Introduce numero");
        num = teclado.nextInt(); 
        for(int ind=1;ind<=num;ind++) {
            if(ind%2==0) {
                par+=ind;
            }
            else {
                impar+=ind;
            }	 
        }
        System.out.println ("La suma de los pares es "+par);
        System.out.println ("La suma de los impares es "+impar); 
    }	 
}

