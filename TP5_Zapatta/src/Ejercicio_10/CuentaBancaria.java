/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

/**
 *
 * @author chino
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaClave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, fechaClave);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave.getCodigo() + "]";
    }
}