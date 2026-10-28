/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_06;
import java.util.Scanner;
/**
 *
 * @author chino
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese telefono del cliente: ");
        String telefono = sc.nextLine();

        Cliente cliente1 = new Cliente(nombre, telefono);
        Mesa mesa1 = new Mesa(12, 4);
        Reserva reserva1 = new Reserva("2026-10-28", "21:00", cliente1, mesa1);

        System.out.println("\n1. Cliente ingresado por teclado:");
        System.out.println(cliente1);

        System.out.println("\n2. Mesa asignada (Agregacion):");
        System.out.println(mesa1);

        System.out.println("\n3. Reserva completa:");
        System.out.println(reserva1);

        System.out.println("\n4. Verificacion Unidireccional:");
        System.out.println("La reserva de las " + reserva1.getHora() + " es para: " + reserva1.getCliente().getNombre());

        System.out.println("\n5. Verificacion Agregacion:");
        System.out.println("Reserva de la mesa numero " + reserva1.getMesa().getNumero() + " con capacidad para " + reserva1.getMesa().getCapacidad() + " personas");

        sc.close();
    }
}