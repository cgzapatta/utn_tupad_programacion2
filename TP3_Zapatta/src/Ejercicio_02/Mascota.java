/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author chino
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacio.");
        }
    }

    public void setEspecie(String especie) {
        if (especie != null && !especie.trim().isEmpty()) {
            this.especie = especie;
        } else {
            System.out.println("Error: La especie no puede estar vacia.");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }

    public String getNombre() { 
        return nombre; }
    
    public String getEspecie() { 
        return especie; }
    
    public int getEdad() { 
        return edad; }

    public void cumplirAnios() {
        this.edad++;
        System.out.println(this.nombre + " cumplio anios. Nueva edad: " + this.edad);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Edad: " + this.edad);
    }
}
