
import Otropaquete.Main;

/*
 * Demostracción de niveles de acceso public, private, protected, defautl
 */

/**
 *
 * @author Oscar Aron Romero Camacho
 */
public class Principal {
    public int iPublico = 10;
    private int iPrivado = 20;
    protected int iProtected = 30;
    int iDefault = 40;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal pPrincipal = new Principal();
        System.out.println(pPrincipal.iPublico);
        System.out.println(pPrincipal.iPrivado);
        System.out.println(pPrincipal.iProtected);
        System.out.println(pPrincipal.iDefault);
        
        Default dDefault = new Default();
        System.out.println(dDefault.iPublico);
        System.out.println(dDefault.iProtected);
        System.out.println(dDefault.iDefault);
        
        Secundaria sSecundaria = new Secundaria();
        System.out.println(sSecundaria.iPublico);
        System.out.println(sSecundaria.iProtected);
        System.out.println(sSecundaria.iDefault);

        DefaulSecun dDefaultSecun = new DefaulSecun();
        System.out.println(dDefaultSecun.iPublico);
        System.out.println(dDefaultSecun.iProtected);
        System.out.println(dDefaultSecun.iDefault);
        
        Main mMain = new Main();
        System.out.println(mMain.iPublico);
        
        DefaultMain dDefaultMain = new DefaultMain();
        
        
    }

    private static class DefaultMain {

        public DefaultMain() {
        }
    }
    
}
class Default{
     public int iPublico = 10;
    private int iPrivado = 20;
    protected int iProtected = 30;
    int iDefault = 40;
}
