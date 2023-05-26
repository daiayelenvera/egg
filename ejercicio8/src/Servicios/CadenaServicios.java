/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaServicios {

    Scanner leer = new Scanner(System.in);
    Cadena fra = new Cadena();

    public Cadena frase1() {

        System.out.println("Ingrese frase");
        fra.setFrase(leer.nextLine());
        fra.setLongitud(fra.getFrase().length());
        return fra;

    }

    public void mostrarVocales() {
        int contador = 0;
        for (int i = 0; i < fra.getLongitud(); i++) {

            switch (fra.getFrase().substring(i, i + 1).toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    contador++;
                    break;
            }
        }
        System.out.println(contador);
    }

    public void invertirFrase() {
        int cont = fra.getLongitud();
        for (int i = 0; i < fra.getLongitud(); i++) {
            System.out.print(fra.getFrase().substring(cont - 1, cont) + " ");
            cont--;
        }
        System.out.println("");
    }

    public void vecesRepetido() {
        int contador = 0;
        System.out.println("Ingresa el caracter que desea buscar");
        String letra = leer.nextLine();
        for (int i = 0; i < fra.getLongitud(); i++) {

            if (fra.getFrase().substring(i, i + 1).equals(letra)) {
                contador++;
            }
        }
        System.out.println("El caracter se repite: " + contador + " veces");
    }

    public void compararLongitud() {
        String frase2;
        System.out.println("Ingresa otra frase");
        frase2 = leer.nextLine();

        int compa = frase2.length();
        System.out.println("La frase1 contiene: " + fra.getLongitud());
        System.out.println("La frase2 contiene: " + compa);
    }

    public void unirFrases() {

        String frase2;
        System.out.println("Ingresa otra frase");
        frase2 = leer.nextLine();
        System.out.println(fra.getFrase().concat(" " + frase2));
    }

    public void reemplazar() {

        String letra2;
        System.out.println("Ingresa Caracter");
        letra2 = leer.nextLine();
        for (int i = 0; i < fra.getLongitud(); i++) {

            if (fra.getFrase().substring(i, i + 1).equals("a")) {
                System.out.print(letra2);
            } else {
                System.out.print(fra.getFrase().substring(i, i + 1));
            }
        }
    }

    public void contiene() {
        boolean contiene = false;
        String letra2;
        System.out.println("Ingresa Caracter que vamos a buscar");
        letra2 = leer.nextLine();

        for (int i = 0; i < fra.getLongitud(); i++) {

            if (fra.getFrase().substring(i, i + 1).equals(letra2)) {
                contiene = true;

            }

        }
        System.out.println("El caracter que ingresaste es: " + contiene);
    }

}

