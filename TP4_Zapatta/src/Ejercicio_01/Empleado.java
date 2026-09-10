/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author chino
 */
public class Empleado {
    
    private final int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
        Empleado.totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this(Empleado.totalEmpleados + 1, nombre, puesto, 1000.0);
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public final void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getPuesto() {
        return this.puesto;
    }

    public final void setPuesto(String puesto) {
        if (puesto != null && !puesto.trim().isEmpty()) {
            this.puesto = puesto;
        }
    }

    public double getSalario() {
        return this.salario;
    }

    public final void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    public static int getTotalEmpleados() {
        return Empleado.totalEmpleados;
    }

    public static int mostrarTotalEmpleados() {
        return Empleado.totalEmpleados;
    }

    public void actualizarSalario(double porcentaje) {
        if (porcentaje >= 0) {
            this.salario += this.salario * (porcentaje / 100.0);
        }
    }

    public void actualizarSalario(int cantidadFija) {
        if (cantidadFija >= 0) {
            this.salario += cantidadFija;
        }
    }

    @Override
    public String toString() {
        return "Empleado ID: " + this.id + ", Nombre: " + this.nombre + ", Puesto: " + this.puesto + ", Salario: " + this.salario;
    }
}
