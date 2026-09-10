/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author chino
 */
public class Cuenta {
    
    private final int numero;
    private String titular;
    private double saldo;
    private static int ultimoNumero = 100;
    private static int totalCuentas = 0;

    public Cuenta(String titular, double saldoInicial) {
        this.numero = ++Cuenta.ultimoNumero;
        setTitular(titular);
        setSaldo(saldoInicial);
        Cuenta.totalCuentas++;
    }

    public Cuenta(String titular) {
        this(titular, 0.0);
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public final void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        if (saldo >= 0.0) {
            this.saldo = saldo;
        }
    }

    public static int getTotalCuentas() {
        return Cuenta.totalCuentas;
    }

    public static int mostrarTotalCuentas() {
        return Cuenta.totalCuentas;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public double consultarSaldo(double cotizacionDolar) {
        if (cotizacionDolar > 0.0) {
            return this.saldo / cotizacionDolar;
        }
        return 0.0;
    }

    public void depositar(double monto) {
        if (monto > 0.0) {
            this.saldo += monto;
        }
    }

    public void extraer(double monto) {
        if (monto > 0.0 && this.saldo >= monto) {
            this.saldo -= monto;
        }
    }

    @Override
    public String toString() {
        return "Cuenta Nro: " + this.numero + ", Titular: " + this.titular + ", Saldo: $" + String.format("%.2f", this.saldo);
    }
}
