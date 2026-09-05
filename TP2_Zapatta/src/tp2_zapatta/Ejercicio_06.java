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
public class Ejercicio_06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int num;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese el numero " + i + ": ");
            num = Integer.parseInt(scan.nextLine());

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
