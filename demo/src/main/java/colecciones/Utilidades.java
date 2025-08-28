package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Utilidades {
    // Método genérico para filtrar
    public static <T> List<T> filtrar(List<T> lista, Predicate<T> condicion) {
        List<T> resultado = new ArrayList<>();
        for (T elem : lista) {
            if (condicion.test(elem)) {
                resultado.add(elem);
            }
        }
        return resultado;
    }
}
