//Realizar la suma del 1 al número que indiquemos, este debe ser mayor que 1

package pack1;

import java.util.Scanner;

public class DoWhileCondicionado {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número mayor que 1");{
        int num;
        do{
            num = entrada.nextInt();
            if(num<=1){
                System.out.println("Error. No has introducido un valor correcto. "
                        + "Vuelve a intentarlo");
            }
        }while(!(num<=1)); //Siempre es falso en do-while
        int suma = 0;
        for(int contador=1; contador<=num; contador++){
            suma+=contador;
            //suma=suma+contador;
        }
        System.out.println("La suma es: " + suma);
    }
    }
}
