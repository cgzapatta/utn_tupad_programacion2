package org.jcr.entidades;

public class Matricula {
    private String numero;

    public Matricula(String numero) {
        // La matricula tiene que ser MP- mas 4 a 6 digitos
        if (numero == null || !numero.matches("MP-\\d{4,6}")) {
            throw new IllegalArgumentException("La matricula no tiene un formato valido");
        }
        this.numero = numero;
    }

    // Devuelve el numero tal cual, por ejemplo MP-1234
    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}
