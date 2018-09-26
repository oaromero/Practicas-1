
import MisClases.Banco;
import MisClases.MejorBanco;

/*
 * Clase Banco para ejemplificar uso de atributos
   metodos y modificadores de acceso.
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
        Banco bMiCuenta = new Banco();
        bMiCuenta.nombre = "Oscar Aron Romero Camacho";
        bMiCuenta.saldo = 10000;
        System.out.println("INFORMACIÓN DE LA CUENTA");
        System.out.println("Titular: " + bMiCuenta.nombre);
        System.out.println("Saldo: "+ bMiCuenta.saldo);
        //Cambio de banco, no es seguro
        MejorBanco mMejorCuenta = new MejorBanco();
        mMejorCuenta.setNombre("Oscar Aron Romero Camacho");
        mMejorCuenta.setSaldo(100000);
        System.out.println("Mi nueva cuenta en un mejor banco");
        System.out.println("Titular: " + mMejorCuenta.getNombre());
        System.out.println("Saldo: " + mMejorCuenta.getSaldo());
        
    }
    
}
