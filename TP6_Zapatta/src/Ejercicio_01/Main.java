/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author chino
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P01", "Arroz 1kg", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P02", "Smart TV 50", 2500, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P03", "Remera Negra", 1800, 100, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P04", "Silla de Madera", 3500, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P05", "Auriculares BT", 2200, 75, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        inventario.listarProductos();

        Producto encontrado = inventario.buscarProductoPorId("P03");

        if(encontrado != null) 
        {
            encontrado.mostrarInfo();
        }

        for(Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA)) 
        {
            p.mostrarInfo();
        }

        inventario.eliminarProducto("P04");
        inventario.listarProductos();

        inventario.actualizarStock("P01", 200);

        System.out.println(inventario.obtenerTotalStock());

        Producto mayor = inventario.obtenerProductoConMayorStock();

        if(mayor != null) 
        {
            mayor.mostrarInfo();
        }

        for(Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) 
        {
            p.mostrarInfo();
        }

        inventario.mostrarCategoriasDisponibles();
    }
}
