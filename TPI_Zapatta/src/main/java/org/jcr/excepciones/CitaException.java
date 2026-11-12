package org.jcr.excepciones;
/**
 *
 * @author Carlos German Zapatta y Leonardo Laureano Gonzales
 * 
 */
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
