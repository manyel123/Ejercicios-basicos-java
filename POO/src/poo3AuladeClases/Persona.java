package poo3AuladeClases;

public abstract class Persona {/*abstract indica que esta clase no crea ningun objeto, todos los métodos pueden ser usados
    pero nunca vamos a crear un objeto persona. Usamos el método asbtracto disponibilidad() para verificar la asistencia*/
    
    private String nombre;
    private char genero;
    private int edad;
    private boolean asistencia;
    
    public Persona(){
        
        int asigna_genero=MetodosSueltos.generaNumAleatorio(0, 1);
            
        if(asigna_genero==Constantes.NINO){
            nombre=Constantes.NOMBRE_NINO[MetodosSueltos.generaNumAleatorio(0, 4)];
            genero = 'M';
        }else{
            nombre=Constantes.NOMBRE_NINA[MetodosSueltos.generaNumAleatorio(0, 4)];
            genero = 'F';
        }
        disponibilidad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
    
    public abstract void disponibilidad();
}
