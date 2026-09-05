/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author chino
 */
public class NaveEspacial {
    
    private String nombre;
    private double combustible;
    private final double CAPACIDAD_MAXIMA = 100.0;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacio.");
        }
    }

    public void setCombustible(double combustible) {
        if (combustible >= 0.0 && combustible <= CAPACIDAD_MAXIMA) {
            this.combustible = combustible;
        } else {
            System.out.println("Error: Combustible invalido.");
        }
    }

    public String getNombre() {
        return nombre; }
    
    public double getCombustible() {
        return combustible; }
    
    public double getCAPACIDAD_MAXIMA() {
        return CAPACIDAD_MAXIMA; }

    public void despegar() {
        double costo = 5.0;
        if (this.combustible >= costo) {
            this.combustible -= costo;
            System.out.println("Despegue exitoso.");
        } else {
            System.out.println("Error: Combustible insuficiente para despegar.");
        }
    }

    public void avanzar(double distancia) {
        double costo = distancia * 2.0;
        if (this.combustible >= costo) {
            this.combustible -= costo;
            System.out.println("Avanzo " + distancia + " km.");
        } else {
            System.out.println("Error: Combustible insuficiente para avanzar.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: Cantidad invalida.");
        } else if (this.combustible + cantidad > CAPACIDAD_MAXIMA) {
            System.out.println("Error: La recarga supera la capacidad maxima de " + CAPACIDAD_MAXIMA);
        } else {
            this.combustible += cantidad;
            System.out.println("Recarga exitosa.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + this.nombre);
        System.out.println("Combustible: " + this.combustible + " / " + CAPACIDAD_MAXIMA);
    }
}
