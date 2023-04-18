/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: 
- numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
package Ejercicio1;

import Ejercicio1.entidad.cuentaBancaria;
import Ejercicio1.servicio.cuentaBancariaServicio;
import java.util.Scanner;


public class cuentaBancariaMain {
    
    public static void main(String[] args) {
        cuentaBancariaServicio cservicio = new cuentaBancariaServicio();
        
        cuentaBancaria cuenta = cservicio.crearCuenta();
        System.out.println(cuenta);
        System.out.println("Ingrese una cantidad de dinero: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double ingreso = leer.nextDouble();
        
        cservicio.ingresar(ingreso, cuenta);
        cservicio.consultarSaldo(cuenta);
        
        System.out.println("Ingrese la cantidad de dinero a retirar: ");
        double retirar = leer.nextDouble();
        
        cservicio.retirar(retirar, cuenta);
        cservicio.consultarSaldo(cuenta);
        
        System.out.println("Ingrese la cantidad a retirar por extraccion rapida: ");
        double erapida = leer.nextDouble();
        
        cservicio.extraccionRapida(erapida, cuenta);
        cservicio.consultarSaldo(cuenta);
        
        cservicio.consultarDatos(cuenta);
        
        
    }
    
}
