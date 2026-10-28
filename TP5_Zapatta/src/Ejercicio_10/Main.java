/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

/**
 *
 * @author chino
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del titular: ");
        String nombre = sc.nextLine();

        System.out.print("DNI del titular: ");
        int dni = sc.nextInt();
        sc.nextLine();

        Titular titular1 = new Titular(nombre, dni);
        CuentaBancaria cuenta1 = new CuentaBancaria("0170123450000001234567", 250000.75, "A1B2C3", "2026-10-27");

        cuenta1.setTitular(titular1);

        System.out.println("\nRESUMEN");
        System.out.println("Titular: " + titular1.getNombre() + " (DNI " + titular1.getDni() + ")");
        System.out.println("Cuenta CBU: " + cuenta1.getCbu());
        System.out.println("Saldo actual: $" + cuenta1.getSaldo());
        System.out.println("Clave de seguridad: " + cuenta1.getClave().getCodigo() + " Modificada: " + cuenta1.getClave().getUltimaModificacion());
        sc.close();
    }
}