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
        // aca creo libros usando ambos constructores
        System.out.println("Aca creo un libro sin editorial explicita y otro con editorial personalizada\n");
        Libro libro1 = new Libro("Cien Anios de Soledad", "Gabriel Garcia Marquez");
        Libro libro2 = new Libro("Ficciones", "Jorge Luis Borges", "Sur");

        // aca muestro el estado inicial de los libros
        System.out.println("Aca muestro los libros creados inicialmente\n");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        //pruebo actualizar el titulo simple
        System.out.println("\nactualizo el titulo usando la variante simple\n");
        libro1.actualizarTitulo("Cien Anios de Soledad Edicion Especial");
        System.out.println(libro1.toString());

        // aca pruebo actualizar el titulo con prefijo
        System.out.println("\nactualizo el titulo agregando un prefijo\n");
        libro2.actualizarTitulo("Obra Completa:", "Ficciones");
        System.out.println(libro2.toString());

        //pruebo la programacion defensiva con un titulo vacio
        System.out.println("\nAhora intento actualizar con un titulo vacio para verificar que el sistema lo ignore\n");
        libro1.actualizarTitulo("");
        System.out.println(libro1.toString());

        //cambio la editorial global y verifico el comportamiento estatico
        System.out.println("\nEn esto cambio la editorial global a Planeta para ver el efecto en todos los libros\n");
        Libro.cambiarEditorial("Planeta");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
    }
}
