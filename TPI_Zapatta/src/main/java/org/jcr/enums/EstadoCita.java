package org.jcr.enums;
/**
 *
 * @author Carlos German Zapatta y Leonardo Laureano Gonzales
 * 
 */
public enum EstadoCita {
    PROGRAMADA("Programada"),
    CONFIRMADA("Confirmada"),
    COMPLETADA("Completada"),
    CANCELADA("Cancelada"),
    NO_ASISTIO("No Asistió");

    private String descripcion;

    EstadoCita(String descripcion) {
        this.descripcion = descripcion;
    }

    // Devuelve como se muestra el estado
    public String getDescripcion() {
        return descripcion;
    }

    // Dice si la cita ya quedo cerrada y no se toca mas
    public boolean esFinal() {
        return this == COMPLETADA || this == CANCELADA || this == NO_ASISTIO;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
