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
public class Ejercicio_02 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int mayor;

        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(scan.nextLine());

        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(scan.nextLine());

        System.out.print("Ingrese el tercer número: ");
        num3 = Integer.parseInt(scan.nextLine());

        mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El mayor es: " + mayor);
    }
}
