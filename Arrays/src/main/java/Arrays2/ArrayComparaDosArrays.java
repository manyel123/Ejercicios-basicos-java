//Dado un array de números, indicar si es capicua, es decir, si se lee igual tanto por delante como por detras

package Arrays2;

import java.util.Arrays;


public class ArrayComparaDosArrays {
    public static void main(String[] args){
        int numeros[] = {9,0,0,9};
        int aux[] = new int[numeros.length];
        for(int j=0, i=numeros.length-1; i>=0; i--, j++){
            aux[j] = numeros[i];
            System.out.println(aux[j]);
        }
        if(Arrays.equals(numeros, aux)){ //Compara el interior de los dos arrays con el método "Arrays"
            System.out.println("El array es capicua");
        }else{
            System.out.println("El array no es capicua");
        }
    }
}
