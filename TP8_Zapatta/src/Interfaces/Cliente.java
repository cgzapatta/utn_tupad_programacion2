package Interfaces;
/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void notificarCambioDeEstado(EstadoPedido estado) {
        System.out.println("Cliente " + nombre + " notificado: El pedido cambio a " + estado);
    }
}
