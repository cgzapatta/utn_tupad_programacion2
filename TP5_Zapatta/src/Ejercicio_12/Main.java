/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12;

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        Contribuyente c1 = new Contribuyente("German Zapatta", "20-40123456-7");
        Impuesto imp1 = new Impuesto(15000.50, c1);
        Calculadora calc = new Calculadora();

        calc.calcular(imp1);
    }
}