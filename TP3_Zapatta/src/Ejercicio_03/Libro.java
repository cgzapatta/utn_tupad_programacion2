/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author chino
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Error: El titulo no puede estar vacio.");
        }
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("Error: El autor no puede estar vacio.");
        }
    }

    public void setAnioPublicacion(int anioPublicacion) {
        int anioActual = 2026;
        if (anioPublicacion > 0 && anioPublicacion <= anioActual) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Error: Anio de publicacion invalido (" + anioPublicacion + ").");
        }
    }

    public String getTitulo() { 
        return titulo; }
    
    public String getAutor() { 
        return autor; }
    
    public int getAnioPublicacion() { 
        return anioPublicacion; }

    public void mostrarInfo() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Anio de publicacion: " + this.anioPublicacion);
    }
}
