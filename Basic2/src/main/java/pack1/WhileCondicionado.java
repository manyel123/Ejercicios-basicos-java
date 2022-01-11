//Crear un programa que nos permita ingresar números hasta que ingresemos -1

package pack1;

import java.util.Scanner;

public class WhileCondicionado {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = entrada.nextInt();
        int contador=0;
        while(num!=-1){
            contador++;
            System.out.println(num);
            System.out.println("Ingrese otro número");
            num = entrada.nextInt();
        }
        System.out.println("Fin, se han introducido " + contador + " números");
    }
}
