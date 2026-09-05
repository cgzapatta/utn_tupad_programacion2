/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_zapatta;

/**
 *
 * @author chino
 */
public class Ejercicio_08 {
    public static void main(String[] args) {
    int a = 5;
    int b = 2;
    int resultado = a / b;
    System.out.println("Resultado: " + resultado);
    }
    /*
        ¿Cuál es el valor final de la variable resultado y por qué ocurre esto en Java al dividir
        dos números enteros?
        
        El valor final es 2 y ocurre porqué al dividir dos enteros el resultado queda entero
        Para solucionar esto debemos hacer el casting, agregar (double) a uno de los dos valores que vamos a dividir
        para que el resultado sea un double y se vean los valores despues de la coma.
    */
    
}
