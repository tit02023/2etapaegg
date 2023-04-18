/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
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
package Ejercicio1.servicio;

import Ejercicio1.entidad.cuentaBancaria;
import java.util.Scanner;


public class cuentaBancariaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public cuentaBancaria crearCuenta() {
        System.out.println("Ingrese el número de cuenta: ");
        int nrodecuenta = leer.nextInt();
        System.out.println("Ingrese el dni del cliente: ");
        long dni = leer.nextLong();
        System.out.println("Ingrese el saldo actual: ");
        double saldo = leer.nextDouble();
        
        return new cuentaBancaria(nrodecuenta, dni, saldo);
        
       
}
    public void ingresar(double ingreso, cuentaBancaria cuenta){
        cuenta.setSaldoActual(cuenta.getSaldoActual()+ ingreso);
        
        
    }
    
    public void retirar(double retiro, cuentaBancaria cuenta){
        
        if(cuenta.getSaldoActual()<retiro){
            System.out.println("El saldo es insuficiente, solo se le entregara el dinero disponible en saldo");
            System.out.println("El saldo es: " + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        }else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
           
        }
    }
    
    public void extraccionRapida( double erapida, cuentaBancaria cuenta){
        System.out.println("Por este metodo solo podra extraer el 20% del saldo");
        double veinteporciento = cuenta.getSaldoActual()*(0.20);
        if (erapida > veinteporciento) {
            System.out.println("Lo lamento, no se puede retirar ese monto, solo puede retirar el 20%: " + veinteporciento);
        }else{
            System.out.println("Se le entregara el dinero solicitado");
            cuenta.setSaldoActual(cuenta.getSaldoActual()-erapida);
            
        }
        
    }
    
    public void consultarSaldo(cuentaBancaria cuenta){
        System.out.println("El saldo actual es: " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(cuentaBancaria cuenta){
        System.out.println("Los datos de la cuenta son: ");
        System.out.println("----------------------------");
        System.out.println("Nro de cuenta:" + cuenta.getNumeroCuenta());
        System.out.println("DNI:" + cuenta.getDniCliente());
        System.out.println("Saldo actual:" + cuenta.getSaldoActual());
    }
}
