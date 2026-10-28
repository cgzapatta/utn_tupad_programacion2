/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_09;

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("German Zapatta", "OSDE 210");
        Profesional profesional1 = new Profesional("Dra. Lopez", "Cardiologia");
        CitaMedica cita1 = new CitaMedica("2026-10-28", "10:30", paciente1, profesional1);

        System.out.println("1. Datos del Paciente:");
        System.out.println(paciente1);

        System.out.println("\n2. Datos del Profesional:");
        System.out.println(profesional1);

        System.out.println("\n3. Datos de la Cita:");
        System.out.println(cita1);

        System.out.println("\n4. Verificacion Unidireccional a Paciente:");
        System.out.println("La cita del " + cita1.getFecha() + " es para: " + cita1.getPaciente().getNombre());

        System.out.println("\n5. Verificacion Unidireccional a Profesional:");
        System.out.println("Atiende: " + cita1.getProfesional().getNombre() + " - " + cita1.getProfesional().getEspecialidad());
    }
}