/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_14;

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto("Vacaciones 2026", 15);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", p1);
    }
}