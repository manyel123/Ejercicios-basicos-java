package pack1;

import java.util.Scanner;

public class Suma {
    public static void main(String[] agrs){
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        System.out.println("Ingrese el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = entrada.nextInt();
        suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + suma);
    }
}
