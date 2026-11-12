package org.jcr.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistoriaClinica {
    private Paciente paciente;
    private String numeroHistoria;
    private List<String> diagnosticos;
    private List<String> tratamientos;
    private List<String> alergias;

    public HistoriaClinica(Paciente paciente) {
        if (paciente == null) {
            throw new IllegalArgumentException("El paciente no puede ser nulo");
        }
        this.paciente = paciente;
        // El numero se arma con el dni y el anio actual
        this.numeroHistoria = "HC-" + paciente.getDni() + "-" + LocalDate.now().getYear();
        this.diagnosticos = new ArrayList<String>();
        this.tratamientos = new ArrayList<String>();
        this.alergias = new ArrayList<String>();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    // Las listas se devuelven sin dejar que se cambien desde afuera
    public List<String> getDiagnosticos() {
        return Collections.unmodifiableList(diagnosticos);
    }

    public List<String> getTratamientos() {
        return Collections.unmodifiableList(tratamientos);
    }

    public List<String> getAlergias() {
        return Collections.unmodifiableList(alergias);
    }

    // Si viene vacio o nulo no se guarda nada
    public void agregarDiagnostico(String diagnostico) {
        if (diagnostico == null || diagnostico.trim().isEmpty()) {
            return;
        }
        diagnosticos.add(diagnostico);
    }

    public void agregarTratamiento(String tratamiento) {
        if (tratamiento == null || tratamiento.trim().isEmpty()) {
            return;
        }
        tratamientos.add(tratamiento);
    }

    public void agregarAlergia(String alergia) {
        if (alergia == null || alergia.trim().isEmpty()) {
            return;
        }
        alergias.add(alergia);
    }

    @Override
    public String toString() {
        return "HistoriaClinica{numero=" + numeroHistoria + "}";
    }
}
