import java.util.HashSet;

class Pedido {
    private int id;
    private String cliente;

    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    // Sobrescribe equals y hashCode para que HashSet detecte duplicados correctamente
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pedido pedido = (Pedido) obj;
        return id == pedido.id && cliente.equals(pedido.cliente);
    }

    @Override
    public int hashCode() {
        return id * 31 + cliente.hashCode();
    }

    @Override
    public String toString() {
        return "Pedido{id=" + id + ", cliente='" + cliente + "'}";
    }
}

public class PedidosHashSetDemo {
    public static void main(String[] args) {
        HashSet<Pedido> pedidos = new HashSet<>();

        // Inserta pedidos, incluyendo duplicados
        pedidos.add(new Pedido(1, "Juan"));
        pedidos.add(new Pedido(2, "Ana"));
        pedidos.add(new Pedido(1, "Juan")); // Duplicado
        pedidos.add(new Pedido(3, "Luis"));
        pedidos.add(new Pedido(2, "Ana")); // Duplicado

        // Imprime el contenido del HashSet
        System.out.println("Contenido del HashSet:");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }
}