/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;
import java.util.Scanner;
/**
 *
 * @author chino
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del propietario: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese DNI del propietario: ");
        String dni = sc.nextLine();

        Propietario propietario1 = new Propietario(nombre, dni);
        Computadora compu1 = new Computadora("【entity-Lenovo¦canonical_name=Lenovo】", "SN-987654321", "B550M", "B550");

        compu1.setPropietario(propietario1);

        System.out.println("\n1. Datos ingresados por teclado:");
        System.out.println(propietario1);

        System.out.println("\n2. Datos de la Computadora (con Composicion):");
        System.out.println(compu1);
        System.out.println("Placa interna: " + compu1.getPlacaMadre());

        System.out.println("\n3. Verificacion Bidireccional:");
        System.out.println("Desde la compu, el dueño es: " + compu1.getPropietario().getNombre());
        System.out.println("Desde el dueño, su compu es: " + propietario1.getComputadora().getMarca() + " - " + propietario1.getComputadora().getNumeroSerie());

        sc.close();
    }
}