/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author chino
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // COMPOSICIÓN
    private Titular titular; // ASOCIACIÓN

    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() { return titular; }
    public Foto getFoto() { return foto; }
    public String getNumero() { return numero; }

    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + ", fecha=" + fechaEmision + ", " + foto + ", titular=" + (titular != null ? titular.getNombre() : "sin titular") + "]";
    }
}
