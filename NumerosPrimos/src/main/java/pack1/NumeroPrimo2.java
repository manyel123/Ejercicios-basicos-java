package pack1;

import java.util.Scanner;

public class NumeroPrimo2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num;
        boolean primo;
        String respuesta, S, s;
        do{
            primo=true;
            System.out.println("Ingrese un número");
            num = entrada.nextInt();
            for(int i=2; i<num; i++){
                if(num%i==0){
                    primo=false;
                }
            }
            if(primo==false){
                    System.out.println("El número no es primo");
                }
                else{
                    System.out.println("El número es primo");
                }
            System.out.println("¿Desea continuar?");
            respuesta = entrada.next();
        }
        while(respuesta.equals("s") || respuesta.equals("S"));
    }
}
