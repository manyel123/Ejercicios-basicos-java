package pack1;

import java.util.Scanner;

public class ArrayBasico {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int array[];
        int suma=0;
        array = new int[5];
        for(int i=0; i<array.length; i++){
            System.out.println("Ingrese el dato " + (i+1));
            array[i] = entrada.nextInt();
        }
        System.out.println("Usted Ingresó:");
        for(int i=0; i<array.length; i++){
            suma = array[i]+suma;
            System.out.print(array[i] + " "); 
        }
        System.out.println("");
        System.out.println("La Suma de los número es:" + suma);
        System.out.println("Los números invertidos son:");
        for(int i=(array.length)-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
