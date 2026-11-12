package org.jcr.entidades;

import java.time.LocalDateTime;
import org.jcr.enums.EstadoCita;

public class Cita {
    private Paciente paciente;
    private Medico medico;
    private Sala sala;
    private LocalDateTime fechaHora;
    private double costo;
    private EstadoCita estado;
    private String observaciones;

    public Cita(Paciente paciente, Medico medico, Sala sala, LocalDateTime fechaHora, double costo) {
        if (paciente == null) {
            throw new IllegalArgumentException("El paciente no puede ser nulo");
        }
        if (medico == null) {
            throw new IllegalArgumentException("El medico no puede ser nulo");
        }
        if (sala == null) {
            throw new IllegalArgumentException("La sala no puede ser nula");
        }
        if (fechaHora == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
        this.paciente = paciente;
        this.medico = medico;
        this.sala = sala;
        this.fechaHora = fechaHora;
        this.costo = costo;
        // Toda cita nueva arranca programada y sin observaciones
        this.estado = EstadoCita.PROGRAMADA;
        this.observaciones = "";
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Sala getSala() {
        return sala;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public double getCosto() {
        return costo;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    // El estado nulo no se acepta, queda el anterior
    public void setEstado(EstadoCita estado) {
        if (estado == null) {
            throw new IllegalArgumentException("El estado no puede ser nulo");
        }
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    // Si viene nulo queda como texto vacio
    public void setObservaciones(String observaciones) {
        if (observaciones == null) {
            this.observaciones = "";
        } else {
            this.observaciones = observaciones;
        }
    }

    @Override
    public String toString() {
        return "Cita{paciente=" + paciente.getNombreCompleto() + ", fecha=" + fechaHora + ", estado=" + estado + "}";
    }
}
