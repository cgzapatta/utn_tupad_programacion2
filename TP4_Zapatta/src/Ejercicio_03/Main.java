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
        
        // en este paso instancio los alumnos usando ambos constructores
        System.out.println("En este paso creo un alumno con promedio inicial y otro solo con nombre\n");
        Alumno alumno1 = new Alumno("Carlos Gomez", 7.5);
        Alumno alumno2 = new Alumno("Ana Martinez");

        // ahora imprimo el estado inicial de cada estudiante
        System.out.println("Ahora muestro el estado inicial de ambos estudiantes\n");
        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());

        // actualizo el promedio con valor directo
        System.out.println("\nactualizo el promedio de Carlos asignando un valor directo\n");
        alumno1.actualizarPromedio(8.0);
        System.out.println(alumno1.toString());

        //calculo el promedio pasandole un arreglo de notas
        System.out.println("\nA continuacion calculo el promedio de Ana a partir de una lista de notas\n");
        double[] notasAna = {7.0, 8.0, 9.0};
        alumno2.actualizarPromedio(notasAna);
        System.out.println(alumno2.toString());

        // aqui verifico la programacion defensiva con un valor fuera de rango
        System.out.println("\npruebo ingresar un promedio invalido mayor a 10 para comprobar que lo ajusta al limite\n");
        alumno1.actualizarPromedio(15.0);
        System.out.println(alumno1.toString());

        // finalmente modifico la nota global de aprobacion y reevaluo a los estudiantes
        System.out.println("\nsubo la nota minima de aprobacion a 9.0 para demostrar el impacto estatico\n");
        Alumno.cambiarNotaAprobacion(9.0);
        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
    }
    
}
