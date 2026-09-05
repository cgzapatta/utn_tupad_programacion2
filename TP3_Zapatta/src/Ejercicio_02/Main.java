/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        Mascota mascota = new Mascota();
        System.out.println("\nSe instancio una mascota");

        // Intento con edad negativa
        System.out.println("\nIntento con edad negativa");
        mascota.setEdad(-3);

        // Datos validos
        System.out.println("\nSe cargan datos correctos");
        mascota.setNombre("Katara Zapatta");
        mascota.setEspecie("Perro");
        mascota.setEdad(2);

        // Informacion inicial
        System.out.println("\nMuestro datos correctos cargados");
        mascota.mostrarInfo();

        // Invocacion de cumplirAnios
        System.out.println("\nLlamo 5 veces a cumplir anos");
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        mascota.cumplirAnios();

        // Informacion final
        System.out.println("\nMuestro datos finales, con nueva edad");
        mascota.mostrarInfo();
    }
}
