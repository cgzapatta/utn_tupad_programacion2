
package Ejercicio_04;
import java.util.ArrayList;
/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Katara"));
        animales.add(new Gato("Garfil"));
        animales.add(new Vaca("Milka"));
        animales.add(new Perro("Homero"));
        System.out.println("Sonidos con Polimorfismo");
        
        for (Animal a : animales) {
            a.describirAnimal();
        }
        System.out.println("\nSolo los sonidos");
        for (Animal a : animales) {
            System.out.print(a.nombre + ": ");
            a.hacerSonido();
        }
    }
}