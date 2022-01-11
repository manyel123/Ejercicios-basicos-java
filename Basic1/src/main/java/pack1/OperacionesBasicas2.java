//Realiza la suma, resta, multiplicación, división y residuo de 2 números

package pack1;


public class OperacionesBasicas2 {
    public static void main(String[] args){
        int a=5;
        int b=2;
        int suma=a+b;
        int resta=a-b;
        int multiplicacion=a*b;
        double division=(double)a/b;
        int residuo=a%b;
        System.out.println("La suma de a y b es:" + suma);
        System.out.println("La resta de a y b es:" + resta);
        System.out.println("La multiplicacion de a y b es:" + multiplicacion);
        System.out.println("La division de a y b es:" + division);
        System.out.println("El residuo de la division de a y b es:" + residuo);
    }
}
