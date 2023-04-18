/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import Ejercicio4.servicio.DateServicio;
import java.util.Date;

/**
 *
 * @author tito
 */
public class dateMain {
    
    public static void main(String[] args) {
        
        DateServicio ds = new DateServicio();
        Date datos = ds.fechaNacimiento();
        System.out.println("Fecha de nacimiento es: " + datos);
        Date fechaActual = ds.fechaActual();
        System.out.println("La fecha actual es: " + fechaActual);
        ds.diferencia(fechaActual, datos);
    }
}
