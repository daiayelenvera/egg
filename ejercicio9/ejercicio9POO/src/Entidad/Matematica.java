/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con los cuales se realizarán diferentes
operaciones matemáticas. La clase deber tener un constructor vacío, parametrizado y get y set. En el main se creará el objeto
y se usará el Math.random para generar los dos números y se guardaran en el objeto con su respectivos set. Deberá además implementar
los siguientes métodos:
ver los videos relacionados con este tema, antes de empezar los ejercicios, los
 podrás encontrar en tu aula virtual o en nuestro canal de YouTube.
 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben 
redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe 
obtener el valor absoluto del número.

 */
package Entidad;

/**
 *
 * @author daiay
 */
public class Matematica {
    
private Double numero1;
private Double numero2;

    public Matematica() {
    }

    public Matematica(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }



}
