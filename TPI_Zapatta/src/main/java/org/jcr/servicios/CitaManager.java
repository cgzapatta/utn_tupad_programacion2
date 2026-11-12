package org.jcr.servicios;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jcr.entidades.Cita;
import org.jcr.entidades.Medico;
import org.jcr.entidades.Paciente;
import org.jcr.entidades.Sala;
import org.jcr.excepciones.CitaException;

public class CitaManager implements CitaService {
    private List<Cita> citas;

    public CitaManager() {
        this.citas = new ArrayList<Cita>();
    }

    @Override
    public Cita programarCita(Paciente paciente, Medico medico, Sala sala, LocalDateTime fechaHora, double costo) throws CitaException {
        // Primero se revisa que no falte ningun dato y que el costo sea valido
        if (paciente == null || medico == null || sala == null || fechaHora == null) {
            throw new CitaException("Faltan datos para programar la cita");
        }
        if (fechaHora.isBefore(LocalDateTime.now())) {
            throw new CitaException("La cita no puede ser en el pasado");
        }
        if (costo <= 0) {
            throw new CitaException("El costo tiene que ser mayor a cero");
        }
        if (sala.getDepartamento() != null && medico.getEspecialidad() != sala.getDepartamento().getEspecialidad()) {
            throw new CitaException("El medico no es de la especialidad de la sala");
        }
        // Entre cita y cita del mismo medico o sala tienen que pasar 2 horas
        for (int i = 0; i < citas.size(); i++) {
            Cita existente = citas.get(i);
            long minutos = Math.abs(Duration.between(existente.getFechaHora(), fechaHora).toMinutes());
            if (minutos < 120) {
                if (existente.getMedico() == medico) {
                    throw new CitaException("El medico no esta disponible en ese horario");
                }
                if (existente.getSala() == sala) {
                    throw new CitaException("La sala no esta disponible en ese horario");
                }
            }
        }
        Cita cita = new Cita(paciente, medico, sala, fechaHora, costo);
        citas.add(cita);
        paciente.agregarCita(cita);
        medico.agregarCita(cita);
        sala.agregarCita(cita);
        return cita;
    }

    // Busca las citas de un paciente
    @Override
    public List<Cita> getCitasPorPaciente(Paciente paciente) {
        List<Cita> resultado = new ArrayList<Cita>();
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getPaciente() == paciente) {
                resultado.add(citas.get(i));
            }
        }
        return Collections.unmodifiableList(resultado);
    }

    @Override
    public List<Cita> getCitasPorMedico(Medico medico) {
        List<Cita> resultado = new ArrayList<Cita>();
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getMedico() == medico) {
                resultado.add(citas.get(i));
            }
        }
        return Collections.unmodifiableList(resultado);
    }

    @Override
    public List<Cita> getCitasPorSala(Sala sala) {
        List<Cita> resultado = new ArrayList<Cita>();
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getSala() == sala) {
                resultado.add(citas.get(i));
            }
        }
        return Collections.unmodifiableList(resultado);
    }
}
