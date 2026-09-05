/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;
//import java.util.Scanner; NO lo voy a usar, borrar luego

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        System.out.println("\nSe instancio un estudiante");

        // Intento con nombre vacio y con nota mayor a 10
        System.out.println("\nSe cargan datos erroneos, nombre vacio y nota 12");
        estudiante.setNombre("");
        estudiante.setCalificacion(12.0);

        // Ahora cargo datos correctos, con mis datos
        System.out.println("\nSe cargan datos correctos");
        estudiante.setNombre("German");
        estudiante.setApellido("Zapatta");
        estudiante.setCurso("Programacion II");
        estudiante.setCalificacion(7.5);

        // Mostrar informacion
        System.out.println("\nSe muestran los datos correctos cargados");
        estudiante.mostrarInfo();

        // Aca estoy probando subir y bajar notas
        System.out.println("\nSe prueba subir y bajar notas con datos fijos");
        estudiante.subirCalificacion(5.0);
        estudiante.subirCalificacion(1.5);
        estudiante.bajarCalificacion(10.0);
        estudiante.bajarCalificacion(3.0);

        // Resultado
        System.out.println("\nSe muestran los datos finales");
        estudiante.mostrarInfo();
    }
}
    

