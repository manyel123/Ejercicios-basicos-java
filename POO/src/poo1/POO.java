//Crear una clase Libro que contenga los siguientes atributos:
//ISBN-Titulo-Autor-Numero de páginas
//Crear sus respectivos métodos get y set correspondientes para cada atributo
//Crear el método toString() para mostrar la información respectiva al libro con el siguiente formato:
//      "El libro <su_titulo>" con ISNB <su_ISBN> creado por el autor <su_autor> tiene <num_paginas> páginas.
//En el fichero main, crear 2 objetos Libro (con los valores que se quieran) y mostrarlos por pantalla
//Por último, indicar cual de los dos tiene mas páginas

package poo1;

public class POO {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro(1111111, "titulo1", "autor1", 30);
      //Clase-Nombre   new Clase(parámetros)
        Libro libro2 = new Libro(2222222, "titulo2", "autor2", 60);
        
        libro1.setNumPaginas(80);
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        if(libro1.getNumPaginas()>libro2.getNumPaginas()){
            System.out.println(libro1.getTitulo() + " tiene más páginas");
        }else{
            System.out.println(libro2.getTitulo() + " tiene más páginas");
        }
    }
    
}
