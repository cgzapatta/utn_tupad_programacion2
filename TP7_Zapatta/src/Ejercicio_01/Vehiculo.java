
package Ejercicio_01;

/**
 *
 * @author C. German Zapatta
 * 
 * 
 */
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
   
    public abstract void mostrarInfo(); 
}