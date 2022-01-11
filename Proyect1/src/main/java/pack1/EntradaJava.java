package pack1;

public class EntradaJava
{   
    public static String saludar(String nombre)
    {
        //Se crea el mensaje de saludo
        String saludo = "Hola. Bienvenido " + nombre;

        return saludo;//Se retorna el saludo
    }

    public static String error(String nombre)
    {
        //Se crea el mensaje de error
        String error = "Ups. No pudimos validar tus datos. " + nombre + " es tu usuario?";

        return error; //Se retorna el error
    }

    public static void verificar(String usuario, String contrasenia)
    {
        String usuarioValido = "JuanDMeGon";

        String contraseniaValida = "MiPass";

        //Se validan los datos
        if(usuarioValido.equals(usuario) && contraseniaValida.equals(contrasenia))
        {
            //Si son validos se llama ala función saludar y se muestra el mensaje retornado por pantalla
            System.out.println(saludar(usuario));
            return; //Terminamos la ejecución
        }
        //Si no son válidos entonces mostramos el mensaje de error de la funcion error.
        System.out.println(error(usuario));
    }

    public static void main(String[] args)
    {
        String usuario = "Juan";
        String contrasenia = "pass";

        //Se hace la verificación
        verificar(usuario, contrasenia);

        //Mostrará el mensaje error.
    }   
}