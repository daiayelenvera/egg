/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Matematica;
import java.util.Scanner;


public class ServicioMatematica {
    
    Scanner leer = new Scanner(System.in);
    Matematica num = new Matematica();
    
    
    public Matematica numeros(){
        
       
        num.setNumero1((Double)(Math.random()*10+1));
        num.setNumero2((Double)(Math.random()*10+1));
        System.out.println("Primer numero: " + num.getNumero1());
        System.out.println("Segundo numero: " + num.getNumero2());
        return num;
        
     
    }
    
    public double devolverMayor(){
        
        double mayor = Math.max(num.getNumero1(), num.getNumero2());
       // System.out.println("El numero mayor es: " + mayor);
        
       /** if (mayor == num.getNumero2()){
            System.out.println("El numero2 es mayor: ");
        } else {
            System.out.println("_____________________");
            System.out.println("El numero1 es el mayor");
        }
        */ return mayor;    
    }
    
    public double calcularPotencia(){
        
    double menor = Math.min(num.getNumero1(), num.getNumero2());
    double potencia = Math.pow(Math.round(devolverMayor()), Math.round(menor));
       // System.out.println(Math.round(devolverMayor()));
       // System.out.println(Math.round(menor));
       System.out.println("La potencia del numero mayor es: " + potencia);
        
        return menor;
        
    }
    
    public double calculaRaiz(){
        
      double raiz = Math.sqrt(Math.abs(Math.round(calcularPotencia())));
        System.out.println("La raiz es: " + raiz);
        return raiz;
    }
    
}
