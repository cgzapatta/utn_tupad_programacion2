
package Ejercicio_03;

/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private int antiguedad; 

    public EmpleadoPlanta(String nombre, double sueldoBase, int antiguedad) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }

    @Override
    public double calcularSueldo() {
        
        return sueldoBase + (sueldoBase * 0.05 * antiguedad);
    }

    
    public int getAntiguedad() {
        return antiguedad;
    }
}