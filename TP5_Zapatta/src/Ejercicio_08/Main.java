/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_08;

/**
 *
 * @author chino
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Titulo del documento: ");
        String titulo = sc.nextLine();

        System.out.print("Contenido del documento: ");
        String contenido = sc.nextLine();

        System.out.print("Codigo Hash de la firma: ");
        String hash = sc.nextLine();

        System.out.print("Fecha de la firma: ");
        String fecha = sc.nextLine();

        System.out.print("Nombre del usuario: ");
        String nombre = sc.nextLine();

        System.out.print("Email del usuario: ");
        String email = sc.nextLine();

        Usuario usuario1 = new Usuario(nombre, email);
        Documento doc1 = new Documento(titulo, contenido, hash, fecha, usuario1);

        System.out.println("\n1. Usuario ingresado (Agregacion):");
        System.out.println(usuario1);

        System.out.println("\n2. FirmaDigital (contiene al usuario):");
        System.out.println(doc1.getFirmaDigital());

        System.out.println("\n3. Documento completo (Composicion de Firma):");
        System.out.println(doc1);

        System.out.println("\n4. Verificacion Composicion:");
        System.out.println("El documento '" + doc1.getTitulo() + "' tiene la firma: " + doc1.getFirmaDigital().getCodigoHash());

        System.out.println("\n5. Verificacion Agregacion:");
        System.out.println("La firma pertenece a: " + doc1.getFirmaDigital().getUsuario().getNombre() + " - " + doc1.getFirmaDigital().getUsuario().getEmail());

        sc.close();
    }
}