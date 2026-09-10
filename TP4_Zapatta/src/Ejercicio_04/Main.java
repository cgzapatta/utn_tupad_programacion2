/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author chino
 */
public class Main {public static void main(String[] args) {
    
        // creo los productos usando ambos constructores
        System.out.println("Primero creo un producto con precio explicito y otro con precio por defecto\n");
        Producto prod1 = new Producto("Teclado Mecanico", 15000.0);
        Producto prod2 = new Producto("Mousepad");

        //muestro el estado de cada articulo
        System.out.println("Para empezar muestro los datos iniciales de ambos productos\n");
        System.out.println(prod1.toString());
        System.out.println(prod2.toString());

        //aplico un descuento simple porcentual
        System.out.println("\nEn esta parte aplico un 10% de descuento al teclado\n");
        prod1.aplicarDescuento(10.0);
        System.out.println(prod1.toString());

        //aplico un descuento con tope de precio minimo
        System.out.println("\naplico un 50% de descuento al mousepad garantizando un limite minimo de 80\n");
        prod2.aplicarDescuento(50.0, 80.0);
        System.out.println(prod2.toString());

        // aqui compruebo la proteccion defensiva intentando asignar un precio negativo
        System.out.println("\nAqui intento asignar un precio negativo para validar que el sistema lo rechaza\n");
        prod1.setPrecioBase(-500.0);
        System.out.println(prod1.toString());

        // para terminar modifico el IVA de manera global y recalculamos
        System.out.println("\nPara terminar actualizo el IVA global al 10.5% para observar el recalculo en todos los articulos\n");
        Producto.cambiarIVA(0.105);
        System.out.println(prod1.toString());
        System.out.println(prod2.toString());
    }
}
