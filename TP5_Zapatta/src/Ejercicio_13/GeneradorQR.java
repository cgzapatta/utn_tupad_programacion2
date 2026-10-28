/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_13;

/**
 *
 * @author chino
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado: " + qr.getValor() + " para " + qr.getUsuario().getNombre());
    }
}