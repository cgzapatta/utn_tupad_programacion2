package org.jcr.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jcr.enums.EspecialidadMedica;
/**
 *
 * @author Carlos German Zapatta y Leonardo Laureano Gonzales
 * 
 */
public class Departamento {
    private String nombre;
    private EspecialidadMedica especialidad;
    private Hospital hospital;
    private List<Medico> medicos;
    private List<Sala> salas;

    public Departamento(String nombre, EspecialidadMedica especialidad) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del departamento no puede estar vacio");
        }
        if (especialidad == null) {
            throw new IllegalArgumentException("La especialidad no puede ser nula");
        }
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.medicos = new ArrayList<Medico>();
        this.salas = new ArrayList<Sala>();
    }

    public String getNombre() {
        return nombre;
    }

    public EspecialidadMedica getEspecialidad() {
        return especialidad;
    }

    public Hospital getHospital() {
        return hospital;
    }

    // Cambia de hospital y lo saca del anterior
    public void setHospital(Hospital hospital) {
        if (this.hospital == hospital) {
            return;
        }
        Hospital anterior = this.hospital;
        this.hospital = hospital;
        if (anterior != null) {
            anterior.quitarDepartamento(this);
        }
        if (hospital != null) {
            hospital.agregarDepartamentoSinAviso(this);
        }
    }

    // Las listas se devuelven sin dejar que se cambien desde afuera
    public List<Medico> getMedicos() {
        return Collections.unmodifiableList(medicos);
    }

    public List<Sala> getSalas() {
        return Collections.unmodifiableList(salas);
    }

    // El medico tiene que ser de la misma especialidad del departamento
    public void agregarMedico(Medico medico) {
        if (medico == null) {
            throw new IllegalArgumentException("El medico no puede ser nulo");
        }
        if (medico.getEspecialidad() != especialidad) {
            throw new IllegalArgumentException("El medico no es de esta especialidad");
        }
        if (!medicos.contains(medico)) {
            medicos.add(medico);
        }
        if (medico.getDepartamento() != this) {
            medico.setDepartamento(this);
        }
    }

    void agregarMedicoSinAviso(Medico medico) {
        if (medico != null && !medicos.contains(medico)) {
            medicos.add(medico);
        }
    }

    void quitarMedico(Medico medico) {
        medicos.remove(medico);
    }

    // Crea la sala y ya la deja dentro del departamento
    public Sala crearSala(String numero, String tipo) {
        Sala sala = new Sala(numero, tipo, this);
        salas.add(sala);
        return sala;
    }

    @Override
    public String toString() {
        return "Departamento{nombre=" + nombre + "}";
    }
}
