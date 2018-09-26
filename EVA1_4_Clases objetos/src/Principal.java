
import java.util.Scanner;

/*
 * Uso de una clase y la declaracion de las varibles 
 * y muestra de función de metodos
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
        // Instanciar La clase persona -->
        //1.- Los objectos son identidicadores (variables)
        int iVal; // DECLARA
        persona pPersonal; // DECLARACIÓN
        // INSTANCIAR = ASIGNAR VALOR (MEMORIA) -> NEW
        iVal =10;
        pPersonal = new persona(); // AQUI SI EXISTE
        System.out.println("Introduce tu nombre: ");
        Scanner sCaptu = new Scanner(System.in);
        pPersonal.nombre = sCaptu.nextLine();
        System.out.println(pPersonal.nombre);
        
        persona pPersona2 = new persona();
        System.out.println("Introduce tu nombre: ");
        pPersona2.nombre = sCaptu.nextLine();
        System.out.println(pPersona2.nombre);
        System.out.println("Introduce ru apellido");
        pPersona2.apellido = sCaptu.nextLine();
        System.out.println(pPersona2.apellido);
        System.out.println("Tu Nombre Completo es: " + 
                pPersona2.nombre + " " + pPersona2.apellido);
        pPersona2.imprimeNombreCompleto();
        // Define el comportamiento del objeto
    }
    
    
}
class persona{
    // ATRIBUTOS DE LA CLASE
    // DETERMINAN EL ESTADO DEL OBJETO
    String nombre;
    String apellido;
    int edad;
    String RFC;
    String genero;
    int estadoNaci;
    String ciudad;
    String estadoCivil;
    // COMPORTAMIENTO DE LA CLASE
    // METODOS Y/O FUNCIONES
    //NIVEL DE ACCESO  | VALOR DE RETORNO | NOMBRE (ARGUMENTOS)
    public void imprimeNombreCompleto(){
        // el primero siempre minusculas
        System.out.println(nombre + " " + apellido);
    }
}