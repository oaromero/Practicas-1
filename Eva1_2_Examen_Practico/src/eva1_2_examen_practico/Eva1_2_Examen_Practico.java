/*
 * 
 * Práctica Del Examen Diagnóstico,ingresar una varible dar a un resultado (mes).
 * 
 */
package eva1_2_examen_practico;

import java.util.Scanner;

/**
 *
 * @author Oscar Aron Romero Camacho
 */
public class Eva1_2_Examen_Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sCaptu = new Scanner(System.in); //variable para captura del teclado 
       //Scanner es una clase para facilitar la lectura del teclado
       //System.in es la entrada de perifericos de java
        System.out.println("Introduce un numero del 1 al 12");
       int dast = sCaptu.nextInt();
       // lo que el Usuario teclee, lo convertiremos en un entero.
       switch(dast) {
           case 1:
               System.out.println("Enero");
               break;
                case 2:
               System.out.println("Febrero");
               break;
                case 3:
               System.out.println("Marzo");
               break;
                case 4:
               System.out.println("Abril");
               break;
                case 5:
               System.out.println("mayo");
               break;
                case 6:
               System.out.println("JUnio");
               break;
                case 7:
               System.out.println("Julio");
               break;
                case 8:
               System.out.println("Agosto");
               break;
                case 9:
               System.out.println("Septiembre");
               break;
                case 10:
               System.out.println("Octubre");
               break;
                case 11:
               System.out.println("Noviembre");
               break;
                case 12:
               System.out.println("Diciembre");
               break;
                default: //siempre al final 
                    System.out.println("No existe ese mes");
       }
    }
    
}
