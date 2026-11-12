package org.jcr.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jcr.enums.EspecialidadMedica;
import org.jcr.enums.TipoSangre;

public class Medico extends Persona {
    private Matricula matricula;
    private EspecialidadMedica especialidad;
    private Departamento departamento;
    private List<Cita> citas;

    public Medico(String nombre, String apellido, String dni, LocalDate fechaNacimiento, TipoSangre tipoSangre, String matricula, EspecialidadMedica especialidad) {
        super(nombre, apellido, dni, fechaNacimiento, tipoSangre);
        if (especialidad == null) {
            throw new IllegalArgumentException("La especialidad no puede ser nula");
        }
        // La matricula se revisa sola cuando se crea
        this.matricula = new Matricula(matricula);
        this.especialidad = especialidad;
        this.citas = new ArrayList<Cita>();
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public EspecialidadMedica getEspecialidad() {
        return especialidad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    // Cambia de departamento y lo saca del anterior
    public void setDepartamento(Departamento departamento) {
        if (this.departamento == departamento) {
            return;
        }
        Departamento anterior = this.departamento;
        this.departamento = departamento;
        if (anterior != null) {
            anterior.quitarMedico(this);
        }
        if (departamento != null) {
            departamento.agregarMedicoSinAviso(this);
        }
    }

    // Devuelve las citas sin dejar que se cambien desde afuera
    public List<Cita> getCitas() {
        return Collections.unmodifiableList(citas);
    }

    public void agregarCita(Cita cita) {
        if (cita != null && !citas.contains(cita)) {
            citas.add(cita);
        }
    }

    @Override
    public String toString() {
        return "Medico{nombre=" + getNombreCompleto() + ", especialidad=" + especialidad + "}";
    }
}
