package CasoPractico;

import java.util.List;
/**
 *
 * @author Carlos German Zapatta
 * 
 */
public class Buscador<T extends Identificable<K>, K> {

    public T buscarPorId(List<T> lista, K id) {
        for (T elemento : lista) {
            if (elemento.getId().equals(id)) {
                return elemento;
            }
        }
        return null;
    }

    public static <T extends Identificable<K>, K> T buscarConComodin(List<? extends T> lista, K id) {
        for (T elemento : lista) {
            if (elemento.getId().equals(id)) {
                return elemento;
            }
        }
        return null;
    }

    public void mostrarListaConComodin(List<? extends Identificable<?>> lista) {
        for (Identificable<?> elem : lista) {
            System.out.println(elem);
        }
    }
}
