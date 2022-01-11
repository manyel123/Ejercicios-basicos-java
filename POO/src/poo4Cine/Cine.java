package poo4Cine;


public class Cine {
    
    private Asiento asientos[][];
    private double precio;
    private Pelicula pelicula;
    
    public Cine(int filas, int columnas, double precio, Pelicula pelicula){
        
        asientos = new Asiento[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        ocuparAsientos();
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    private void ocuparAsientos(){/*Es privado, solo esta clase puede acceder a este método*/
        
        int fila = asientos.length;
        for(int i=0;i<asientos.length;i++){
            for(int j=0;j<asientos[0].length;j++){
                
                asientos[i][j] = new Asiento((char)('A'+j),fila);/*Hace un casting(char) para que las columnas cambien de letra*/
            }
            fila--;
        }
    }
    
    public boolean hayAsientos(){
        boolean hayAsientos = false;
        for(int i=0;i<asientos.length && !hayAsientos;i++){
            for(int j=0;j<asientos[0].length && !hayAsientos;j++){
                if(!asientos[i][j].ocupado()){
                    hayAsientos = true;
                }
            }
        }
        return hayAsientos;
    }
    
    public boolean verificarAsientoOcupado(int fila, char columna){
        return asientos[asientos.length-fila][columna - 'A'].ocupado();
    }
    
    public boolean tieneEdad(Asiento asiento){
        if(asiento.ocupado()){
            if(){
                
            }
        }
    }
}
