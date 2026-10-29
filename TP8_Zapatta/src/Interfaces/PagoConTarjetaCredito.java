package Interfaces;
/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class PagoConTarjetaCredito implements PagoConDescuento {

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90;
    }

    @Override
    public void procesarPago(double monto) {
        double totalConDescuento = aplicarDescuento(monto);
        System.out.println("Procesando pago con Tarjeta de Credito: $" + totalConDescuento);
    }
}
