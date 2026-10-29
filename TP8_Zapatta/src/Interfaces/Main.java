package Interfaces;
/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("German");
        Cliente cliente2 = new Cliente("Lucia");
        Producto notebook = new Producto("Notebook", 1200);
        Producto mouse = new Producto("Mouse", 25);
        Producto teclado = new Producto("Teclado", 45);
        Producto monitor = new Producto("Monitor", 300);
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.agregarProducto(notebook);
        pedido1.agregarProducto(mouse);
        pedido1.agregarProducto(teclado);
        Pedido pedido2 = new Pedido(cliente2);
        pedido2.agregarProducto(monitor);
        pedido2.agregarProducto(mouse);
        System.out.println("Pedido 1 de " + cliente1.getNombre());
        for (Producto p : pedido1.getProductos()) {
            System.out.println(p.getNombre() + " $" + p.calcularTotal());
        }
        System.out.println("Total sin descuento: $" + pedido1.calcularTotal());
        System.out.println("Estado inicial: " + pedido1.getEstado());
        PagoConDescuento pagoTarjeta = new PagoConTarjetaCredito();
        System.out.println("Descuento tarjeta aplicado: $" + pagoTarjeta.aplicarDescuento(pedido1.calcularTotal()));
        pedido1.cambiarEstado(EstadoPedido.EN_PROCESO);
        pagoTarjeta.procesarPago(pedido1.calcularTotal());
        pedido1.cambiarEstado(EstadoPedido.PAGADO);
        System.out.println("");
        System.out.println("Pedido 2 de " + cliente2.getNombre());
        for (Producto p : pedido2.getProductos()) {
            System.out.println(p.getNombre() + " $" + p.calcularTotal());
        }
        System.out.println("Total sin descuento: $" + pedido2.calcularTotal());
        System.out.println("Estado inicial: " + pedido2.getEstado());
        PagoConDescuento pagoPayPal = new PagoConPayPal();
        System.out.println("Descuento PayPal aplicado: $" + pagoPayPal.aplicarDescuento(pedido2.calcularTotal()));
        pedido2.cambiarEstado(EstadoPedido.EN_PROCESO);
        pagoPayPal.procesarPago(pedido2.calcularTotal());
        pedido2.cambiarEstado(EstadoPedido.PAGADO);
        System.out.println("");
    }
}
