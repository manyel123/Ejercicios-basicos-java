package poo3AuladeClases;


public class Aula {
    
    private final int id;           /*Atributo necesario en la clase Aula*/
    private final Profesor profesor;/*Atributo necesario en la clase Aula*/
    private final Alumno[] alumnos; /*Atributo necesario en la clase Aula*/
    private final String materia;   /*Atributo necesario en la clase Aula*/
    
    private final int MAX_ALUMNOS = 20;
    
    public Aula(){
        
        id = 1;
        
        profesor = new Profesor();
        
        alumnos = new Alumno[MAX_ALUMNOS]; /*Alumno es un arreglo[MAX_ALUMNOS] establece el número máximo de alumnos en el aula*/
        creaAlumnos();/*Crea a los 20 alumnos con sus respectivos atributos*/
                
        materia = Constantes.MATERIAS[MetodosSueltos.generaNumAleatorio(0, 2)];
        
    }
    
    private void creaAlumnos(){
        
        for(int i=0;i<alumnos.length;i++){
            
            alumnos[i] = new Alumno(); /*Crea a cada alumno con sus respectivos atributos*/
        }  
    }
    
    private boolean asistenciaAlumnos(){
        
        int contarAsistencia = 0;
        for(int i=0; i<alumnos.length; i++){
            if(alumnos[i].isAsistencia()){
                contarAsistencia++;
            }
        }
        System.out.println("Hay " + contarAsistencia + " alumnos");
        return contarAsistencia>=((int)(MAX_ALUMNOS/2));
    }
    
    public boolean darClase(){
        
        if(!profesor.isAsistencia()){
            System.out.println("El profesor no está, no se puede dar clase.");
            return false;
        }else if(!profesor.getMateria().equals(materia)){
            System.out.println("El profesor no puede dar clase en esta aula, no se puede dar clase.");
            return false;
        }else if(!asistenciaAlumnos()){
            System.out.println("El número de alumnos no es suficiente, no se puede dar clase"); 
            return false;
        }
        System.out.println("Se puede dar la clase");
        return true;
    }
    
    public void notas(){
        
        int ninoAprob = 0;
        int ninaAprob = 0;
        
        for(int i=0; i<alumnos.length; i++){
            
            if(alumnos[i].getNota()>=5 && alumnos[i].isAsistencia()){ /*Evalua que se cumpla la nota y la asistencia del alumno*/
                if(alumnos[i].getGenero()=='M'){
                    ninoAprob++;
                }else{
                    ninaAprob++;
                }
                System.out.println(alumnos[i].toString());
            }
        }
        
        System.out.println("Hay " + ninoAprob + " niños y " + ninaAprob + " niñas aprovad@s");
    }
}
