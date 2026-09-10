/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author chino
 */
public class Producto {
    
    private String nombre;
    private double precioBase;
    private static double IVA = 0.21;

    public Producto(String nombre, double precioBase) {
        setNombre(nombre);
        setPrecioBase(precioBase);
    }

    public Producto(String nombre) {
        this(nombre, 100.0);
    }

    public String getNombre() {
        return this.nombre;
    }

    public final void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    public final void setPrecioBase(double precioBase) {
        if (precioBase >= 0.0) {
            this.precioBase = precioBase;
        }
    }

    public static double getIVA() {
        return Producto.IVA;
    }

    public static void cambiarIVA(double nuevo) {
        if (nuevo >= 0.0) {
            Producto.IVA = nuevo;
        }
    }

    public double calcularPrecioFinal() {
        return this.precioBase * (1.0 + Producto.IVA);
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0.0 && porcentaje <= 100.0) {
            double descuento = this.precioBase * (porcentaje / 100.0);
            setPrecioBase(this.precioBase - descuento);
        }
    }

    public void aplicarDescuento(double porcentaje, double precioMinimo) {
        if (porcentaje >= 0.0 && porcentaje <= 100.0 && precioMinimo >= 0.0) {
            double descuento = this.precioBase * (porcentaje / 100.0);
            double precioCalculado = this.precioBase - descuento;
            if (precioCalculado < precioMinimo) {
                setPrecioBase(precioMinimo);
            } else {
                setPrecioBase(precioCalculado);
            }
        }
    }

    @Override
    public String toString() {
        return "Producto: " + this.nombre + ", Precio Base: " + this.precioBase + ", Precio Final (con IVA): " + calcularPrecioFinal();
    }
}
