/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author chino
 */
public class Main {
    public static void main(String[] args) {
        Bateria bat = new Bateria("Li-Ion 5000", 5000);
        Usuario user = new Usuario("German Zapatta", "40123456");
        Celular cel = new Celular("356789012345678", "【entity-Samsung¦canonical_name=Samsung】", "S23", bat);

        cel.setUsuario(user);

        System.out.println("Marca: " + cel.getMarca());
        System.out.println("Modelo: " + cel.getModelo());
        System.out.println("Bateria: " + cel.getBateria().getModelo());
        System.out.println("Propietario: " + cel.getUsuario().getNombre());
    }
}