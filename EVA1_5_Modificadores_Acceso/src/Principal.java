/*
 * Continuacion de la descripción de clases de objetos 
   Modificadores de acceso para atributos, métodos y clases
   Abtraccion - simplificar
   Encapsulamiento - limitar el acceso
   modificadores de acceso 
   publico ---> todos tienen acceso
   privado ----> Acceso limitado de la clase 
   protected ---> Acceso por herencia
   default --->  
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
        //crear un objeto (crear una instaciia de la clase
        Banco bBank = new Banco();
        bBank.sNombreCliente = "Oscar Aron Romero Camacho";
        bBank.dSaldoCuenta = 1000000000;
        System.out.println("Cliente: " + bBank.sNombreCliente);
        System.out.println("Saldo: " + bBank.dSaldoCuenta);
        
        bBank.dSaldoCuenta = 0;
         System.out.println("Cliente: " + bBank.sNombreCliente);
        System.out.println("Saldo: " + bBank.dSaldoCuenta);
         // OTRO CLIENTE
        Banco bBank2 = new Banco();
    }
    
}
// ABSTRACCIÓN DEL PROBLEMA DE REPRESENTAR UN BANCO
class Banco {
    // EN GENERAL LOS ATRIBUTOS EN CLASE VAN HACER PRIVADOS 
   public String sNombreCliente;
    public double dSaldoCuenta;
}