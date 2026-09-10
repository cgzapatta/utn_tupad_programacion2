/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author chino
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private static String editorial = "Independiente";

    public Libro(String titulo, String autor, String editorial) {
        setTitulo(titulo);
        setAutor(autor);
        if (editorial != null && !editorial.trim().isEmpty()) {
            Libro.editorial = editorial;
        }
    }

    public Libro(String titulo, String autor) {
        this(titulo, autor, Libro.editorial);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public final void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return this.autor;
    }

    public final void setAutor(String autor) {
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = autor;
        }
    }

    public static String getEditorial() {
        return Libro.editorial;
    }

    public static void cambiarEditorial(String nueva) {
        if (nueva != null && !nueva.trim().isEmpty()) {
            Libro.editorial = nueva;
        }
    }

    public void actualizarTitulo(String nuevoTitulo) {
        setTitulo(nuevoTitulo);
    }

    public void actualizarTitulo(String prefijo, String nuevoTitulo) {
        if (prefijo != null && !prefijo.trim().isEmpty() && nuevoTitulo != null && !nuevoTitulo.trim().isEmpty()) {
            setTitulo(prefijo + " " + nuevoTitulo);
        }
    }

    @Override
    public String toString() {
        return "Titulo: " + this.titulo + ", Autor: " + this.autor + ", Editorial: " + Libro.editorial;
    }
}
