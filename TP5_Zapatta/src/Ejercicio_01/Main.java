
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        Titular titular1 = new Titular("German Zapatta", "40123456");
        
        Pasaporte pasaporte1 = new Pasaporte("AAB123AAB", "2026-10-27", "foto_carnet.jpg", "JPG");

        pasaporte1.setTitular(titular1);

        System.out.println(pasaporte1);
        System.out.println("La foto del pasaporte es: " + pasaporte1.getFoto().getImagen());
        System.out.println("El titular del pasaporte es: " + pasaporte1.getTitular().getNombre());
    }
}
