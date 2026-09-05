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
public class Ejercicio_05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int suma = 0;

        System.out.print("Ingrese un numero (0 para terminar): ");
        num = Integer.parseInt(scan.nextLine());

        while (num != 0) {

            if (num % 2 == 0) {
                suma = suma + num;
            }

            System.out.print("Ingrese un numero (0 para terminar): ");
            num = Integer.parseInt(scan.nextLine());
        }

        System.out.println("La suma de los numeros pares es: " + suma);
    }
}
