
package Ejercicio_02;

/**
 *
 * @author chino
 */
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("1. Crear una biblioteca");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        System.out.println("2. Crear al menos tres autores");
        Autor autor1 = new Autor("A01", "Gabriel Garcia Marquez", "Colombiana");
        Autor autor2 = new Autor("A02", "Jorge Luis Borges", "Argentina");
        Autor autor3 = new Autor("A03", "【entity-Isabel Allende¦canonical_name=Isabel Allende】", "Chilena");

        System.out.println("3. Agregar 5 libros a la biblioteca");
        biblioteca.agregarLibro("ISBN001", "Cien anios de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del colera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "Ficciones", 1944, autor2);
        biblioteca.agregarLibro("ISBN004", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("ISBN005", "La casa de los espiritus", 1982, autor3);

        System.out.println("4. Listar todos los libros");
        biblioteca.listarLibros();

        System.out.println("5. Buscar un libro por su ISBN");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");

        if(buscado != null) 
        {
            buscado.mostrarInfo();
        }

        System.out.println("6. Filtrar libros por anio");
        List<Libro> libros1949 = biblioteca.filtrarLibrosPorAnio(1949);

        for(Libro l : libros1949) 
        {
            l.mostrarInfo();
        }

        System.out.println("7. Eliminar un libro por ISBN y listar restantes");
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();

        System.out.println("8. Mostrar cantidad total de libros");
        System.out.println(biblioteca.obtenerCantidadLibros());

        System.out.println("9. Listar todos los autores disponibles");
        biblioteca.mostrarAutoresDisponibles();
    }
}
