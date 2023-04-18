/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtra1;

import EjercicioExtra1.entidad.raices;
import EjercicioExtra1.servicio.raicesservicio;

/**
 *
 * @author tito
 */
public class raicesMain {
    
    public static void main(String[] args) {
        raices raiz = new raices(-4, 5, 7);
        raicesservicio rs = new raicesservicio();
        rs.getDiscriminante(raiz);
        System.out.println("----------------------------------------------------");
        rs.tieneRaices(raiz);
        System.out.println("----------------------------------------------------");
        rs.tieneRaiz(raiz);
        System.out.println("----------------------------------------------------");
        rs.obtenerRaices(rs.tieneRaices(raiz), raiz);
        System.out.println("----------------------------------------------------");
        rs.obtenerRaiz(rs.tieneRaiz(raiz), raiz);
        System.out.println("-----------------------------------------------------");
        rs.calcular(rs.tieneRaices(raiz),rs.tieneRaiz(raiz));
   } 
    
}
