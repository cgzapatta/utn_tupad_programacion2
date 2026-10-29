
package Ejercicio_04;

/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("sonido genérico");
    }
    
    public String getTipo() {
        return this.getClass().getSimpleName();
    }

    public void describirAnimal() {
        System.out.print(nombre + " es un " + getTipo() + " y hace: ");
        hacerSonido();
    }
}