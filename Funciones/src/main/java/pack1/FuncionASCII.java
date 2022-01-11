//Crea una función que nos devuelva el número ASCII de un caracter pasado por parámetro

package pack1;


public class FuncionASCII {
    public static void main(String[] args){
        char caracter='a';
        System.out.println("El caracter " + caracter + " está asocioado "
                + "al código ASCII " + devuelveCodigoASCII(caracter));
    }
    public static int devuelveCodigoASCII(char caracter){
        return (int)caracter;
    }
}
