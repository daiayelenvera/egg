/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9poo;

import Entidad.Matematica;
import Servicios.ServicioMatematica;

/**
 *
 * @author daiay
 */
public class Ejercicio9POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioMatematica sm = new ServicioMatematica();
        Matematica matematica1 = sm.numeros();
        sm.devolverMayor();
         System.out.println("_____________________");
        sm.calcularPotencia();
        System.out.println("_____________________");
        sm.calculaRaiz();
        
        
    }
    
}
