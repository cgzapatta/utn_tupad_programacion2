/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco Nacion", "30-12345678-9");
        Cliente cliente1 = new Cliente("German Zapatta", "40123456");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("4509-1234-5678-9012", "12/28", banco1);

        tarjeta1.setCliente(cliente1);

        System.out.println("1. Datos del Banco:");
        System.out.println(banco1);

        System.out.println("\n2. Datos del Cliente:");
        System.out.println(cliente1);

        System.out.println("\n3. Datos de la Tarjeta:");
        System.out.println(tarjeta1);
        
        //Acá verifico por separado cada cosa.
        System.out.println("\n4. Verificacion Agregacion:");
        System.out.println("La tarjeta pertenece al banco: " + tarjeta1.getBanco().getNombre());

        System.out.println("\n5. Verificacion Bidireccional:");
        System.out.println("Desde la tarjeta, el cliente es: " + tarjeta1.getCliente().getNombre());
        System.out.println("Desde el cliente, su tarjeta es: " + cliente1.getTarjeta().getNumero());
    }
}