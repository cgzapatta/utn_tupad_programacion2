/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_11;

/**
 *
 * @author chino
 */
public class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: '" + cancion.getTitulo() + "' de " + cancion.getArtista().getNombre() + " [" + cancion.getArtista().getGenero() + "]");
    }
}