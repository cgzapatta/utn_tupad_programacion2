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
        Autor autor1 = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Editorial editorial1 = new Editorial("Sudamericana", "Humberto Primo 555, CABA");
        Libro libro1 = new Libro("Cien Anos de Soledad", "978-0307474728", autor1, editorial1);

        System.out.println("1. Datos del Autor:");
        System.out.println(autor1);

        System.out.println("\n2. Datos de la Editorial:");
        System.out.println(editorial1);

        System.out.println("\n3. Datos del Libro:");
        System.out.println(libro1);
        
        //acá voy a verifivcar uno pór uno las cosas
        System.out.println("\n4. Verificacion Unidireccional:");
        System.out.println("El libro '" + libro1.getTitulo() + "' fue escrito por: " + libro1.getAutor().getNombre());

        System.out.println("\n5. Verificacion Agregacion:");
        System.out.println("El libro es de la editorial: " + libro1.getEditorial().getNombre() + " - " + libro1.getEditorial().getDireccion());
    }
}