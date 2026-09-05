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
public class Ejercicio_04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double precio;
        double descuento = 0;
        double precioFinal;
        String categoria;

        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(scan.nextLine());

        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        categoria = scan.nextLine();

        switch (categoria) {

            case "A":
                descuento = 0.10;
                break;

            case "B":
                descuento = 0.15;
                break;

            case "C":
                descuento = 0.20;
                break;

            default:
                System.out.println("Categoria invalida,utilice Mayusculas.");
                return;
        }

        precioFinal = precio - (precio * descuento);

        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}
