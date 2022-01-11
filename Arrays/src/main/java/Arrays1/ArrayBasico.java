//Crear un array que contenga los números del 1 al 100. Muestrelos por consola.

package Arrays1;


public class ArrayBasico {
    public static void main(String[] args){
        int array[] = new int[100];
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
            System.out.println(array[i]);
        }            
    }
}
