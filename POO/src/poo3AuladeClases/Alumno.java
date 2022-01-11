package poo3AuladeClases;


public final class Alumno extends Persona{/*Persona es clase padre*/
                                    /*Alumno es una extensión de Persona*/
    private int nota;
    
    public Alumno(){
        
        super();/*Llama al constructor de la clase padre*/
        
        nota = MetodosSueltos.generaNumAleatorio(0, 10);
        
        super.setEdad(MetodosSueltos.generaNumAleatorio(12, 15));/*super llama los métodos de la clase padre(Persona)*/
        
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public void disponibilidad() {
        
        int chance = MetodosSueltos.generaNumAleatorio(0, 100);
        
        if(chance<50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
    }
    @Override
    public String toString(){
        
        return "Nombre:" + super.getNombre() + ", Gen:" + super.getGenero() + ", nota:" + nota;
    }
}
