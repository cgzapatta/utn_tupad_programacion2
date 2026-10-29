package Interfaces;
/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class PagoConPayPal implements PagoConDescuento {

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95;
    }

    @Override
    public void procesarPago(double monto) {
        double totalConDescuento = aplicarDescuento(monto);
        System.out.println("Procesando pago con PayPal: $" + totalConDescuento);
    }
}
