/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_07;

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Nafta 1.6", "MOT-123456");
        Conductor conductor1 = new Conductor("German Zapatta", "LIC-98765");
        Vehiculo vehiculo1 = new Vehiculo("AE 123 CD", "Gol Trend", motor1);

        vehiculo1.setConductor(conductor1);

        System.out.println("1. Datos del Motor:");
        System.out.println(motor1);

        System.out.println("\n2. Datos del Conductor:");
        System.out.println(conductor1);

        System.out.println("\n3. Datos del Vehiculo:");
        System.out.println(vehiculo1);

        System.out.println("\n4. Verificacion Agregacion:");
        System.out.println("El vehiculo tiene motor: " + vehiculo1.getMotor().getTipo() + " - " + vehiculo1.getMotor().getNumeroSerie());

        System.out.println("\n5. Verificacion Bidireccional:");
        System.out.println("Desde el vehiculo, el conductor es: " + vehiculo1.getConductor().getNombre());
        System.out.println("Desde el conductor, su vehiculo es: " + conductor1.getVehiculo().getPatente());
    }
}