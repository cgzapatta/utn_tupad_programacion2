/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author chino
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacio.");
        }
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido;
        } else {
            System.out.println("Error: El apellido no puede estar vacio.");
        }
    }

    public void setCurso(String curso) {
        if (curso != null && !curso.trim().isEmpty()) {
            this.curso = curso;
        } else {
            System.out.println("Error: El curso no puede estar vacio.");
        }
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0.0 && calificacion <= 10.0) {
            this.calificacion = calificacion;
        } else {
            System.out.println("Error: La calificacion debe estar entre 0.0 y 10.0.");
        }
    }

    public String getNombre() { 
        return nombre; }
    
    public String getApellido() { 
        return apellido; }
    
    public String getCurso() { 
        return curso; }
    
    public double getCalificacion() { 
        return calificacion; }

    public void subirCalificacion(double puntos) {
        if (puntos <= 0) {
            System.out.println("Error: Puntos invalidos.");
        } else if (this.calificacion + puntos > 10.0) {
            System.out.println("Error: Supera el limite de 10.0.");
        } else {
            this.calificacion += puntos;
        }
    }

    public void bajarCalificacion(double puntos) {
        if (puntos <= 0) {
            System.out.println("Error: Puntos invalidos.");
        } else if (this.calificacion - puntos < 0.0) {
            System.out.println("Error: Es menor al limite de 0.0.");
        } else {
            this.calificacion -= puntos;
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre + " " + this.apellido);
        System.out.println("Curso: " + this.curso);
        System.out.println("Calificacion: " + this.calificacion);
    }
}
