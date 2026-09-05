/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author chino
 */
public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public void setIdGallina(int idGallina) {
        if (idGallina >= 0) {
            this.idGallina = idGallina;
        } else {
            System.out.println("Error: El ID no puede ser negativo.");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos >= 0) {
            this.huevosPuestos = huevosPuestos;
        } else {
            System.out.println("Error: Los huevos puestos no pueden ser negativos.");
        }
    }

    public int getIdGallina() { 
        return idGallina; }
    
    public int getEdad() { 
        return edad; }
    
    public int getHuevosPuestos() { 
        return huevosPuestos; }

    public void ponerHuevo() {
        this.huevosPuestos++;
    }

    public void envejecer() {
        this.edad++;
    }

    public void mostrarEstado() {
        System.out.println("ID Gallina: " + this.idGallina);
        System.out.println("Edad: " + this.edad);
        System.out.println("Huevos puestos: " + this.huevosPuestos);
    }
}
