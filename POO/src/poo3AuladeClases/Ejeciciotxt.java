/*Queremos representar con programación orientada a objetos, un aula con estudiantes y un profesor.
Tanto de los estudiantes como de los profesores necesitamos saber su nombre, edad y sexo.
De los estudiantes, queremos saber su calificación actual(entre 0 y 10) y del profesor que materia enseña.

Las materias disponibles son matemáticas, filosofía y física.

Los estudiantes tendrán un 50% de hacer novillos, por lo cual si hacen novillos no van a clase
pero aunque no vallan a clase quedará registrado en el aula(como que cada uno ocupa o no su lugar).

El profesor tiene un 20% de no encontrarse disponible(reuniones, baja, etc).

Las dos operaciones anteriores deben llamarse igual en Estuadiante y Profesor(Polimorfismo).

El aula debe tener un identificador numérico, el número máximo de estudiantes y para qué está
destinada(Matemáticas, filosofía o física). Piensa que otros atributos necesita.

Para que se pueda dar clase en un aula, se necesita que el profesor esté disponible, que el profesor de cada materia
se encuentre en aula correspondiente a la misma(Un profesor de filosofía no puede dar clases en un aula de matemáticas)
y que halla mas del 50% de alumnos.

El objetivo es crear un aula de alumnos y un profesor y determinar si puede darse clase, teniendo en cuenta las 
condiciones antes dichas.

Si se puede dar clase, mostrar cuantos alumnos y alumnas(Por separado) están aprobados de momento(imagine que les
están entregando las notas).

NOTA:Los datos pueden ser aleatorios(Nombres, edad, calificaciones, etc.) siempre y cuando tengan sentido(edad no puede ser 80
en un estudiante o calificación ser 12).*/


package poo3AuladeClases;


public class Ejeciciotxt {

}
