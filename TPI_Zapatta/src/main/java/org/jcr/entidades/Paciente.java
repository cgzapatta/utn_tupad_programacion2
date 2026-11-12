package org.jcr.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jcr.enums.TipoSangre;
/**
 *
 * @author Carlos German Zapatta y Leonardo Laureano Gonzales
 * 
 */
public class Paciente extends Persona {
    private String telefono;
    private String direccion;
    private HistoriaClinica historiaClinica;
    private Hospital hospital;
    private List<Cita> citas;

    public Paciente(String nombre, String apellido, String dni, LocalDate fechaNacimiento, TipoSangre tipoSangre, String telefono, String direccion) {
        super(nombre, apellido, dni, fechaNacimiento, tipoSangre);
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El telefono no puede estar vacio");
        }
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La direccion no puede estar vacia");
        }
        this.telefono = telefono;
        this.direccion = direccion;
        this.citas = new ArrayList<Cita>();
        // Cada paciente nace con su historia clinica
        this.historiaClinica = new HistoriaClinica(this);
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
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
            anterior.quitarPaciente(this);
        }
        if (hospital != null) {
            hospital.agregarPacienteSinAviso(this);
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
        return "Paciente{nombre=" + getNombreCompleto() + ", dni=" + dni + "}";
    }
}
