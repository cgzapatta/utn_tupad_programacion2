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
public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingese su nombre: ");
        String nombre;
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad;
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
        
        
    }
     
    
}
