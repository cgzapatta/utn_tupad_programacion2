
package Ejercicio_03;

/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Curso 
{
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public Profesor getProfesor() 
    {
        return profesor;
    }

    public void setProfesor(Profesor nuevoProfesor) 
    {
        if(this.profesor == nuevoProfesor)
        {
            return;
        }

        Profesor profesorAnterior = this.profesor;
        this.profesor = nuevoProfesor;

        if(profesorAnterior != null)
        {
            profesorAnterior.getCursos().remove(this);
        }

        if(nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this))
        {
            nuevoProfesor.getCursos().add(this);
        }
    }

    public void mostrarInfo() 
    {
        String nombreProfesor = "Sin profesor";

        if(profesor != null)
        {
            nombreProfesor = profesor.getNombre();
        }

        System.out.println("Curso: " + codigo + " " + nombre + " Profesor: " + nombreProfesor);
    }
}