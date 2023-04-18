/*
 Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
 */
package Ejercicio2;

import Ejercicio2.entidad.ParDeNumeros;
import Ejercicio2.servicio.ParDeNumerosServicio;

/**
 *
 * @author tito
 */
public class ParDeNumerosMain {
    
    public static void main(String[] args) {
        
    ParDeNumerosServicio pdns = new ParDeNumerosServicio();
    
    ParDeNumeros num = pdns.mostrarValores();
    
    System.out.println("los numeros a mostrar son N1: " + num.getN1());
    System.out.println("los numeros a mostrar son N2: " + num.getN2());
    //System.out.println(num.toString());
    System.out.println("El mayor valor es: " + pdns.devolverMayor());
    
    System.out.println("La potencia es: " + pdns.calcularPotencia());
}
    
}
