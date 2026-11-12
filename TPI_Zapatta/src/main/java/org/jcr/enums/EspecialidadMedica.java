package org.jcr.enums;

public enum EspecialidadMedica {
    CARDIOLOGIA("Cardiología", 30),
    PEDIATRIA("Pediatría", 30),
    TRAUMATOLOGIA("Traumatología", 30),
    NEUROLOGIA("Neurología", 45),
    DERMATOLOGIA("Dermatología", 20),
    OFTALMOLOGIA("Oftalmología", 20),
    GINECOLOGIA("Ginecología", 30),
    PSIQUIATRIA("Psiquiatría", 60),
    ONCOLOGIA("Oncología", 45),
    ENDOCRINOLOGIA("Endocrinología", 30),
    NEUMONOLOGIA("Neumonología", 30),
    GASTROENTEROLOGIA("Gastroenterología", 30);

    private String descripcion;
    private int duracionConsultaMinutos;

    EspecialidadMedica(String descripcion, int duracionConsultaMinutos) {
        this.descripcion = descripcion;
        this.duracionConsultaMinutos = duracionConsultaMinutos;
    }

    // Devuelve el nombre lindo de la especialidad
    public String getDescripcion() {
        return descripcion;
    }

    // Cuanto dura una consulta de esta especialidad
    public int getDuracionConsultaMinutos() {
        return duracionConsultaMinutos;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
