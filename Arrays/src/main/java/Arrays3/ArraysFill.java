//Llenar un array de números (int) usando el método fill de arrays

package Arrays3;

import java.util.Arrays;

/**
 *
 * @author pz
 */
public class ArraysFill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        int num[] = new int[10];
        
        Arrays.fill(num, 20); //fill llena todos los espacios del array con 20
        
        Arrays.fill(num, 3, 6, -1); // fill llena los espacios del 3 al 5(nunca toma el valor final)
        
        Arrays.fill(num, 3, num.length, -1); //fill llena los espacios desde el 3 hasta el final del array
        
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
    
}
