
package Ejercicio_02;

/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
