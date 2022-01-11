//Crea una función que devuelve un número aleatorio que se encuentre entre dos números enteros establecidos por nosotros

package pack1;


public class NumerosAleatorios {
    public static void main(String[] args){
        int min = 0;
        int max = 10;
        for(int i=0; i<=100; i++){
        System.out.println(generaNumAleatorio(min,max));
        }
    }
    public static int generaNumAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }         //Quita decimales           //establece limites del numero aleatorio
}            //para regresar entero       //+1 es para que pueda tomar el 10 como posible aleatorio
