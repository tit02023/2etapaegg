/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import Ejercicio5.entidad.Persona;
import Ejercicio5.servicio.PersonaServicio;
import java.util.Date;

/**
 *
 * @author tito
 */
public class PersonaMain {
    
    public static void main(String[] args) {
        
        PersonaServicio ps = new PersonaServicio();
        
        Date fecha = new Date(); //Date crea la fecha actual en fecha
        Persona p = ps.crearPersona(); //ser crea un objeto de tipo p para guardar los datos de que se traen de PersonaServicio
        //ps.calcularEdad(p.getFechaNacimiento(), fecha);
        System.out.println("La edad de la persona es: " + ps.calcularEdad(p.getFechaNacimiento(), fecha));
        System.out.println("la edad es menor?: " + ps.menorQue(p, ps.calcularEdad(p.getFechaNacimiento(), fecha)));
        System.out.println("Los datos de la persona son: " + ps.mostrarPersona(p));
        //System.out.println("la edad es: " + ps.calcularEdad(p.getFechaNacimiento(), fecha));
    }
    
}
