/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

/**
 *
 * @author chino
 */
public class Titular {
    private String nombre;
    private int dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + "]";
    }
}