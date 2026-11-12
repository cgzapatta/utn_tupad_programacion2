package org.jcr.excepciones;

public class CitaException extends Exception {

    // Se usa cuando algo sale mal al programar una cita
    public CitaException(String mensaje) {
        super(mensaje);
    }

    public CitaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

    public CitaException() {
        super("Error en la cita");
    }
}
