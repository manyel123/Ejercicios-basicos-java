//Mostrar los números del 1 al 100 que sean exáctamente divisibles entre 2 y 3(ambos)

package pack1;


public class ForCondicionado {
    public static void main(String[] args){
        for(int contador=1; contador<=100; contador++){
            if(contador%2==0 && contador%3==0){
                System.out.println(contador);
            } 
        }
    }
}
