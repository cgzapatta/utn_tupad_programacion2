package Excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Division segura");
        probarDivision(10, 2);
        probarDivision(10, 0);
        System.out.println("\n2. Conversion de cadena a numero");
        probarConversion("123");
        probarConversion("abc");
        System.out.println("\n3. Lectura de archivo y 5. Try with resources");
        String archivoPrueba = "src/excepciones/prueba.txt";
        crearArchivoPrueba(archivoPrueba);
        leerArchivoClasico(archivoPrueba);
        leerArchivoClasico("no_existe.txt");
        leerConTryWithResources(archivoPrueba);
        System.out.println("\n4. Excepcion personalizada EdadInvalida");
        validarEdad(25);
        validarEdad(-5);
        validarEdad(130);
    }
    private static void probarDivision(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            System.out.println(a + " / " + b + " = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin prueba division " + a + "/" + b);
        }
    }
    private static void probarConversion(String texto) {
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Texto '" + texto + "' convertido a " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + texto + "' no es un numero valido");
        }
    }
    private static void crearArchivoPrueba(String nombre) {
        try (FileWriter fw = new FileWriter(nombre)) {
            fw.write("Linea 1 de prueba\nLinea 2 de prueba\n");
        } catch (IOException e) {
            System.out.println("No se pudo crear archivo de prueba");
        }
    }
    private static void leerArchivoClasico(String nombre) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(nombre));
            String linea;
            System.out.println("Leyendo " + nombre + ":");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: Archivo " + nombre + " no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }
    }
    private static void leerConTryWithResources(String nombre) {
        System.out.println("Leyendo con try-with-resources " + nombre + ":");
        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    private static void validarEdad(int edad) {
        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad invalida: " + edad + " debe estar entre 0 y 120");
            }
            System.out.println("Edad valida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}