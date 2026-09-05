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
public class Ejercicio_03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(scan.nextLine());

        if (edad < 12) {
            System.out.println("Eres un Ninio.");
        } else if (edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
    }
}
