//Dado un array de números(podemos declarar los valores de forma inmdediata), invertir los valores
//el primero en el final, el final en el primero y así sucesivamente(Invertir el órden)

package Arrays2;


public class ArrayInverirOrden {
    public static void main(String[] args){
        int numeros[]={1,2,3,4,5};
        int aux[]= new int[numeros.length];
        for(int j=0, i=numeros.length-1; i>=0; i--,j++){
            aux[j] = numeros[i];
            System.out.print(aux[j]);
        }
    }
}
