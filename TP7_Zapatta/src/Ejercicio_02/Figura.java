
package Ejercicio_02;

/**
 *
 * @author Carlos German Zapatta
 * 
 */
public abstract class Figura {
    protected String nombre;
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    // Método abstracto - No tiene cuerpo, obliga a los hijos a implementarlo
    public abstract double calcularArea();
    public String getNombre() {
        return nombre;
    }
}