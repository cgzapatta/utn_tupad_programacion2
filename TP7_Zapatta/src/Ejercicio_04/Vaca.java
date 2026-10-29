
package Ejercicio_04;

/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Mu");
    }
}
