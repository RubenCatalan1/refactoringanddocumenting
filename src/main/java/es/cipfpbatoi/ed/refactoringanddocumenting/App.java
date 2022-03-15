package es.cipfpbatoi.ed.refactoringanddocumenting;

/**
 * Hello world!
 *
 */
public class App 
{
	public static boolean esMayorEdad(int edad)
	{
		return edad >= 18;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Bienvenido al Programa" );
        
        Estudiante es = new Estudiante(10,"pepe");
        
        if ( esMayorEdad (es.edad) ) {
        	System.out.println("El estudiante " + es.nombre + " es mayor de edad");
        } else {
        	System.out.println("El estudiante " + es.nombre + " es menor de edad");
        }
        
    }
}
