package pack1;

import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int serie;
        int anterior=0;
        int actual=1;
        int fibo=0;
        System.out.println("Ingrese el número de la serie fibonacci a calcular");
        serie = entrada.nextInt();
        switch (serie) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("0");
                System.out.println("1");
                break;
            default:
                System.out.println("0");
                System.out.println("1");
                for(int i=2; i<=serie;i++){
                    fibo = (anterior + actual);
                    anterior = actual;
                    actual = fibo;
                    System.out.println(fibo);
                }   break;
        }
    }
}
