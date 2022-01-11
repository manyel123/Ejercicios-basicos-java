//Crear un array que contenga los números del 1 al 100. Muestrelos por consola.
//Con el array creado anteriormente calcule la suma y la media de todos sus valores

package Arrays1;


public class SumaMediaArrayBasico {
    public static void main(String[] args){
        int array[] = new int[100];
        int suma = 0;
        double media = 0;
        for(int i=0;i<array.length;i++){
            array[i] = i+1;
            suma += array[i];
        }            
        System.out.println("La suma es " + suma);
        media = (double)suma/array.length;
        System.out.println("La media es " + media);
    }
}
