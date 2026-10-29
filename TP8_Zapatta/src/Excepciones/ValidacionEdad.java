package Excepciones;

import java.util.Scanner;
/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class ValidacionEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese edad: ");
            int edad = sc.nextInt();

            if (edad < 0 || edad >= 120) {
                throw new EdadInvalidaException("Edad invalida: debe estar entre 0 y 119");
            }

            System.out.println("Edad valida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
