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
        
        // aca creo dos cuentas para probar la autogeneracion del numero
        System.out.println("Paso a crear una cuenta con saldo inicial y otra en cero\n");
        Cuenta cuenta1 = new Cuenta("Lucas Ruiz", 5000.0);
        Cuenta cuenta2 = new Cuenta("Sofia Lopez");

        // muestro la informacion inicial de ambas
        System.out.println("Imprimo el estado de las cuentas recien creadas\n");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

        // realizo un deposito en la segunda cuenta
        System.out.println("\nIngreso dinero en la cuenta de Sofia\n");
        cuenta2.depositar(2500.0);
        System.out.println(cuenta2.toString());

        // pruebo la extraccion correcta en la primera cuenta
        System.out.println("\nRetiro un monto valido de la cuenta de Lucas\n");
        cuenta1.extraer(1000.0);
        System.out.println(cuenta1.toString());

        // valido que la programacion defensiva no permita dejar saldo negativo
        System.out.println("\nIntento retirar mas dinero del saldo disponible para verificar el rechazo\n");
        cuenta1.extraer(10000.0);
        System.out.println(cuenta1.toString());

        // pruebo la consulta de saldo convertida a dolares
        System.out.println("\nConsulto el saldo de Lucas convertido a dolares con cotizacion a 1360\n");
        System.out.println("Saldo en USD: " + String.format("%.2f", cuenta1.consultarSaldo(1360.0)));

        // consulto el contador global de cuentas
        System.out.println("\nMuestro el total acumulado de cuentas en el sistema\n");
        System.out.println("Total cuentas: " + Cuenta.mostrarTotalCuentas());
    }
}
