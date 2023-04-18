/*
 Crear una clase ParDeNumerosService, en el paquete
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
package Ejercicio2.servicio;

import Ejercicio2.entidad.ParDeNumeros;

/**
 *
 * @author tito
 */
public class ParDeNumerosServicio {
    
    public ParDeNumeros mostrarValores(){ //metodo mostrarValores
        ParDeNumeros num = new ParDeNumeros();      
        return num;
    }
            
    public double devolverMayor(){
        ParDeNumeros pdn = new ParDeNumeros();
        //double num1 = pdn.getN1();
        //double num2 = pdn.getN2();
    
        if (pdn.getN1()>pdn.getN2()) {
            return pdn.getN1();
        }else{
            return pdn.getN2();
        }
    }
    
//Método calcularPotencia para calcular la potencia del mayor valor de
//la clase elevado al menor número. Previamente se deben redondear
//ambos valores.
    public double calcularPotencia(){
        ParDeNumeros pdn = new ParDeNumeros();
        double num1 = Math.round(pdn.getN1());
        double num2 = Math.round(pdn.getN2());
        if (num1>num2) {
            return Math.pow(num1, num2);
        }else{
            return Math.pow(num2, num1);
        }
        //return 0;
    }
}
