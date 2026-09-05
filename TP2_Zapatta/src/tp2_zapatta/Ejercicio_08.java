/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_zapatta;
import java.util.Scanner;


/**
 *
 * @author chino
 */
public class Ejercicio_08 {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double precioBase;
        double impuesto;
        double descuento;

        // En esta parte voy a validar el precio, para evitar valores negativos
        System.out.print("Ingrese el precio base del producto: ");
        double entradaPrecio = Double.parseDouble(scan.nextLine());

        if (entradaPrecio <= 0) {
            System.out.println("Error: El precio base debe ser mayor a 0.");
        } else {
            precioBase = entradaPrecio;

            // En esta parte voy a validar el impuesto, para evitar errores
            System.out.print("Ingrese el impuesto en porcentaje: ");
            double entradaImpuesto = Double.parseDouble(scan.nextLine());

            if (entradaImpuesto < 0) {
                System.out.println("Error: El impuesto no puede ser negativo.");
            } else if (entradaImpuesto > 100) {
                System.out.println("Error: El impuesto no puede superar el 100%.");
            } else {
                impuesto = entradaImpuesto / 100;

                // En esta parte voy a validar el descuento
                System.out.print("Ingrese el descuento en porcentaje: ");
                double entradaDescuento = Double.parseDouble(scan.nextLine());

                if (entradaDescuento < 0) {
                    System.out.println("Error: El descuento no puede ser negativo.");
                } else if (entradaDescuento > 100) {
                    System.out.println("Error: El descuento no puede ser mayor al 100%.");
                } else {
                    descuento = entradaDescuento / 100;

                    // Si todas las validaciones salieron bien, ahora si continuo con los calculos
                    double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
                    System.out.println("El precio final del producto es: " + precioFinal);
                }
            }
        }
    }
}
