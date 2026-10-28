/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_13;

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("German Zapatta", "german@gmail.com");
        GeneradorQR gen = new GeneradorQR();

        gen.generar("paginaweb/german", u1);
    }
}