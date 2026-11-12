package org.jcr.enums;

public enum TipoSangre {
    A_POSITIVO("A+"),
    A_NEGATIVO("A-"),
    B_POSITIVO("B+"),
    B_NEGATIVO("B-"),
    AB_POSITIVO("AB+"),
    AB_NEGATIVO("AB-"),
    O_POSITIVO("O+"),
    O_NEGATIVO("O-");

    private String descripcion;

    TipoSangre(String descripcion) {
        this.descripcion = descripcion;
    }

    // Devuelve como se escribe el grupo, por ejemplo A+
    public String getDescripcion() {
        return descripcion;
    }

    // El que puede donar a cualquiera es el O negativo
    public boolean esDonanteUniversal() {
        return this == O_NEGATIVO;
    }

    // El que puede recibir de cualquiera es el AB positivo
    public boolean esReceptorUniversal() {
        return this == AB_POSITIVO;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
