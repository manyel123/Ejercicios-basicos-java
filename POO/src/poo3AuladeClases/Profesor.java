package poo3AuladeClases;


public final class Profesor extends Persona{/*Persona es clase padre*/
                                      /*Profesor es una extensión de Persona*/
    private String materia;
    
    public Profesor(){
        
        super();/*Llama al constructor de la clase Persona*/
        
        super.setEdad(MetodosSueltos.generaNumAleatorio(25, 50));
        
        materia = Constantes.MATERIAS[MetodosSueltos.generaNumAleatorio(0, 2)];
        
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void disponibilidad() {
        int chance = MetodosSueltos.generaNumAleatorio(0, 100);
        
        if(chance<20){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
    }
}
