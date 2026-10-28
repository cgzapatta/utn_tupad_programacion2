/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_11;

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        Artista artista1 = new Artista("Cerati", "Rock");
        Cancion cancion1 = new Cancion("Crimen", artista1);
        Reproductor rep = new Reproductor();

        rep.reproducir(cancion1);
    }
}