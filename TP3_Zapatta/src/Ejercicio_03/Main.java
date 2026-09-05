/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        System.out.println("\nSe instancio un libro");

        libro.setTitulo("Fitocosmetica");
        libro.setAutor("Romina Roman");

        // Intento anio invalido
        System.out.println("\nSe intenta cargar un anio del futuro");
        libro.setAnioPublicacion(5000);

        // Modifico anio con valor correcto
        System.out.println("\nSe cargan datos correctos");
        libro.setAnioPublicacion(2023);

        // Mestro informacion final
        System.out.println("\nSe muestran los datos finales");
        libro.mostrarInfo();
    }
}
