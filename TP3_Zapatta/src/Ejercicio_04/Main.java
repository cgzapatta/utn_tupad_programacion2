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
        
        Gallina galliA = new Gallina();
        Gallina galliB = new Gallina();

        galliA.setIdGallina(1);
        galliB.setIdGallina(2);
        
        System.out.println("\nSe instanciaron dos gallinas");

        // Intento asignar edad negativa
        System.out.println("\nSe intenta cargar edad negativa a una");
        galliA.setEdad(-5);
        
        System.out.println("\nSe carga la edad de manera correcta a ambas");
        galliA.setEdad(2);
        galliB.setEdad(1);

        // Simulo acciones
        System.out.println("\nSe le hace poner huevos, llamando a ponerHuevo");
        galliA.ponerHuevo();
        galliA.ponerHuevo();
        galliB.ponerHuevo();
        galliB.ponerHuevo();
        galliB.ponerHuevo();

        // Muestro estados
        System.out.println("\nSe muestran los datos finales");
        galliA.mostrarEstado();
        System.out.println("\n");
        galliB.mostrarEstado();
    }
}
