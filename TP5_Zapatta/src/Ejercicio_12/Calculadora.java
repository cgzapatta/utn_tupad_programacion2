/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12;

/**
 *
 * @author chino
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de $" + impuesto.getMonto() + " para " + impuesto.getContribuyente().getNombre() + " (" + impuesto.getContribuyente().getCuil() + ")");
    }
}