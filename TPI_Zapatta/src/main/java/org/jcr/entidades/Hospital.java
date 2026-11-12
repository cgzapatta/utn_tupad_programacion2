package org.jcr.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Carlos German Zapatta y Leonardo Laureano Gonzales
 * 
 */
public class Hospital {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Departamento> departamentos;
    private List<Paciente> pacientes;

    public Hospital(String nombre, String direccion, String telefono) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del hospital no puede estar vacio");
        }
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.departamentos = new ArrayList<Departamento>();
        this.pacientes = new ArrayList<Paciente>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    // Las listas se devuelven sin dejar que se cambien desde afuera
    public List<Departamento> getDepartamentos() {
        return Collections.unmodifiableList(departamentos);
    }

    public List<Paciente> getPacientes() {
        return Collections.unmodifiableList(pacientes);
    }

    // Agrega sin duplicar y avisa al otro lado de la relacion
    public void agregarDepartamento(Departamento departamento) {
        if (departamento == null) {
            return;
        }
        if (!departamentos.contains(departamento)) {
            departamentos.add(departamento);
        }
        if (departamento.getHospital() != this) {
            departamento.setHospital(this);
        }
    }

    public void agregarPaciente(Paciente paciente) {
        if (paciente == null) {
            return;
        }
        if (!pacientes.contains(paciente)) {
            pacientes.add(paciente);
        }
        if (paciente.getHospital() != this) {
            paciente.setHospital(this);
        }
    }

    void agregarPacienteSinAviso(Paciente paciente) {
        if (paciente != null && !pacientes.contains(paciente)) {
            pacientes.add(paciente);
        }
    }

    void agregarDepartamentoSinAviso(Departamento departamento) {
        if (departamento != null && !departamentos.contains(departamento)) {
            departamentos.add(departamento);
        }
    }

    void quitarPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    void quitarDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    @Override
    public String toString() {
        return "Hospital{nombre=" + nombre + "}";
    }
}
