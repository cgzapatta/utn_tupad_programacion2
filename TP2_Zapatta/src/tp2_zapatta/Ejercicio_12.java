/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_zapatta;

/**
 *
 * @author chino
 */
public class Ejercicio_12 {

    public static void main(String[] args) {

        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");

        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        precios[3] = 99999;

        System.out.println("Precios modificados:");

        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
