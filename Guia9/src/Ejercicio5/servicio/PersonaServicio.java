/*
 Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 */
package Ejercicio5.servicio;

import Ejercicio5.entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tito
 */
public class PersonaServicio {
    
    //metodo que retorna el ojbeto persona
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        String nom = leer.nextLine();
        System.out.println("Ingrese el dia de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int anio = leer.nextInt();
        Date fn = new Date(anio-1900, mes-1, dia);
        Persona p = new Persona(nom, fn);
        return p;
    }
    
    public int calcularEdad(Date fechaNac, Date fechaAct){ //al metodo calcularEdad se le pasan parametros
     //para calcualar la edad, en este caso edadNac y fa (fecha actcual)   
        int edadNac = fechaNac.getYear();
        int fa = fechaAct.getYear();
        int edad = fa-edadNac;
        System.out.println("La edad de la persona es: " + edad);
        return edad;
    }
    //Método menorQue recibe como parámetro una Persona y una edad
    public boolean menorQue(Persona p, int edad){
        //boolean edadp = true;
        //Date fecha = new Date(); //devuelve la fecha actual
        //int edadper = calcularEdad(p.getFechaNacimiento(), fecha);
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la edad a consultar: ");
        int edadper = leer.nextInt();
        if (edadper<edad) {
            return true;
        }else {
            return false;
        }
    }
    
    public void mostrarPersona(){
        System.out.println("Los datos de la persona son: ");
    }
}
