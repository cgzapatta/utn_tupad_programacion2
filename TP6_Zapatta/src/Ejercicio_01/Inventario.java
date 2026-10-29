
package Ejercicio_01;
import java.util.ArrayList;

/**
 *
 * @author chino
 */
public class Inventario 
{
    private ArrayList<Producto> productos;

    public Inventario() 
    {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) 
    {
        productos.add(producto);
    }

    public void listarProductos() 
    {
        if(productos.isEmpty())
        {
            System.out.println("Inventario vacio");
            return;
        }

        for(Producto p : productos) 
        {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) 
    {
        for(Producto p : productos) 
        {
            if(p.getId().equals(id)) 
            {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String id) 
    {
        Producto producto = buscarProductoPorId(id);

        if(producto != null) 
        {
            productos.remove(producto);
            return true;
        }

        return false;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) 
    {
        Producto producto = buscarProductoPorId(id);

        if(producto != null) 
        {
            producto.setCantidad(nuevaCantidad);
            return true;
        }

        return false;
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) 
    {
        ArrayList<Producto> filtrados = new ArrayList<>();

        for(Producto p : productos) 
        {
            if(p.getCategoria() == categoria) 
            {
                filtrados.add(p);
            }
        }

        return filtrados;
    }

    public int obtenerTotalStock() 
    {
        int total = 0;

        for(Producto p : productos) 
        {
            total += p.getCantidad();
        }

        return total;
    }

    public Producto obtenerProductoConMayorStock() 
    {
        if(productos.isEmpty()) 
        {
            return null;
        }

        Producto mayor = productos.get(0);

        for(Producto p : productos) 
        {
            if(p.getCantidad() > mayor.getCantidad()) 
            {
                mayor = p;
            }
        }

        return mayor;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) 
    {
        ArrayList<Producto> filtrados = new ArrayList<>();

        for(Producto p : productos) 
        {
            if(p.getPrecio() >= min && p.getPrecio() <= max) 
            {
                filtrados.add(p);
            }
        }

        return filtrados;
    }

    public void mostrarCategoriasDisponibles() 
    {
        for(CategoriaProducto cat : CategoriaProducto.values()) 
        {
            System.out.println(cat + " " + cat.getDescripcion());
        }
    }
}
    

