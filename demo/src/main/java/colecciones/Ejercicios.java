package colecciones;

import modelo.Pedido;
import java.util.*;

public class Ejercicios {
    
    // Parte A - ArrayList
    public static void parteA_ArrayList() {
        System.out.println("=== PARTE A - ArrayList ===");
        
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, "Juan", "Hamburguesa", 25.0));
        pedidos.add(new Pedido(2, "Maria", "Pizza", 35.0));
        pedidos.add(new Pedido(3, "Carlos", "Ensalada", 15.0));
        pedidos.add(new Pedido(4, "Ana", "Pizza", 45.0));
        pedidos.add(new Pedido(5, "Luis", "Sushi", 60.0));
        
        System.out.println("1. Pedidos iniciales:");
        pedidos.forEach(System.out::println);
        
        pedidos.add(0, new Pedido(6, "Urgente1", "Pizza", 50.0));
        pedidos.add(0, new Pedido(7, "Urgente2", "Hamburguesa", 30.0));
        
        System.out.println("\n2. Después de agregar pedidos urgentes:");
        pedidos.forEach(System.out::println);
    }
    
    // Parte A - LinkedList
    public static void parteA_LinkedList() {
        System.out.println("\n=== PARTE A - LinkedList ===");
        
        List<Pedido> pedidos = new LinkedList<>();
        pedidos.add(new Pedido(1, "Juan", "Hamburguesa", 25.0));
        pedidos.add(new Pedido(2, "Maria", "Pizza", 35.0));
        pedidos.add(new Pedido(3, "Carlos", "Ensalada", 15.0));
        pedidos.add(new Pedido(4, "Ana", "Pizza", 45.0));
        pedidos.add(new Pedido(5, "Luis", "Sushi", 60.0));
        
        System.out.println("1. Pedidos iniciales:");
        pedidos.forEach(System.out::println);
        
        pedidos.add(0, new Pedido(6, "Urgente1", "Pizza", 50.0));
        pedidos.add(0, new Pedido(7, "Urgente2", "Hamburguesa", 30.0));
        
        System.out.println("\n2. Después de agregar pedidos urgentes:");
        pedidos.forEach(System.out::println);
        
        System.out.println("\n3. Explicación: Para 1000 pedidos urgentes, LinkedList es más eficiente");
        System.out.println("   porque insertar al inicio es O(1), mientras que en ArrayList es O(n)");
    }

    // Parte B - HashSet
    




















    // Parte C - HashMap
    public static void parteC_HashMap() {
        System.out.println("\n=== PARTE C - HashMap ===");

        Map<String, List<Pedido>> pedidosPorCliente = new HashMap<>();

        pedidosPorCliente.put("Juan", Arrays.asList(
                new Pedido(10, "Juan", "Pizza", 40.0),
                new Pedido(11, "Juan", "Hamburguesa", 30.0)
        ));
        pedidosPorCliente.put("Ana", Arrays.asList(
                new Pedido(12, "Ana", "Taco", 15.0),
                new Pedido(13, "Ana", "Ensalada", 25.0)
        ));
        pedidosPorCliente.put("Luis", Arrays.asList(
                new Pedido(14, "Luis", "Pizza", 55.0),
                new Pedido(15, "Luis", "Sushi", 70.0)
        ));

        System.out.println("Pedidos de Juan:");
        pedidosPorCliente.get("Juan").forEach(System.out::println);

        System.out.println("\nTotales por cliente:");
        for (String cliente : pedidosPorCliente.keySet()) {
            double total = pedidosPorCliente.get(cliente).stream()
                                .mapToDouble(Pedido::getTotal)
                                .sum();
            System.out.println(cliente + " gastó $" + total);
        }
    }

    // Parte D - Genéricos con Utilidades
    public static void parteD_Genericos() {
        System.out.println("\n=== PARTE D - Genéricos ===");

        List<Pedido> pedidos = Arrays.asList(
                new Pedido(1, "Juan", "Pizza", 40.0),
                new Pedido(2, "Maria", "Hamburguesa", 25.0),
                new Pedido(3, "Carlos", "Pizza", 55.0),
                new Pedido(4, "Ana", "Sushi", 70.0),
                new Pedido(5, "Luis", "Ensalada", 20.0)
        );

        // (a) Pedidos de Pizza
        List<Pedido> pizzas = Utilidades.filtrar(pedidos, p -> p.getProducto().equals("Pizza"));
        System.out.println("Pedidos de Pizza:");
        pizzas.forEach(System.out::println);

        // (b) Pedidos con total > 50
        List<Pedido> mayores50 = Utilidades.filtrar(pedidos, p -> p.getTotal() > 50);
        System.out.println("\nPedidos con total mayor a $50:");
        mayores50.forEach(System.out::println);
    }
}
