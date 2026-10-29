package Excepciones;

import java.util.Scanner;
/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class ConversionNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un texto para convertir a int: ");
            String texto = sc.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un numero valido");
        } finally {
            sc.close();
        }
    }
}
