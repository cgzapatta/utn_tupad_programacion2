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
public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingese un numero: ");
        int primerNumero,  segundoNumero;
        double division;
        primerNumero = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese segundo numero: ");
        segundoNumero = Integer.parseInt(input.nextLine());
        
      
        division = primerNumero / segundoNumero;
        
        System.out.println("Los resultado es");
        System.out.println("Division: " + division);
        
        //MODIFICADO, ahora el resultado contempla el valor luego de la coma
        
        System.out.print("Ingese un numero: ");
        
        double primerNumeroMod,  segundoNumeroMod, divisionMod;
        
        primerNumeroMod = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese segundo numero: ");
        segundoNumeroMod = Integer.parseInt(input.nextLine());
        
      
        divisionMod = primerNumeroMod / segundoNumeroMod;
        
        System.out.println("Los resultado es");
        System.out.println("Division: " + divisionMod);
        }
}

