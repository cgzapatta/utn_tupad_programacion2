
package CasoPractico;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Main {
    public static void main(String[] args) {
        Producto<Integer> prod1 = new Producto<>(1, "Notebook", 1200);
        Producto<Integer> prod2 = new Producto<>(2, "Mouse", 25);
        Producto<String> prod3 = new Producto<>("A3", "Teclado", 45);
        Carrito<Producto<?>> carrito = new Carrito<>();
        carrito.agregarProducto(prod1);
        carrito.agregarProducto(prod2);
        carrito.agregarProducto(prod3);
        System.out.println("Productos en carrito:");
        for (Producto<?> p : carrito.getProductos()) {
            System.out.println(p);
        }
        System.out.println("Total carrito: " + carrito.calcularTotal());
        carrito.eliminarProducto(prod2);
        System.out.println("Despues de eliminar Mouse:");
        System.out.println("Total carrito: " + carrito.calcularTotal());
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(101, 500, LocalDate.of(2025, 5, 10)));
        pedidos.add(new Pedido(102, 150, LocalDate.of(2025, 3, 15)));
        pedidos.add(new Pedido(103, 320, LocalDate.of(2025, 8, 1)));
        System.out.println("\nPedidos sin ordenar:");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
        Collections.sort(pedidos);
        System.out.println("\nPedidos ordenados por total (Comparable):");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
        Collections.sort(pedidos, new PedidoPorFecha());
        System.out.println("\nPedidos ordenados por fecha (Comparator):");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
        Buscador<Pedido, Integer> buscador = new Buscador<>();
        Pedido encontrado = buscador.buscarPorId(pedidos, 102);
        if (encontrado != null) {
            System.out.println("\nPedido encontrado con ID 102: " + encontrado);
        } else {
            System.out.println("\nNo existe pedido con ID 102");
        }
        Pedido noEncontrado = Buscador.buscarConComodin(pedidos, 999);
        if (noEncontrado != null) {
            System.out.println("Pedido encontrado con ID 999: " + noEncontrado);
        } else {
            System.out.println("No existe pedido con ID 999");
        }
        System.out.println("\nUso de comodin ? extends Identificable:");
        buscador.mostrarListaConComodin(pedidos);
    }
}