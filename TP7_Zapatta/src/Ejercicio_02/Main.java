
package Ejercicio_02;

/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[4];
        figuras[0] = new Circulo("Circulo 1   ", 5);
        figuras[1] = new Rectangulo("Rectangulo 1", 4, 6);
        figuras[2] = new Circulo("Circulo 2   ", 3.5);
        figuras[3] = new Rectangulo("Rectangulo 2", 10, 2);
        System.out.println("Areas de las Figuras\n");
        for (Figura f : figuras) {
            System.out.printf("%s ----> Area: %.2f\n", f.getNombre(), f.calcularArea());
        }
    }
}
