package CasoPractico;

import java.util.Comparator;
/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class PedidoPorFecha implements Comparator<Pedido> {
    @Override
    public int compare(Pedido p1, Pedido p2) {
        return p1.getFecha().compareTo(p2.getFecha());
    }
}
