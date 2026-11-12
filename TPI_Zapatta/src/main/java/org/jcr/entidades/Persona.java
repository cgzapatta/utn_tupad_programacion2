package org.jcr.entidades;

import java.time.LocalDate;
import java.time.Period;
import org.jcr.enums.TipoSangre;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected LocalDate fechaNacimiento;
    protected TipoSangre tipoSangre;

    public Persona(String nombre, String apellido, String dni, LocalDate fechaNacimiento, TipoSangre tipoSangre) {
        // Aca se revisan los datos basicos que tienen que venir bien
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede estar vacio");
        }
        if (dni == null || !dni.matches("\\d{7,8}")) {
            throw new IllegalArgumentException("El dni tiene que tener 7 u 8 digitos");
        }
        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula");
        }
        if (tipoSangre == null) {
            throw new IllegalArgumentException("El tipo de sangre no puede ser nulo");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    // Calcula la edad fijandose si ya cumplio este anio
    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Persona{nombre=" + getNombreCompleto() + ", dni=" + dni + "}";
    }
}
