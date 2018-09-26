
import java.util.Scanner;

/*
 * metodos de lenguaje de programacion paradigma 
 * paradigma estructurado
 * Dentro de funciones y metodos estáticos
 * solo se puede 
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
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        double dBase = input.nextDouble();
        System.out.println("Introduce altura: ");
        double dAltura = input.nextDouble();
        // se llama función 
       double dArea = calculaArea(dBase, dAltura);
        System.out.println("El area es: " + dArea);
        double dArea2 = calculaArea(100, 200);
        System.out.println("El area es: " + dArea2);
        
        System.out.println("El area es: " + calculaArea(10.2, 5.3));
        calculaArea(5, 7);
                
    }
   
    //FUNCION CALCULA ÁREA DE TRÍANGULO
    // modificador de acceso || tipo retorno || nombre valores
    // declaracion  o cevera de la funcion
    public static double calculaArea (double dBase, double dAltura){
      // implemnetacion de la función
      double dArea  = (dBase * dAltura)/2;
      return dArea;
    }
}
