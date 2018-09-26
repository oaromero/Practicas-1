
import java.util.Scanner;

/*
 *Fue capturar el nombre y el uso de la las clases para la realización
 * y dar un saludo al usuario
 */

/**
 *
 * @author Oscar Aron Romero Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        saludaUsuario();
        
        // ejemplo 2
        String sNombre = capturaNombre();
        imprimeSaludo(sNombre);
        // simplifica
        imprimeSaludo(capturaNombre());
        recursividad();
        
    }
    // NECESITAMOS QUE UNA FUNCION SALUDO
    public static void saludaUsuario(){
        Scanner input = new Scanner(System.in);
        System.out.println("Cual es tu nombre: ");
        String sCade = input.nextLine();
        System.out.println("Hola " + sCade);
    }
   //saludo separado
   // función para capturar el nombre del usuario y regresarlo
    public static String capturaNombre(){
           Scanner input = new Scanner(System.in);
        System.out.println("Cual es tu nombre: ");
        String sCade = input.nextLine();
        return sCade;
    }
  // función para imprimir un saludo
    public static void imprimeSaludo(String nombre){
        System.out.println("Hola " + nombre);
    }
    public static void recursividad(){
        System.out.println("Ups");
        //recursividad(); 
        saludaUsuario();
    }
}
           
    

