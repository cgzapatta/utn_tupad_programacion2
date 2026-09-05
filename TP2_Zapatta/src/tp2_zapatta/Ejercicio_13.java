/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_zapatta;

/**
 *
 * @author chino
 */
public class Ejercicio_13 {

    public static void mostrarPrecios(double[] precios, int posicion) {

        if (posicion < precios.length) {

            System.out.println("Precio: $" + precios[posicion]);

            mostrarPrecios(precios, posicion + 1);
        }
    }

    public static void main(String[] args) {

        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");

        mostrarPrecios(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");

        mostrarPrecios(precios, 0);
    }
}
