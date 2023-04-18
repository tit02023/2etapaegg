/*
 Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene 
la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario 
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario 
y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra 
que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
package Ejercicio1.servicio;

import Ejercicio1.entidad.cadena;
import java.util.Scanner;

/**
 *
 * @author tito
 */
public class cadenaServicio {
        // retorna el objeto cadena
    public cadena ingresarFrase(){    
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la frase");
        // creo objeto y doy valor a sus atributos.
        cadena cad = new cadena(sc.nextLine()); 
        return cad;
        
    }
    // todo metodo de clase servicio debe recibir la clase del objeto
    public void mostrarVocales(cadena cad){
        int conta = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
          if(cad.getFrase().substring(i,i+1).equalsIgnoreCase("a")||cad.getFrase().substring(i,i+1).equalsIgnoreCase("e")||cad.getFrase().substring(i,i+1).equalsIgnoreCase("i")||
                  cad.getFrase().substring(i,i+1).equalsIgnoreCase("o")||cad.getFrase().substring(i,i+1).equalsIgnoreCase("u")){
                  conta++;
              
          }  
          
        }
       // System.out.println("mostrar cantidad vocales" + conta); 
    }
    public void invertirFrase(cadena cad){
        for (int i = cad.getLongitud()-1 ; i >=0 ; i--) {
            System.out.print(cad.getFrase().substring(i, i+1));
        
        }
//     public void invertirFrase() {
//        String frase = cad.getFrase();
//        String fraseInvertida = "";
//
//    for (int i = frase.length() - 1; i >= 0; i--) {
//        fraseInvertida += frase.charAt(i);
//    }
//
//    System.out.println("Frase invertida: " + fraseInvertida);
}

    
    public void vecesRepetido(cadena cad, String letra){
        int conta =0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i,i+1).equalsIgnoreCase(letra)){
                conta++;
            }
        }
        System.out.println("la letra se repite " +conta);
        
    }
    public void compararLongitud(cadena cad, String frase){
        if(cad.getLongitud() == frase.length()){
            System.out.println("Las frases tienen la misma longitud");
          
        } else {
            System.out.println("las frases tienen longitudes diferentes");
        }   
        
    }
    public void unirFrases(cadena cad, String frase){
        System.out.println("la frase unida es " +cad.getFrase()+" "+frase);
        
    }
    
    public void reemplazar(cadena cad,String letra){
              
   System.out.println("la nueva frase es " + cad.getFrase().replace("a", letra));  
        }
       
        
    
    public boolean contiene(cadena cad, String letra){
        
        return cad.getFrase().contains(letra);
       
        
    }
    
}
