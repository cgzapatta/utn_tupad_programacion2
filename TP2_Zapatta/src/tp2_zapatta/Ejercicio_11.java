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
public class Ejercicio_11 {

    static double DESCUENTO_ESPECIAL = 0.10; // variable global y fija

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: $" + descuentoAplicado);
        System.out.println("El precio final con descuento es: $" + precioFinal);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double precio;

        System.out.print("Ingrese el precio del producto: ");
        double entradaPrecio = Double.parseDouble(scan.nextLine());

        // Valido que el precio sea mayor a 0
        if (entradaPrecio <= 0) {
            System.out.println("Error: El precio del producto debe ser mayor a 0.");
        } else {
            precio = entradaPrecio;

            // Si el precio es correto, ahora si llamo la funcion
            calcularDescuentoEspecial(precio);
        }
    }
}
