
package Ejercicio_02;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author chino
 */


public class Biblioteca 
{
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) 
    {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) 
    {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    public void listarLibros() 
    {
        if(libros.isEmpty())
        {
            System.out.println("Biblioteca vacia");
            return;
        }

        for(Libro l : libros) 
        {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) 
    {
        for(Libro l : libros) 
        {
            if(l.getIsbn().equals(isbn)) 
            {
                return l;
            }
        }

        return null;
    }

    public boolean eliminarLibro(String isbn) 
    {
        Libro libro = buscarLibroPorIsbn(isbn);

        if(libro != null) 
        {
            libros.remove(libro);
            return true;
        }

        return false;
    }

    public int obtenerCantidadLibros() 
    {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) 
    {
        List<Libro> filtrados = new ArrayList<>();

        for(Libro l : libros) 
        {
            if(l.getAnioPublicacion() == anio) 
            {
                filtrados.add(l);
            }
        }

        return filtrados;
    }

    public void mostrarAutoresDisponibles() 
    {
        List<String> idsMostrados = new ArrayList<>();

        for(Libro l : libros) 
        {
            String idAutor = l.getAutor().getId();

            if(!idsMostrados.contains(idAutor)) 
            {
                l.getAutor().mostrarInfo();
                idsMostrados.add(idAutor);
            }
        }
    }
}