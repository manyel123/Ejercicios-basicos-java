//Indica si dos arrays creados por ti son iguales con Equals de arrays.

package Arrays3;

import java.util.Arrays;

public class ArrayEquals {

    public static void main(String[] args){
        
        int num1[] = new int[10];
        int num2[] = new int[10];
        
        Arrays.fill(num1, -1);
        Arrays.fill(num2, -1);
        
        if(Arrays.equals(num1, num2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        if(num1==num2){//No son iguales porque if en arrays apunta a la memoria donde está y no al contenido del 
            //num1=num2; indicaría que ambas variables apuntan a la misma posicion en la memoria
            //por lo tanto ambas pasarían a ser iguales en dimesión y valores sin importar como se hallan declarado al inicio
            System.out.println("Las posiciones en la memoria no son iguales");
        }
    }
    
}
