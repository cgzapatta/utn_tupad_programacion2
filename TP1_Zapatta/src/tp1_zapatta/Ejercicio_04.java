/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_zapatta;

import java.util.Scanner;

/**
 *
 * @author chino
 */
public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingese un numero: ");
        int primerNumero,  segundoNumero, suma, resta, multiplicacion;
        double division;
        primerNumero = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese segundo numero: ");
        segundoNumero = Integer.parseInt(input.nextLine());
        
        suma = primerNumero + segundoNumero;
        resta = primerNumero - segundoNumero;
        multiplicacion = primerNumero * segundoNumero;
        division = (double) primerNumero / segundoNumero;
        
        System.out.println("Los resultados son");
        System.out.println("Suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    }
    
}
