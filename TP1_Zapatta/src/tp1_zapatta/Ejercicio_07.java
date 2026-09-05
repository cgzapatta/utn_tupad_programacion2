/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_zapatta;

import java.util.Scanner;

/**
 *
 * @author chino
 */
public class Ejercicio_07 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa tu nombre: ");
    String nombre = scanner.nextLine(); // ERROR
    System.out.println("Hola, " + nombre);
    }
    // El error se debia a usar nextInt, que busca un entero.
    // Lo solucione cambiandolo a nextLine, que en este caso funciona directamente
    
}
