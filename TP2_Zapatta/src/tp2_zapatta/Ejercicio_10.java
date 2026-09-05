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
public class Ejercicio_10 {

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int stockActual;
        int cantidadVendida;
        int cantidadRecibida;
        int nuevoStock;

        // Valido el valor de stock actual
        System.out.print("Ingrese el stock actual del producto: ");
        int entradaStock = Integer.parseInt(scan.nextLine());

        if (entradaStock < 0) {
            System.out.println("Error: El stock actual no puede ser negativo.");
        } else {
            stockActual = entradaStock;

            // Valido el valor de la cantidad vendida
            System.out.print("Ingrese la cantidad vendida: ");
            int entradaVendida = Integer.parseInt(scan.nextLine());

            if (entradaVendida < 0) {
                System.out.println("Error: La cantidad vendida no puede ser negativa.");
            } else if (entradaVendida > stockActual) {
                System.out.println("Error: No se puede vender más de lo que hay en stock (" + stockActual + " unidades).");
            } else {
                cantidadVendida = entradaVendida;

                // valido el valor de la cantidad vendida
                System.out.print("Ingrese la cantidad recibida: ");
                int entradaRecibida = Integer.parseInt(scan.nextLine());

                if (entradaRecibida < 0) {
                    System.out.println("Error: La cantidad recibida no puede ser negativa.");
                } else {
                    cantidadRecibida = entradaRecibida;

                    // Si todas las validaciones salienton bien ahora si sigo adelante.
                    nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
                    
                    System.out.println("El nuevo stock del producto es: " + nuevoStock);
                }
            }
        }
    }
}
