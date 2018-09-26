/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author Oscar Romero
 */
public class MejorBanco {
    //ATRIBUTOS DE LA CLASE
    //SIEMPRE TIENE QUE SER PRIVADOS 
    private String nombre;
    private double saldo;
    
    // siempre debe existir un intermediario con los datos
    // intermediario son metodos: 
    //get (lectura) y set (escritura)
    //METODOS:
    // NIVEL DE ACCESO - VALOR DE RETORNO - NOMBRE (VARIABLES DE ENTRADA)
    // lEER DATOS DE NUESTRA CLASE
    // COMPORTAMIENTO DE LA CLASE
    // TODO MÉTODO PUBLICO DE LA CLASE ES LA INTERFAZ DE COMUNICACIÓN LA CLASE.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   // this es 
           
}
