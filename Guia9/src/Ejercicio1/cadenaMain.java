
package Ejercicio1;

import Ejercicio1.entidad.cadena;
import Ejercicio1.servicio.cadenaServicio;
import java.util.Scanner;

/**
 *
 * @author tito
 */
public class cadenaMain {
    
    public static void main(String[] args) {
        
    
        // variable es un del tipo cadena y guarda todo lo que tenga la clase
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String letra; 
        String frase1;
        String caracter;
        cadena cadenabis;
        
        cadenaServicio cads = new cadenaServicio();
        cadenabis = cads.ingresarFrase();
        System.out.println(cadenabis.toString());
        cads.mostrarVocales(cadenabis);
        cads.invertirFrase(cadenabis);
        System.out.println(" ");
        
        System.out.println("Ingrese la letra a buscar");
        letra = sc.next();
        cads.vecesRepetido(cadenabis, letra);
        
        System.out.println("Ingrese otra frase");
        frase1 = sc.next();
        cads.compararLongitud(cadenabis, frase1);
    
        cads.unirFrases(cadenabis, frase1);
        
        System.out.println("Ingrese caracter a reemplazar");
        caracter = sc.next();
        
        cads.reemplazar(cadenabis, caracter);
        
        System.out.println("Ingrese una letra para saber si la frase la contiene");
        letra = sc.next();
        System.out.println(cads.contiene(cadenabis, letra));
       
    }
}
    

