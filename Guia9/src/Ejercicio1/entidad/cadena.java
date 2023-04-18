/*
 Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como 
atributos una frase (String) y su longitud. Agregar constructor vacío y con 
atributo frase solamente. Agregar getters y setters. El constructor con frase 
como atributo debe setear la longitud de la frase de manera automática. 
 */
package Ejercicio1.entidad;

/**
 *
 * @author tito
 */
public class cadena {
    
      private String frase;
      private int longitud;

    public cadena() {
    }

    public cadena(String frase) {
        this.frase = frase;
        // setear la longitud frase
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
