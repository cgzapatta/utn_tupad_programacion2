
package Ejercicio_03;

/**
 *
 * @author Carlos German Zapatta
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Universidad 
{
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) 
    {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) 
    {
        if(p != null && !profesores.contains(p))
        {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) 
    {
        if(c != null && !cursos.contains(c))
        {
            cursos.add(c);
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) 
    {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if(curso != null && profesor != null)
        {
            curso.setProfesor(profesor);
        }
    }

    public void listarProfesores() 
    {
        for(Profesor p : profesores) 
        {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println();
        }
    }

    public void listarCursos() 
    {
        for(Curso c : cursos) 
        {
            c.mostrarInfo();
        }
    }

    public Profesor buscarProfesorPorId(String id) 
    {
        for(Profesor p : profesores) 
        {
            if(p.getId().equals(id))
            {
                return p;
            }
        }

        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) 
    {
        for(Curso c : cursos) 
        {
            if(c.getCodigo().equals(codigo))
            {
                return c;
            }
        }

        return null;
    }

    public boolean eliminarCurso(String codigo) 
    {
        Curso curso = buscarCursoPorCodigo(codigo);

        if(curso != null)
        {
            curso.setProfesor(null);
            cursos.remove(curso);
            return true;
        }

        return false;
    }

    public boolean eliminarProfesor(String id) 
    {
        Profesor profesor = buscarProfesorPorId(id);

        if(profesor != null)
        {
            List<Curso> copia = new ArrayList<>(profesor.getCursos());

            for(Curso c : copia)
            {
                c.setProfesor(null);
            }

            profesores.remove(profesor);
            return true;
        }

        return false;
    }
}