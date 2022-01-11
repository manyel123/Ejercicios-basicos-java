//Crea una función que indique si un número es mayor o menor que cero

package pack1;


public class Funcion2 {
    public static void main(String[] args){
        int numero=-5;
        if(mayorQue0(numero)){
            System.out.println("El número " + numero + " es mayor que cero");   
        }else{
            System.out.println("El número " + numero + " es menor o igual que cero");
        }  
    }
    public static boolean mayorQue0(int num){
        return num>0; //No es necesario if; retorna solo en caso de num mayor a cero
    }
}
