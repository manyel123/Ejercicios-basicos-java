/*Vamos a realizar una clase llamada raices, donde representaremos los valores de una ecuación de segundo grado
Tendremos los 3 coeficientes como atributosm, llamandolos a, b,  y c. Hay que insertar estos 3 valos para conseguir el objeto
Las operaciones que se podrán realizar son las siguientes:
-obtenerRaices() imprime las 2 posibles soluciones
-obtenerRaiz() imprime una única raízm, que será cuando solo tenga una solución posible
-getDiscriminante() devuelve el valor del discriminante(double), el discriminante tiene la siguiente fórmula, b^2-4ac
-tieneRaices() devuelve un booleano si tiene dos soluciones, para que esto ocurra el discriminante debe ser mayor o igual a cero
-tieneRaiz() devuelve un booleano indicando si tiene una única solución, para que esto ocurra el discriminante debe ser igual a cero
-calcular() mostrará por consola las posibles soluciones que tiene nuestra ecuación, en caso de no tener solución, mostrarlo también
Formula de ecuación de 2° Grado   (-b+-sqrt(b^2-4ac))/2a*/

package poo2;


public class RaicesEcuaciones {
    
    public static void main(String[]args){
        
        Raices ecuacion = new Raices(1,2,5);
        ecuacion.calcular();
    }
}
