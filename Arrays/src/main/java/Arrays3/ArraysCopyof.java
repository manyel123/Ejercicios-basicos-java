//Crear dos arrays, rellenar uno con números y copiarlo al otro usando CopyOf de Arrays.

package Arrays3;

import java.util.Arrays;

public class ArraysCopyof {
    
    public static void main(String[] args){
        
        int num[] = new int[10];        
        
        Arrays.fill(num, 1);
        
        int copia[] = Arrays.copyOf(num, 12); //Se declara la variable copia, sin inicializar se copian los 10 valores de num
                                              //y los 2 últimos valores quedan como cero al copiarse solamente 10 posiciones
        
        int copia2[]  = Arrays.copyOfRange(num, 2, 9);//Copia las posiciones desde la 2 hasta la 8 y crea un nuevo array de [7]                      
        
        for(int i=0; i<copia2.length;i++){
            System.out.println(copia2[i]);
        }
    }
}
