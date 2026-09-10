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
        // aca creo objetos usando el constructor completo
        System.out.println("Aca creo objetos con el constructor completo");
        Empleado emp1 = new Empleado(101, "Juan Perez", "Desarrollador", 50000.0);

        // aca creo objetos usando el constructor reducido
        System.out.println("Aca creo objetos con el constructor reducido");
        Empleado emp2 = new Empleado("Maria Gomez", "Analista");

        //muestro los datos de los empleados creados
        System.out.println("Aca muestro la informacion de cada empleado");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

        //pruebo actualizar salario con porcentaje valido
        System.out.println("Aca pruebo actualizar el salario por porcentaje");
        emp1.actualizarSalario(10.0);
        System.out.println(emp1.toString());

        //pruebo actualizar salario con monto fijo valido
        System.out.println("Aca pruebo actualizar el salario con un monto fijo");
        emp2.actualizarSalario(5000);
        System.out.println(emp2.toString());

        //verifico el control de errores con un porcentaje negativo
        System.out.println("Aca pruebo actualizar el salario con un porcentaje negativo para verificar que no cambie");
        emp1.actualizarSalario(-15.0);
        System.out.println(emp1.toString());

        // aca verifico el control de errores con un monto fijo negativo
        System.out.println("Aca pruebo actualizar el salario con un monto fijo negativo para verificar que no cambie");
        emp2.actualizarSalario(-2000);
        System.out.println(emp2.toString());

        // verifico la programacion defensiva intentando asignar un salario negativo mediante setter
        System.out.println("Aca intento asignar un salario negativo directamente para verificar la proteccion");
        emp1.setSalario(-10000.0);
        System.out.println(emp1.toString());

        // muestro el total de empleados creados
        System.out.println("Aca muestro el total acumulado de empleados creados");
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
