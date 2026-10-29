
package Ejercicio_01;

/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Main {
    public static void main(String[] args) {
        
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        
        System.out.println("Informacion completa del Auto");
        miAuto.mostrarInfo();
        
        Auto auto2 = new Auto("Ford", "Mustang", 2);
        System.out.println("\nInformacion completa del Auto 2");
        auto2.mostrarInfo();
    }
}