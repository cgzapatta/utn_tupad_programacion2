package Excepciones;

import java.util.Scanner;
/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese dividendo: ");
            double a = sc.nextDouble();
            System.out.print("Ingrese divisor: ");
            double b = sc.nextDouble();

            if (b == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }

            double resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa");
            sc.close();
        }
    }
}
