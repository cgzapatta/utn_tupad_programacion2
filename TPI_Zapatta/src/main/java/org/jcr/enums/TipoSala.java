package org.jcr.enums;
/**
 *
 * @author Carlos German Zapatta y Leonardo Laureano Gonzales
 * 
 */
public enum TipoSala {
    CONSULTORIO("Consultorio", 2),
    QUIROFANO("Quirófano", 10),
    EMERGENCIAS("Emergencias", 5);

    private String descripcion;
    private int capacidadMaxima;

    TipoSala(String descripcion, int capacidadMaxima) {
        this.descripcion = descripcion;
        this.capacidadMaxima = capacidadMaxima;
    }

    // Devuelve el nombre del tipo de sala
    public String getDescripcion() {
        return descripcion;
    }

    // Cuanta gente entra como maximo en este tipo de sala
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
