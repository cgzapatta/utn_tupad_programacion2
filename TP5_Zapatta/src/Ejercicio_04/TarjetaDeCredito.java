/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author chino
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito [numero=" + numero + ", vencimiento=" + fechaVencimiento + ", banco=" + banco.getNombre() + ", cliente=" + (cliente != null ? cliente.getNombre() : "sin cliente") + "]";
    }
}