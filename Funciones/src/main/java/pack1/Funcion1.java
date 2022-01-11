//Crea una funcion que devuelva la suma de dos números, pasados por parámetros

package pack1;


public class Funcion1 {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 4;
        //la función también se puede guardar en una variable del mismo tipo compatible
        System.out.println("El resultado es: " + suma(num1,num2));
    }
    public static int suma(int a, int b){
        return a+b;
    }
}
