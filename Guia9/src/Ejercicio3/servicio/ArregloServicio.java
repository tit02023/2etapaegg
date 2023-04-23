/*
 Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales.
Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
 */
package Ejercicio3.servicio;


import Ejercicio3.entidad.Arreglo;
import java.util.Arrays;


/**
 *
 * @author tito
 */
public class ArregloServicio {
    
    public Arreglo inicializarA(double[] vec){
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (Math.random()*20-1);
        }
        return new Arreglo (vec);
    }
    
    public Arreglo inicializarB(double[] vec){
        double[] vec2 = new double[vec.length];
        for (int i = 0; i < vec2.length; i++) {
            if (i >= 0 && i <=9) {
                vec2[i] = vec[i];
            } else {
                    vec2[i] = 0.5;
            }
            
            
        }
        return new Arreglo (vec2);
    }
    
    
    public void mostrarDatos(Arreglo arr){
        System.out.println("Los datos cargados son: " + arr.toString());
    }
    
    public void ordenarA(double[] arr){
        Arrays.sort(arr);
        double[] vec3 = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            vec3[i] = arr[arr.length-i-1];
            
        }
        System.out.println("Los datos ordenados son: " + Arrays.toString(vec3));
    }
    
    public void ordenar(double [] v){ 
         Arrays.sort(v); 
         double[] vaux=new double[v.length]; 
         int j=0; 
         for (int i = v.length-1; i >= 0; i--) { 
             vaux[j]=v[i]; 
             j++; 
         } 
         for (int i = 0; i < v.length; i++) { 
             v[i] = vaux[i]; 
         }
         System.out.println("Los datos ordenados son: " + Arrays.toString(v));
     }
}
