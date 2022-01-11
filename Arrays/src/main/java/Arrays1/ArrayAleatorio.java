//Crea un array insertando números aleatorios entre 0 y 10(Incluidos). Muestrelos en consola.

package Arrays1;

import java.util.Scanner;

public class ArrayAleatorio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la longitud del array");
        int longitud = entrada.nextInt();
        int numeros[] = new int[longitud];
        int num;
        for(int i=0;i<numeros.length;i++){
            numeros[i] = generaNumAleatorio(0,10);
            System.out.println("En la posición " + i + " está el valor " + numeros[i]);
        }
    }
    public static int generaNumAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }              //Quita decimales           //establece limites del numero aleatorio
}                 //para regresar entero       //+1 es para que pueda tomar el 10 como posible aleatorio

