//Crear una matriz de 5 filas y n columnas(se pide al usuario). Rellenarla con números aleatorios entre 0 y 9

package pack1;

import java.util.Scanner;

public class MatrizAleatoria {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el número de columnas de la matriz");
        int columnas = entrada.nextInt();
        int matriz[][] = new int[5][columnas];
        for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j] = generaNumAleatorio(0,9);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int generaNumAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
}
