//Crear dos matrices de nxn y sumas sus valores, los resultados se deben almacenar en otra matriz
//Los valores y la longitud serán ingresados por el usuario. Mostrar las matrices originales y el resultado

package pack1;

import java.util.Scanner;

public class MatrizNxN {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la matriz n x n");
        int tamanio = entrada.nextInt();
        
        int matriz1[][] = new int[tamanio][tamanio];
        int matriz2[][] = new int[tamanio][tamanio];
        
        int resultado[][] = new int[tamanio][tamanio];
        
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[0].length;j++){
                
                System.out.println("Escriba un valor para la fila " + i + " y columna " + j + " de la matriz 1");
                matriz1[i][j] = entrada.nextInt();
                
                System.out.println("Escriba un valor para la fila " + i + " y columna " + j + " de la matriz 2");
                matriz2[i][j] = entrada.nextInt();
                
                resultado[i][j] = matriz1[i][j]+matriz2[i][j];
            }
        }
        System.out.println("Matriz 1");
        mostrarMatriz(matriz1);
        
        System.out.println("Matriz 2");
        mostrarMatriz(matriz2);
        
        System.out.println("Suma de las matrices");
        mostrarMatriz(resultado);
    }
    public static void mostrarMatriz(int [][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
