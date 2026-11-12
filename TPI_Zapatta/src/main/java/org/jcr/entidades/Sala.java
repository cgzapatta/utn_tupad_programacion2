package org.jcr.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Carlos German Zapatta y Leonardo Laureano Gonzales
 * 
 */
public class Sala {
    private String numero;
    private String tipo;
    private Departamento departamento;
    private List<Cita> citas;

    public Sala(String numero, String tipo, Departamento departamento) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("El numero de sala no puede estar vacio");
        }
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de sala no puede estar vacio");
        }
        this.numero = numero;
        this.tipo = tipo;
        this.departamento = departamento;
        this.citas = new ArrayList<Cita>();
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public Departamento getDepartamento() {
        return departamento;
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
        return "Sala{numero=" + numero + ", tipo=" + tipo + "}";
    }
}
