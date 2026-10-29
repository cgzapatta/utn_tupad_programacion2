
package Ejercicio_03;
import java.util.ArrayList;
/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("German", 500000, 5));
        empleados.add(new EmpleadoTemporal("Lucia", 80, 4500));
        empleados.add(new EmpleadoPlanta("Carlos", 600000, 10));
        empleados.add(new EmpleadoTemporal("Ana", 120, 4000));

        System.out.println("Liquidacion de Sueldos");
        for (Empleado e : empleados) {
            
            System.out.printf("Empleado: %s - Sueldo: $%.2f", e.getNombre(), e.calcularSueldo());

            
            if (e instanceof EmpleadoPlanta) {
                System.out.print(" [PLANTA]");

                
                EmpleadoPlanta ep = (EmpleadoPlanta) e;
                System.out.print(" -> Antigüedad: " + ep.getAntiguedad() + " años");


            } else if (e instanceof EmpleadoTemporal) {
                System.out.print(" [TEMPORAL]");
            }
            System.out.println();
        }
    }
}