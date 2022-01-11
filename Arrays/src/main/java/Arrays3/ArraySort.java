//Ordena un array de números con Sort de Arrays.

package Arrays3;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args){
        
        int num[] = new int[5];
        
        num[0]=6;
        num[1]=3;
        num[2]=9;
        num[3]=4;
        num[4]=1;

        Arrays.sort(num);
        
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        
    }
    
}
