//Crea un array que contenga las letras del abecedario(En mayúsculas) y que nos permita  
//ir cogiendo las letras de sus posiciones(índice) hasta que insertemos -1(Si no está en el array se vuelve a pedir)
package Arrays1;

import java.util.Scanner;

public class ArrayAbecedarioconASCII {
    public static void main(String[] args){
        char abecedario[] = new char[91-65];//Tamaño del abecedario sin la letra ñ(TAMBIEN SE PUEDE USAR SOLO 26)
        for(int i=0;i<abecedario.length;i++){
            abecedario[i] = (char)(i+65);//65 es la posición en la tabla ASCII de la A
        }
        System.out.println("Ingrese un número entre 0 y " + (abecedario.length-1) + " -1 para acabar");
        Scanner  entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        String cadena = "";
        
        while(num!=-1){
            if(num>=0 && num<=abecedario.length){
                cadena+=abecedario[num];
                System.out.println("Ingrese un número entre 0 y " + (abecedario.length-1) + " -1 para acabar");
            }else{
                System.out.println("Error. Ingrese solo números entre 0 y " + (abecedario.length-1) + " -1 para acabar");
            }
            num = entrada.nextInt();//Pide otro número hasta que el usuiario ingrese -1
        }
        System.out.println("La cadena resultante es: " + cadena);
    }
}
