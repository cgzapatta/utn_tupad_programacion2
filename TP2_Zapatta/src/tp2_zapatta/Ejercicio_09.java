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
public class Ejercicio_09 {

    public static double calcularCostoEnvio(double peso, String zona) {
        double costo;

        // Uso equalsIgnoreCase para aceptar n o N
        if (zona.equalsIgnoreCase("N")) {
            costo = peso * 5;
        } else {
            costo = peso * 10;
        }

        return costo;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double precioProducto;
        double peso;
        double costoEnvio;
        double total;
        String zona;

        // Aca voy a calidar el precio, que no sea negativo
        System.out.print("Ingrese el precio del producto: ");
        double entradaPrecio = Double.parseDouble(scan.nextLine());

        if (entradaPrecio <= 0) {
            System.out.println("Error: El precio del producto debe ser mayor a 0.");
        } else {
            precioProducto = entradaPrecio;

            // En esta parte voy a calidar el peso
            System.out.print("Ingrese el peso del paquete en kg: ");
            double entradaPeso = Double.parseDouble(scan.nextLine());

            if (entradaPeso <= 0) {
                System.out.println("Error: El peso debe ser mayor a 0 kg.");
            } else {
                peso = entradaPeso;

                // valido la zona de envio, que sea la letra correcta y no importa si es mayus o minus
                System.out.print("Ingrese la zona de envio (Nacional: N / Internacional: I): ");
                String entradaZona = scan.nextLine();

                if (!entradaZona.equalsIgnoreCase("N") && !entradaZona.equalsIgnoreCase("I")) {
                    System.out.println("Error: La zona debe ser 'N' (Nacional) o 'I' (Internacional).");
                } else {
                    zona = entradaZona;

                    // Si todas las entradas son buenas, ahora si seguimos con el calculo
                    costoEnvio = calcularCostoEnvio(peso, zona);
                    total = calcularTotalCompra(precioProducto, costoEnvio);

                    System.out.println("El costo de envio es: $" + costoEnvio);
                    
                    System.out.println("El total a pagar es: $" + total);
                }
            }
        }
    }
}