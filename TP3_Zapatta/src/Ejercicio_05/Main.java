/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        System.out.println("\nSe instancio una nave");
        nave.setNombre("Katara-Space");
        nave.setCombustible(50.0);
        nave.mostrarEstado();

        // Intento avanzar una distancia que supere el combustible
        System.out.println("\nSe intenta avanzar mas de lo posible por el combustible");
        nave.avanzar(60.0);

        // Intento recargar superando el limite maximo
        System.out.println("\nSe intenta cargar combustible de mas");
        nave.recargarCombustible(60.0);

        // Recargo
        System.out.println("\nSe recarga lo posible");
        nave.recargarCombustible(50.0);
        nave.mostrarEstado();
        
        System.out.println("\nSe avanza");
        nave.avanzar(30.0);

        // final
        System.out.println("\nResultado final");
        nave.mostrarEstado();
    }
}
