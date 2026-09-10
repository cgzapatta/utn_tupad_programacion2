/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author chino
 */
public class Alumno {
    
    private String nombre;
    private double promedio;
    private static double notaAprobacion = 6.0;

    public Alumno(String nombre, double promedio) {
        setNombre(nombre);
        setPromedio(promedio);
    }

    public Alumno(String nombre) {
        this(nombre, 0.0);
    }

    public String getNombre() {
        return this.nombre;
    }

    public final void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public double getPromedio() {
        return this.promedio;
    }

    public final void setPromedio(double promedio) {
        if (promedio < 0.0) {
            this.promedio = 0.0;
        } else if (promedio > 10.0) {
            this.promedio = 10.0;
        } else {
            this.promedio = promedio;
        }
    }

    public static double getNotaAprobacion() {
        return Alumno.notaAprobacion;
    }

    public static void cambiarNotaAprobacion(double nueva) {
        if (nueva >= 0.0 && nueva <= 10.0) {
            Alumno.notaAprobacion = nueva;
        }
    }

    public void actualizarPromedio(double nuevoPromedio) {
        setPromedio(nuevoPromedio);
    }

    public void actualizarPromedio(double[] notas) {
        if (notas != null && notas.length > 0) {
            double suma = 0.0;
            for (double nota : notas) {
                suma += nota;
            }
            setPromedio(suma / notas.length);
        }
    }

    public boolean aprobo() {
        return this.promedio >= Alumno.notaAprobacion;
    }

    @Override
    public String toString() {
        String estado = aprobo() ? "Aprobado" : "Reprobado";
        return "Alumno: " + this.nombre + ", Promedio: " + this.promedio + ", Estado: " + estado;
    }
}
